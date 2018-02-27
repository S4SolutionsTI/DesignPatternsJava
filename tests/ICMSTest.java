import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ICMSTest {

    @Test
    void test() {
	double value = 3.14;
	Budget budget = new Budget(value);
	ICMS icms = new ICMS();
	double icmsValue = icms.calculate(budget);
	assertEquals(value * 0.1, icmsValue);
    }

}
