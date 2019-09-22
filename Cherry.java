package csce247.DecoratorHW;

public class Cherry extends ToppingsDecorator {
	IceCream iceCream;
	
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String getDescription() { return iceCream.getDescription() + " + a cherry on top"; }//adds on description
	
	public double getCost() {
		return iceCream.getCost() + 0.4;
	}//adds cost
}
