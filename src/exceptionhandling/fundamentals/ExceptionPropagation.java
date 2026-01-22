package exceptionhandling.fundamentals;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("Main starts.");

		try {
			methodA();
		} catch (Exception e) {
			System.out.println("Main caught the exception: " + e.getMessage());
		}

		System.out.println("Main ends gracefully.");
	}

	public static void methodA() {
		System.out.println("Method A called.");
		methodB(); // Method A doesn't handle the error; it passes it up to Main
	}

	public static void methodB() {
		System.out.println("Method B called.");
		// The explosion happens here!
		throw new RuntimeException("Crash in Method B!");
	}
}