package strings.basics.methods;

public class IntermediateStringMethods {
	public static void main(String[] args) {

		System.out.println("--- 1. Sorting Logic (compareTo) ---");
		// Used heavily in sorting algorithms.
		// Returns:
		// 0 if equal
		// <0 if s1 comes BEFORE s2 (Alphabetically)
		// >0 if s1 comes AFTER s2 (Alphabetically)

		String s1 = "Apple";
		String s2 = "Banana";
		String s3 = "Apple";

		System.out.println(s1.compareTo(s2)); // Negative (A is smaller than B)
		System.out.println(s2.compareTo(s1)); // Positive (B is bigger than A)
		System.out.println(s1.compareTo(s3)); // 0 (Equal)

		System.out.println("\n--- 2. Advanced Searching ---");
		String text = "banana";

		// standard indexOf (Finds the first 'a')
		int firstIndex = text.indexOf('a');

		// Overloaded indexOf (Start looking AFTER the first found 'a')
		int secondIndex = text.indexOf('a', firstIndex + 1);

		// lastIndexOf (Start looking from the END)
		int lastIndex = text.lastIndexOf('a');

		System.out.println("First 'a': " + firstIndex); // 1
		System.out.println("Second 'a': " + secondIndex);// 3
		System.out.println("Last 'a': " + lastIndex); // 5

		System.out.println("\n--- 3. Pattern Replacement (Regex) ---");
		String messyData = "User: John_Doe | ID: #9921 | Status: ACTIVE";

		// .replace() changes specific text
		System.out.println(messyData.replace("|", "-"));

		// .replaceAll() uses REGEX (Regular Expressions)
		// Example: Remove everything that is NOT a digit (0-9)
		String onlyNumbers = messyData.replaceAll("[^0-9]", "");
		System.out.println("Extracted ID: " + onlyNumbers); // "9921"

		System.out.println("\n--- 4. Joining Strings (Opposite of Split) ---");
		// Useful for converting an array back into a CSV or sentence
		String[] words = { "Java", "is", "awesome" };

		// Join with a delimiter (space, comma, etc.)
		String sentence = String.join(" ", words);
		String csv = String.join(",", words);

		System.out.println("Sentence: " + sentence); // "Java is awesome"
		System.out.println("CSV: " + csv); // "Java,is,awesome"

		System.out.println("\n--- 5. String Formatting ---");
		// Instead of messy concatenation: "Name: " + name + ", Age: " + age...
		// Use placeholders: %s (String), %d (Integer), %.2f (2 decimal Float)

		String product = "Laptop";
		double price = 1250.50;

		String label = String.format("Product: %s | Cost: $%.2f", product, price);
		System.out.println(label);
		// Output: "Product: Laptop | Cost: $1250.50"
	}
}