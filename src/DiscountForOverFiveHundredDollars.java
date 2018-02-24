
public class DiscountForOverFiveHundredDollars implements Discount {

    @Override
    public double discount(Budget budget) {
	if (budget.getValue() > 500) {
	    return budget.getValue() * 0.07;
	}
	
	return 0;
    }

    @Override
    public void setNext(Discount discount) {
	// TODO Auto-generated method stub

    }

}
