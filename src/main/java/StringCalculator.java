import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int calculate(String input) {
        String[] split = input.split("\\+");

        List<Integer> list = new ArrayList<>();

        for (String s : split) {
            //22, 33
            list.add(Integer.parseInt(s));
        }

        return list.get(0) + list.get(1);
    }
}
