
public class TaxCalculator {

    private Budget budget;

    public TaxCalculator(Budget budget) {
	this.budget = budget;
    }

    public void doCalculate(Budget budget, String tax) {

	if (tax.equals("ICMS")) {
	    double icms = budget.getValue() * 0.1;
	    System.out.println(icms);
	} else if (tax.equals("ISS")) {
	    double iss = budget.getValue() * 0.6;
	    System.out.println(iss);
	}
    }

}
