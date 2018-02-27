
public abstract class Tax {
    protected final Tax otherTax;

    public Tax(Tax otherTax) {
	this.otherTax = otherTax;
    }

    public abstract double calculate(Budget budget);
}
