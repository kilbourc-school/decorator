package csce247.DecoratorHW;

public class VanillaIceCream extends IceCream {
	
	public VanillaIceCream() {
		this.description = "Vanilla Ice Cream";
	}//sets base description
	
	public double getCost() {
		return 0.75;
	}//sets base cost
}
