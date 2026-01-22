package strings.basics.methods;

public class BasicsStringMethods {
	public static void main(String[] args) {

		System.out.println("--- 1. Smart Comparison ---");
		String correctPass = "Admin123";
		String userInput = "admin123";

		// .equals() is strict (returns false)
		System.out.println("Strict check: " + correctPass.equals(userInput));

		// .equalsIgnoreCase() is flexible (returns true)
		System.out.println("Flexible check: " + correctPass.equalsIgnoreCase(userInput));

		System.out.println("\n--- 2. Content Checks ---");
		String filename = "report_2024.pdf";

		// .startsWith(): Check prefix
		if (filename.startsWith("report")) {
			System.out.println("This is a report file.");
		}

		// .endsWith(): Check suffix (Great for file extensions)
		if (filename.endsWith(".pdf")) {
			System.out.println("This is a PDF document.");
		}

		// .contains(): Check if text exists anywhere inside
		String sentence = "The quick brown fox";
		boolean hasFox = sentence.contains("fox"); // true
		boolean hasDog = sentence.contains("dog"); // false
		System.out.println("Has fox? " + hasFox);
		System.out.println("Has dog? " + hasDog);

		System.out.println("\n--- 3. Validation (Empty vs Null) ---");
		String emptyString = "";
		String blankString = "   "; // Contains spaces only

		// .isEmpty() checks if length is 0
		System.out.println("Is emptyString empty? " + emptyString.isEmpty()); // true
		System.out.println("Is blankString empty? " + blankString.isEmpty()); // false (spaces count as chars!)

		// NOTE: Always check for null BEFORE checking isEmpty() to avoid crashes
		// if (str != null && !str.isEmpty()) { ... }

		System.out.println("\n--- 4. Conversion (String <-> Array) ---");
		String word = "Code";

		// Convert String to Char Array (Editable!)
		char[] letters = word.toCharArray();

		// Now we can access it like a normal array
		System.out.println("Array index 0: " + letters[0]); // 'C'

		// Convert other types TO String using String.valueOf()
		int number = 100;
		double price = 99.99;
		String numText = String.valueOf(number); // Converts 100 -> "100"
		String priceText = String.valueOf(price); // Converts 99.99 -> "99.99"

		System.out.println("Normal number: " + priceText);
		System.out.println("Converted number: " + numText);
	}
}