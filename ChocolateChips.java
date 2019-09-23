package csce247.DecoratorHW;

public class ChocolateChips extends ToppingsDecorator {
	IceCream iceCream;
	
	public ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String toString() {
		return iceCream.toString() + " + chocolate chips";
	}//adds on description
	
	public double getCost() {
		return iceCream.getCost() + 0.3;
	}//adds cost
}
