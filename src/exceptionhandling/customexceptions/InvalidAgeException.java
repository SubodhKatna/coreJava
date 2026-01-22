package exceptionhandling.customexceptions;

// 1. Extend the parent 'Exception' class
public class InvalidAgeException extends Exception {

	// 2. Constructor that accepts a custom error message
	public InvalidAgeException(String message) {
		// 3. Pass the message up to the parent (Throwable) so we can print it later
		super(message);
	}
}