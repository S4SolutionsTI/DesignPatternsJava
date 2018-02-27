
public class ISS extends Tax{///

    public ISS(Tax otherTax) {
	super(otherTax);
	// TODO Auto-generated constructor stub
    }

    public double calculate(Budget budget) {
	return budget.getValue() * 0.6;
    }

}
