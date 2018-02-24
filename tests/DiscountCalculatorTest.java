import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

    @Test
    void test() {
	double value = 3.14;
	Budget budget = new Budget(value);
	DiscountCalculator calc = new DiscountCalculator();
	budget.addItem(new Item("Pen", 5.43));
	budget.addItem(new Item("Pencil", 3.43));
	double d = calc.calculate(budget);

    }

}
