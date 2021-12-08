import java.util.ArrayList;
import java.util.List;

public class StringCalcluatorNew {
    public int calculate(String input) {
        String[] value_buf = input.split( "\\D",input.length()-1);
        String[] operator_buf = input.split( "\\d");
        String[] operator_cmp = {"+","-","*","/","X"};

        int idx= 0;
        int result = 0;
        int oper_idx = 0;
        int cnt = 0;

        List<Integer> list = new ArrayList<>();

        for (String s : value_buf) {
            list.add(Integer.parseInt(s));
        }

        for (String i : operator_buf) {
            if(operator_buf[idx].equals(operator_cmp[0]) || operator_buf[idx].equals(operator_cmp[1]) ||operator_buf[idx].equals(operator_cmp[2]) ||operator_buf[idx].equals(operator_cmp[3])){
                operator_buf[oper_idx] = operator_buf[idx];
                operator_buf[idx] = operator_cmp[4];
                oper_idx++;
            }
                idx++;
            }

        idx = 0;

        result += list.get(0);

        for (String s : value_buf) {
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
                //No Op
            }
        }
        System.out.println("Result:"+ result);
        return result;
    }
}
