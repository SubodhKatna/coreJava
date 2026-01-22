package oops.polymorphism.compiletime;

public class OverloadingDemo {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// Java knows which method to pick based on the inputs!
		System.out.println("Result: " + calc.add(10, 20)); // Calls method 1
		System.out.println("Result: " + calc.add(10, 20, 30)); // Calls method 2
		System.out.println("Result: " + calc.add(5.5, 2.5)); // Calls method 3
	}
}