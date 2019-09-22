package csce247.DecoratorHW;

public abstract class IceCream {
	protected String description;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double getCost();//forced method
	
}
