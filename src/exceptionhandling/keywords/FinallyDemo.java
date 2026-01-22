package exceptionhandling.keywords;

public class FinallyDemo {
	public static void main(String[] args) {

		System.out.println("--- Connecting to Database ---");

		try {
			String data = null;
			System.out.println("Length: " + data.length()); // Throws NullPointerException
		} catch (NullPointerException e) {
			System.out.println("ERROR: Data was null.");
		} finally {
			// This runs 100% of the time.
			// Crucial for closing files, database connections, or scanners.
			System.out.println("FINALLY: Database connection closed.");
		}

		System.out.println("--- Program Continued ---");
	}
}