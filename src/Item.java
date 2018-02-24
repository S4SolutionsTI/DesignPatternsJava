
public class Item {
    private final String name;
    private final double value;
    /**
     * @param name
     * @param value
     */
    public Item(String name, double value) {
	this.name = name;
	this.value = value;
    }
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    /**
     * @return the value
     */
    public double getValue() {
        return this.value;
    }
    
    

}
