package csce247.assignments.decorator;
/**
 * VanillaIceCream.java - icecream type class 
 * @author Nguyen
 *
 */
public class VanillaIceCream extends IceCream{

	VanillaIceCream(){
		this.description = "VanillaIceCream";
	}
	public double getCost() {
		return 0.75;
	}
}
