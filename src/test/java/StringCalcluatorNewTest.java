import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;


public class StringCalcluatorNewTest {
    @Test
    public void testSum() {
        StringCalcluatorNew s = new StringCalcluatorNew();

        int calculate = s.calculate("222+333+44+5");

        assertThat(604).isEqualTo(calculate);
    }
}
