package oops.abstraction.abstractclasses;

public class Car extends Vehicle {

	public Car(String brand) {
		super(brand);
	}

	// We MUST implement this method, or Java will give a compile error.
	@Override
	public void startEngine() {
		System.out.println(brand + " starts by turning the Key.");
	}
}