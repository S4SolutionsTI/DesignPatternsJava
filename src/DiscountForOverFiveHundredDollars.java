
public class DiscountForOverFiveHundredDollars implements Discount {

    private Discount discount;

    @Override
    public double discount(Budget budget) {
	if (budget.getValue() > 500) {
	    return budget.getValue() * 0.07;
	}
	
	return discount.discount(budget);
    }

    @Override
    public void setNext(Discount discount) {
	this.discount = discount;

    }

}
