package csce247.assignments.decorator;
/**
 * IceCream.java - abstract class type that IceCream flavor inherits
 * @author Nguyen
 *
 */
public abstract class IceCream {
	protected String description;
	
	public String toString() {
		return description;
	}
	public abstract double getCost();
}
