import java.util.ArrayList;
import java.util.List;

public class StringCalcluatorNew {
    public int calculate(String input) {
        String[] value_buf = input.split( "\\D",input.length()-1);
        String[] operator_buf = input.split( "\\d");
        String[] operator_cmp = {"+","-","*","/","X"};

        System.out.println("operator1"+operator_buf[0]);
        System.out.println("operator1"+operator_buf[1]);
        System.out.println("operator1"+operator_buf[2]);
        System.out.println("operator1"+operator_buf[3]);

        int idx= 0;
        int result = 0;
        int oper_idx = 0;
        int cnt = 0;
        int[] value_len =  new int[value_buf.length];

        for (String s : value_buf) {
            value_len[cnt] = value_buf[cnt].length();
            cnt++;
        }

        System.out.println("len1 : "+value_len.length);
        System.out.println("len2 : "+value_len[0]);
        System.out.println("len3 : "+value_len[1]);

        List<Integer> list = new ArrayList<>();

        for (String s : value_buf) {
            list.add(Integer.parseInt(s));
        }

        for (int i : value_len) {
            System.out.println("idx"+idx);
            operator_buf[oper_idx] = operator_buf[value_len[0]+idx];
            operator_buf[value_len[0]+idx] = operator_cmp[4];
            oper_idx++;
            idx++;
            if(idx == value_len.length-1)
                break;
        }
        System.out.println("operator"+operator_buf[0]);
        System.out.println("operator"+operator_buf[1]);
        System.out.println("operator"+operator_buf[2]);
        System.out.println("operator"+operator_buf[3]);

        idx = 0;

        result += list.get(0);

        for (int i : value_len) {
            //22, 33
            idx++;
            if(operator_buf[idx-1].equals(operator_cmp[0])){
                result += list.get(idx);
            }
            else if(operator_buf[idx-1].equals(operator_cmp[1])){
                result -= list.get(idx);
            }
            else if(operator_buf[idx-1].equals(operator_cmp[2])){
                result *= list.get(idx);
            }
            else if(operator_buf[idx-1].equals(operator_cmp[3])){
                result /= list.get(idx);
            }
            else{

            }
            System.out.println("cnt"+idx+ " re: " + result);
        }
        return result;
    }
}
