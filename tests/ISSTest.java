import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ISSTest {

    @Test
    void test() {
	double value = 3.14;
	Budget budget = new Budget(value);
	ISS iss = new ISS();
	double issValue = iss.calculate(budget);
	assertEquals(value * 0.6, issValue);
	
    }

}
