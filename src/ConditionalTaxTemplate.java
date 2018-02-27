
public abstract class ConditionalTaxTemplate extends Tax {

    public ConditionalTaxTemplate(Tax otherTax) {
	super(otherTax);
	// TODO Auto-generated constructor stub
    }

    @Override
    public double calculate(Budget budget) {
	if (useMaximaTaxation(budget)) {
	    return maximaTaxation(budget);
	} else {
	    return minimiumTaxation(budget);
	}
    }
    
    public abstract boolean useMaximaTaxation(Budget budget);
    
    public abstract double maximaTaxation(Budget budget);
    
    public abstract double minimiumTaxation(Budget budget);

}
