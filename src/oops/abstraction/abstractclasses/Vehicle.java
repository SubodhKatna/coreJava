package oops.abstraction.abstractclasses;

// 'abstract' keyword prevents creating an object of this class directly
public abstract class Vehicle {

	String brand;

	// Abstract Constructor? Yes!
	// It runs when the Child is created (via super()) to initialize common data.
	public Vehicle(String brand) {
		this.brand = brand;
	}

	// --- 1. ABSTRACT METHOD (No Body) ---
	// We know every vehicle starts, but we don't know HOW (Key? Button? Kick?).
	// We force the child class to write this logic.
	public abstract void startEngine();

	// --- 2. CONCRETE METHOD (Has Body) ---
	// We know how all vehicles stop (cut power), so we write it once here.
	public void stopEngine() {
		System.out.println("Stopping the engine of " + brand);
	}
}