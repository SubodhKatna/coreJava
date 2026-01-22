package basics.variables;

public class VariablesDemo {
	public static void main(String[] args) {

		// 1. The 'char' variable (Single character in single quotes)
		char status = 'A'; // 'A' for Active, 'G' for Graduated, 'I' for Inactive

		// 2. The 'boolean' variable (Only true or false)
		boolean isEnrolled = true;

		// Printing the variables
		System.out.println("Current Student Status: " + status);
		System.out.println("Is the student currently enrolled? " + isEnrolled);

		// We can update them as things change
		status = 'G'; // Student graduated
		isEnrolled = false; // They are no longer enrolled

		System.out.println("\n--- Update ---");
		System.out.println("New Status: " + status);
		System.out.println("Enrolled: " + isEnrolled);
	}
}