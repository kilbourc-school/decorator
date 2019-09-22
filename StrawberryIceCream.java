package csce247.DecoratorHW;

public class StrawberryIceCream extends IceCream {

	public StrawberryIceCream() {
		this.description = "Strawberry Ice Cream";
	}//sets base description
	
	public double getCost() {
		return 0.8;
	}//sets base cost
}
