package exceptionhandling.customexceptions;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		System.out.println("--- Voting System Started ---");

		try {
			// Scenario 1: Valid User
			validateVoter(25);

			// Scenario 2: Invalid User (This will trigger our custom error)
			validateVoter(15);

		} catch (InvalidAgeException e) {
			// We catch our SPECIFIC custom error here
			System.out.println("caught CUSTOM EXCEPTION: " + e.getMessage());

			// Optional: Print the full stack trace for debugging
			// e.printStackTrace();
		}

		System.out.println("--- Voting System Ended ---");
	}

	// This method declares it might throw our custom exception
	public static void validateVoter(int age) throws InvalidAgeException {

		if (age < 18) {
			// Logic: If age is too low, STOP and throw our custom error
			throw new InvalidAgeException("Age " + age + " is not eligible to vote!");
		} else {
			System.out.println("Welcome to the voting booth! (Age: " + age + ")");
		}
	}
}