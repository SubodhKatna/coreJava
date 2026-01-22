package strings.basics;

public class StringBasics {
	public static void main(String[] args) {

		String text = "Java Programming";

		// 1. Length: How many characters? (Includes spaces!)
		int size = text.length();
		System.out.println("Length: " + size); // Output: 16

		// 2. Character Access: Get specific letter
		char firstLetter = text.charAt(0);
		char lastLetter = text.charAt(text.length() - 1);
		System.out.println("First: " + firstLetter + ", Last: " + lastLetter);

		// 3. Index Of: Find where a word starts
		int position = text.indexOf("Prog");
		System.out.println("'Prog' starts at index: " + position); // Output: 5

		// 4. Case Conversion (Useful for normalizing input)
		System.out.println(text.toUpperCase()); // "JAVA PROGRAMMING"
		System.out.println(text.toLowerCase()); // "java programming"
	}
}