import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountForOverFiveHundredDollarsTest {

    @Test
    void test() {
	Discount discount = new DiscountForOverFiveHundredDollars();
	double value = 3.14;
	Budget budget = new Budget(value);
	String name = "Jose";
	double valueItem = 600.0;
	Item i = new Item(name, valueItem);
	budget.addItem(i);
	budget.addItem(i);
	budget.addItem(i);
	budget.addItem(i);
	budget.addItem(i);
	budget.addItem(i);
	discount.setNext(new DiscountForFiveItems());
	double d = discount.discount(budget);
	assertEquals(d, value *0.1);
    }

}
