package strings.operations;

public class StringOperations {
	public static void main(String[] args) {

		// Scenario: We received messy data from a user or database
		String rawInput = "   User_James_Bond_007   ";

		System.out.println("Original: '" + rawInput + "'");

		System.out.println("\n--- 1. Cleaning (trim) ---");
		// Problem: The string has useless spaces at the start and end.
		// Solution: .trim() removes leading/trailing whitespace.
		// NOTE: Strings are Immutable! We MUST save the result to a new variable.
		String trimmed = rawInput.trim();

		System.out.println("Trimmed:  '" + trimmed + "'");
		// Result: "User_James_Bond_007"

		System.out.println("\n--- 2. Extraction (substring) ---");
		// Problem: We only want the name part "James_Bond", not the prefix "User_".
		// Logic: "User_" is 5 characters long. We start at index 5.
		// We stop before the last 4 characters ("_007").

		int startIndex = 5;
		int endIndex = trimmed.length() - 4; // Total length - 4

		String extracted = trimmed.substring(startIndex, endIndex);

		System.out.println("Extracted: " + extracted);
		// Result: "James_Bond"

		System.out.println("\n--- 3. Modification (replace) ---");
		// Problem: We want a clean name with spaces, not underscores.
		// Solution: Replace all occurrences of "_" with " ".
		String cleanName = extracted.replace("_", " ");

		System.out.println("Cleaned:   " + cleanName);
		// Result: "James Bond"

		System.out.println("\n--- 4. Formatting (toUpperCase) ---");
		// Problem: We want to store it in a standard format (All Caps).
		String finalName = cleanName.toUpperCase();

		System.out.println("Final:     " + finalName);
		// Result: "JAMES BOND"

		System.out.println("\n--- 5. Searching (indexOf) ---");
		// Problem: Where is the space located now?
		int spaceLocation = finalName.indexOf(" ");
		System.out.println("Space is at index: " + spaceLocation);
	}
}