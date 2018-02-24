
public class TaxCalculator {

    private Budget budget;

    public TaxCalculator(Budget budget) {
	this.budget = budget;
    }

    public void doCalculate(Budget budget, Tax tax) {

	double value = tax.calculate(budget);
	System.out.println(value);
    }

}
