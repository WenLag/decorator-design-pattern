package csce247.assignments.decorator;
/**
 * ChocolateIceCream.java - Ice cream type that extends Ice Cream
 * @author Nguyen
 *
 */
public class ChocolateIceCream extends IceCream{
	
	ChocolateIceCream(){
		this.description = "ChocolateIceCream";
	}
	public double getCost() {
		return 0.9;
	}
}
