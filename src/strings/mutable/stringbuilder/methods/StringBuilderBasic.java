package strings.mutable.stringbuilder.methods;

public class StringBuilderBasic {
	public static void main(String[] args) {

		// 1. Constructors
		StringBuilder sb2 = new StringBuilder("Hello"); // Init with string

		System.out.println("--- 1. Appending (Adding to end) ---");
		// You can append ANY data type
		sb2.append(" World"); // String
		sb2.append('!'); // Char
		sb2.append(2024); // Int

		System.out.println("Result: " + sb2); // "Hello World!2024"

		System.out.println("\n--- 2. Length vs Capacity ---");
		// Length = Actual characters used
		// Capacity = Total storage allocated (Backing Array size)
		System.out.println("Length: " + sb2.length());
		System.out.println("Capacity: " + sb2.capacity());

		System.out.println("\n--- 3. Exporting ---");
		// Convert back to immutable String when done
		String finalString = sb2.toString();
		System.out.println("Final String: " + finalString);
	}
}