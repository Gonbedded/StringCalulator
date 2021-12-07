import java.util.Scanner;

public class StringCalculatorOld {
    private final static int SUM = 1;
    private final static int SUB = 2;
    private final static int MUL = 3;
    private final static int DIV = 4;

    private static int[] opr_buf = new int[10];
    private static int[] val_buf = new int[10];
    private static int val_cnt = 0;

    public String inputdata(){
        System.out.println(" Input: ");
        Scanner input = new Scanner(System.in);
        return input.next() ;
    }
    public int calculation(){
        int cnt = 8;
        int result = 0;
        result = val_buf[0];

        for(cnt = 0; cnt < val_cnt ; cnt++){
            switch(opr_buf[cnt]){
                case SUM:
                    result = result + val_buf[cnt+1];
                    break;
                case SUB:
                    result = result - val_buf[cnt+1];
                    break;
                case MUL:
                    result = result * val_buf[cnt+1];
                    break;
                case DIV:
                    result = result / val_buf[cnt+1];
                    break;
                default:
                    break;
            }
        }
        return result;
    }
    public void split_string(String input){
        int cnt = 0;
        int char_cnt = 0;

        char[] buf = new char[10];
        char[] char_input = input.toCharArray();

        for(cnt = 0; cnt < input.length() ; cnt++){
            switch(char_input[cnt]){
                case '+':
                    opr_buf[val_cnt] = SUM;
                    val_buf[val_cnt] = Integer.parseInt(String.valueOf(buf,0,char_cnt));
                    char_cnt = 0;
                    val_cnt++;
                    break;
                case '-':
                    opr_buf[val_cnt] = SUB;
                    val_buf[val_cnt] = Integer.parseInt(String.valueOf(buf,0,char_cnt));
                    char_cnt = 0;
                    val_cnt++;
                    break;
                case '*':
                    opr_buf[val_cnt] = MUL;
                    val_buf[val_cnt] = Integer.parseInt(String.valueOf(buf,0,char_cnt));
                    char_cnt = 0;
                    val_cnt++;
                    break;
                case '/':
                    opr_buf[val_cnt] = DIV;
                    val_buf[val_cnt] = Integer.parseInt(String.valueOf(buf,0,char_cnt));
                    char_cnt = 0;
                    val_cnt++;
                    break;
                default:
                    buf[char_cnt] = char_input[cnt];
                    val_buf[val_cnt] = Integer.parseInt(String.valueOf(buf,0,char_cnt+1));
                    char_cnt++;
                    break;
            }
        }
    }

    public static void main(String[] args){
        int cnt = 0;
        StringCalculatorOld stringcalculator = new StringCalculatorOld();

        String s = stringcalculator.inputdata();
        stringcalculator.split_string(s);
        System.out.println(s + " = " + stringcalculator.calculation() );
    }
}



