package csce247.assignments.decorator;

public class ChocolateIceCream extends IceCream{
	
	ChocolateIceCream(){
		this.description = "ChocolateIceCream";
	}
	public double getCost() {
		return 0.9;
	}
}
