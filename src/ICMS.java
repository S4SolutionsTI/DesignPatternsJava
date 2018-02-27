
public class ICMS extends Tax{

    public ICMS(Tax otherTax) {
	super(otherTax);
    }

    public ICMS() {
	super();
    }

    public double calculate(Budget budget) {
	return budget.getValue() * 0.1;
    }
    
}
