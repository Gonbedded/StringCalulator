import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;


public class StringCalcluatorNewTest {
    @Test
    public void testSum() {
        StringCalcluatorNew s = new StringCalcluatorNew();

        int calculate = s.calculate("123+3+4");

        assertThat(10).isEqualTo(calculate);
    }
}
