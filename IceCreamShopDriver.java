package csce247.DecoratorHW;

public class IceCreamShopDriver {
	public static void main(String[] args) {
		IceCream vanillaIce = new VanillaIceCream();
		vanillaIce = new Sprinkles(vanillaIce);
		vanillaIce = new Cherry(vanillaIce);
		
		IceCream chocIce = new ChocolateIceCream();
		chocIce = new ChocolateChips(chocIce);
		
		System.out.println("******** Ice Cream Shop *******");
		
		System.out.println("I would like to order, 2 Ice Creams:");


		//uhhh well this just outputs the address, so im guessing you meant to do it with .getDescription. sorry for editing driver <3
		//System.out.println(vanillaIce);
		//System.out.println(chocIce);

		//correct output
		System.out.println(vanillaIce.getDescription());
		System.out.println(chocIce.getDescription());
	}
}
