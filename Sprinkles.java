package csce247.DecoratorHW;

public class Sprinkles extends ToppingsDecorator {
	IceCream iceCream;
	
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	public String getDescription() {
		return iceCream.getDescription() + " + sprinkles";
	}//adds on description
	
	public double getCost() {
		return iceCream.getCost() + 0.2;
	}//adds cost
}
