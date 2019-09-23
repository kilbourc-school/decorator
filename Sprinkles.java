package csce247.DecoratorHW;

public class Sprinkles extends ToppingsDecorator {
	IceCream iceCream;
	
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	public String toString() {
		return iceCream.toString() + " + sprinkles";
	}//adds on description
	
	public double getCost() {
		return iceCream.getCost() + 0.2;
	}//adds cost
}
