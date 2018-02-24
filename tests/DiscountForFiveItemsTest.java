import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DiscountForFiveItemsTest {

    @Test
    void test() {
	Discount discount = new DiscountForFiveItems();
	double value = 3.14;
	Budget budget = new Budget(value);
	double d = discount.discount(budget);
	assertEquals(d, value *0.1);
    }

}
