import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {
    private final double value;
    private final List<Item> items;

    public Budget(double value) {
	this.value = value;
	this.items = new ArrayList<Item>();

    }

    /**
     * @return the value
     */
    public double getValue() {
	return this.value;
    }

    public List<Item> getItems() {
	return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
	items.add(item);
    }

}
