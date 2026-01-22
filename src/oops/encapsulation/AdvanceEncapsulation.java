package oops.encapsulation;

public class AdvanceEncapsulation {
	public static void main(String[] args) {

		System.out.println("--- Creating User ---");
		// Initialize with valid data
		User user1 = new User(101, "JavaDev", "secret123", 25);

		// --- 1. Testing Read-Only Fields ---
		System.out.println("User ID: " + user1.getUserId());
		System.out.println("Username: " + user1.getUsername());

		// Note: Trying to do user1.setUserId(999) would fail to compile,
		// so it is omitted here to keep the code error-free.

		// --- 2. Testing Validation ---
		System.out.println("\n--- Updating Age ---");

		// Scenario A: Invalid Age
		System.out.print("Attempting to set age to -5: ");
		user1.setAge(-5);
		System.out.println("Current Age: " + user1.getAge()); // Should remain 25

		// Scenario B: Valid Age
		System.out.print("Attempting to set age to 26: ");
		user1.setAge(26);
		System.out.println("Current Age: " + user1.getAge()); // Should become 26

		// --- 3. Testing Write-Only (Security) ---
		System.out.println("\n--- Password Security ---");

		// Scenario A: Weak Password
		System.out.print("Setting weak password: ");
		user1.setPassword("123");

		// Scenario B: Strong Password
		System.out.print("Setting strong password: ");
		user1.setPassword("NewSecurePass789");

		// Note: We cannot print user1.getPassword() because it doesn't exist.
		System.out.println("Password operation complete.");
	}
}
