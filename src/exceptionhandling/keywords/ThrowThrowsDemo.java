package exceptionhandling.keywords;

public class ThrowThrowsDemo {

	// Main method handles the 'warning' sent by checkAge
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (Exception e) {
			System.out.println("Caught Alert: " + e.getMessage());
		}
	}

	// 'throws': WARNING sign. Tells compiler "This method might explode."
	public static void checkAge(int age) throws Exception {
		if (age < 18) {
			// 'throw': ACTION. Manually creating the error object.
			throw new Exception("Access Denied: Age must be 18+");
		} else {
			System.out.println("Access Granted.");
		}
	}
}