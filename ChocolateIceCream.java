package csce247.DecoratorHW;

public class ChocolateIceCream extends IceCream {

	public ChocolateIceCream() {
		this.description = "Chocolate Ice Cream";
	}//sets base description
	
	public double getCost() {
		return 0.9;
	}//sets base cost
}
