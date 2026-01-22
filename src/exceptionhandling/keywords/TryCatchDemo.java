package exceptionhandling.keywords;

public class TryCatchDemo {
	public static void main(String[] args) {

		System.out.println("--- Program Start ---");

		try {
			// Risky Code: Division by zero
			int a = 10;
			int b = 0;
			int result = a / b;
			System.out.println("Result: " + result); // This line is skipped
		} catch (ArithmeticException e) {
			// Safety Net: This runs only if the specific error occurs
			System.out.println("ERROR CAUGHT: Cannot divide by zero.");
		}

		System.out.println("--- Program End (Success) ---");
	}
}