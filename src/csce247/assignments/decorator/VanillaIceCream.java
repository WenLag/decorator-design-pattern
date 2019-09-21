package csce247.assignments.decorator;

public class VanillaIceCream extends IceCream{

	VanillaIceCream(){
		this.description = "VanillaIceCream";
	}
	public double getCost() {
		return 0.75;
	}
}
