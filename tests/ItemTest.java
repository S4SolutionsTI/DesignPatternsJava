import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    void test() {
	String name = "Jose";
	double value = 3.14;
	Item item = new Item(name, value);
	assertEquals(name, item.getName());
	assertEquals(value, item.getValue());
    }

}
