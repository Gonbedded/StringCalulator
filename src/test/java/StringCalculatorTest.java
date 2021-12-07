import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    @Test
    public void testSum() {
        StringCalculator s = new StringCalculator();
        int calculate = s.calculate("21+33");

        assertThat(55).isEqualTo(calculate);
    }
}
