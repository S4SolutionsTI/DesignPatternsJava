import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BudgetTest {

    @Test
    void testGetValor() {
	double value = 3.14;
	Budget orc = new Budget(value);
	assertEquals(value, orc.getValue());
    }

}
