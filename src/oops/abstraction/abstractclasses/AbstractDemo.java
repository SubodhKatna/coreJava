package oops.abstraction.abstractclasses;

public class AbstractDemo {
	public static void main(String[] args) {

		// Vehicle v = new Vehicle("Generic"); // ERROR: Cannot instantiate Abstract
		// Class

		System.out.println("--- Car ---");
		Vehicle myCar = new Car("Toyota");
		myCar.startEngine(); // Runs Car's specific logic
		myCar.stopEngine(); // Runs Vehicle's common logic

		System.out.println("\n--- Motorcycle ---");
		Vehicle myBike = new Motorcycle("Yamaha");
		myBike.startEngine(); // Runs Motorcycle's specific logic
		myBike.stopEngine(); // Runs Vehicle's common logic
	}
}