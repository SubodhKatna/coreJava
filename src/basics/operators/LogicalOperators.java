package basics.operators;

public class LogicalOperators {
	public static void main(String[] args) {

		boolean hasToken = true;
		boolean isEmailVerified = false;
		int age = 20;

		// 1. Logical AND (&&)
		// Returns true ONLY if BOTH sides are true.
		boolean canLogin = hasToken && isEmailVerified;
		System.out.println("Can Login (AND): " + canLogin); // false

		// 2. Logical OR (||)
		// Returns true if AT LEAST ONE side is true.
		boolean showWarning = hasToken || isEmailVerified;
		System.out.println("Show Warning (OR): " + showWarning); // true

		// 3. Logical NOT (!)
		// Reverses the boolean value (True becomes False, and vice versa).
		System.out.println("Opposite of isEmailVerified: " + !isEmailVerified); // true

		// --- Combining them in a real scenario ---

		// Rule: Must be 18+ AND (either have a token OR verified email)
		boolean isAccessGranted = (age >= 18) && (hasToken || isEmailVerified);

		System.out.println("Access Granted: " + isAccessGranted); // true
	}
}