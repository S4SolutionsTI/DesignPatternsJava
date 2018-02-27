
public abstract class Tax {
    protected final Tax otherTax;

    public Tax(Tax otherTax) {
	this.otherTax = otherTax;
    }
    
 // construtor default
    public Tax() {
      this.otherTax = null;
    }

    public abstract double calculate(Budget budget);
}
