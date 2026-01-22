package oops.abstraction.abstractclasses;

public class Motorcycle extends Vehicle {

	public Motorcycle(String brand) {
		super(brand);
	}

	@Override
	public void startEngine() {
		System.out.println(brand + " starts by Kick-starting.");
	}
}