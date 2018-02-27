
public class ISS extends Tax{///

    public ISS(Tax otherTax) {
	super(otherTax);
    }
    
    public ISS() {
	super();
    }

    public double calculate(Budget budget) {
	return budget.getValue() * 0.6;
    }

}
