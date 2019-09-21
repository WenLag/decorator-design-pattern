package csce247.assignments.decorator;
/**
 * StrawBerryIceCream.java - Ice Cream type that users can choose 
 * @author Nguyen
 *
 */
public class StrawberryIceCream extends IceCream{
	StrawberryIceCream(){
		this.description = "StrawberryIceCream";
	}
	public double getCost() {
		return 0.8;
	}
}
