
public class DiscountForFiveItems implements Discount{
    private Discount discount;
    
    @Override
    public double discount(Budget budget) {
	if (budget.getItems().size() > 5) {
	    return budget.getValue() * 0.1;
	}
	
	return discount.discount(budget);
    }

    @Override
    public void setNext(Discount discount) {
	this.discount = discount;
	
    }

}
