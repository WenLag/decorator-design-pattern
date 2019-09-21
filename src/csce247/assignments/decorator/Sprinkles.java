package csce247.assignments.decorator;
/**
 * Sprinkles.java - topping class
 * @author Nguyen
 *
 */
public class Sprinkles extends ToppingsDecorator {
	private IceCream iceCream;
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	public String toString() {
		return iceCream.toString() + " + sprinkles";
	}
	public double getCost() {
		return iceCream.getCost()+  0.2;
	}
}
