package oops.polymorphism.compiletime;

public class Calculator {

	// 1. Method with 2 integer parameters
	public int add(int a, int b) {
		System.out.println(">> Adding 2 integers");
		return a + b;
	}

	// 2. Method with 3 integer parameters (Different Number of Args)
	public int add(int a, int b, int c) {
		System.out.println(">> Adding 3 integers");
		return a + b + c;
	}

	// 3. Method with double parameters (Different Type of Args)
	public double add(double a, double b) {
		System.out.println(">> Adding 2 doubles");
		return a + b;
	}
}