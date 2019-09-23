package csce247.DecoratorHW;

public abstract class IceCream {
	protected String description;
	
	public String toString() {
		return description;
	}
	
	public abstract double getCost();//forced method
	
}
