package strings.mutable.stringbuffer.methods;

public class StringBufferBasicMethods {
	public static void main(String[] args) {

		// 1. Constructors
		StringBuffer sb = new StringBuffer(); // Empty
		StringBuffer sbText = new StringBuffer("Java"); // With Text

		// 2. append() - The workhorse
		// It is overloaded to accept almost any data type
		sbText.append(" 17"); // String
		sbText.append('L'); // Char
		sbText.append(true); // Boolean
		sb.append(false);

		System.out.println("Buffer Content: " + sbText); // "Java 17Ltrue"

		// 3. length() vs capacity()
		System.out.println("Length (Chars used): " + sbText.length());
		System.out.println("Capacity (Total space): " + sbText.capacity());

		// 4. toString() - Converting back to immutable String
		String finalOutput = sbText.toString();
		System.out.println("Final String: " + finalOutput);
	}
}