package csce247.assignments.decorator;

public class StrawberryIceCream extends IceCream{
	StrawberryIceCream(){
		this.description = "StrawberryIceCream";
	}
	public double getCost() {
		return 0.8;
	}
}
