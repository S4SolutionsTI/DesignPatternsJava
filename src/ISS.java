
public class ISS implements Tax{

    public double calculate(Budget budget) {
	return budget.getValue() * 0.6;
    }

}
