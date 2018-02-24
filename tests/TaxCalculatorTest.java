import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

    @Test
    void test() {
	double value = 3.14;
	String icms = "ICMS";
	String iss = "ISS";

	Budget budget = new Budget(value);
	TaxCalculator ci = new TaxCalculator(budget);
	ci.doCalculate(budget, icms);
	ci.doCalculate(budget, iss);
    }

}
