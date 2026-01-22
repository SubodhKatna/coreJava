package oops.objectClasses;

import java.util.Objects;

public class Laptop {
	String model;
	double price;

	public Laptop(String model, double price) {
		this.model = model;
		this.price = price;
	}

	// --- 1. toString() ---
	// Default: Prints "Laptop@4e50df2e" (Memory Address)
	// Goal: Print readable data like "Laptop [Model=Dell, Price=500]"
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}

	// --- 2. equals() ---
	// Default: Checks if two variables point to the exact SAME memory spot (==).
	// Goal: Check if the CONTENT (model & price) is the same.
	@Override
	public boolean equals(Object obj) {
		// Step 1: Same reference? True.
		if (this == obj)
			return true;

		// Step 2: Null or different class? False.
		if (obj == null || getClass() != obj.getClass())
			return false;

		// Step 3: Cast to Laptop and compare data
		Laptop other = (Laptop) obj;
		return Double.compare(this.price, other.price) == 0 && Objects.equals(this.model, other.model);
	}

	// --- 3. hashCode() ---
	// Contract: If equals() says two objects are same, their hashCode MUST be same.
	// We use Objects.hash() to generate a unique ID based on our data.
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
}