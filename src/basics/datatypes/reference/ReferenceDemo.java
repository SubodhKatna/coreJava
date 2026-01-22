package basics.datatypes.reference;

public class ReferenceDemo {
	public static void main(String[] args) {

		// 1. Strings are reference types
		String greeting = "Hello World";

		// Because it is an object, it has "methods" (tools)
		System.out.println("Length of text: " + greeting.length());
		System.out.println("In Uppercase: " + greeting.toUpperCase());

		// 2. The 'null' keyword
		// Primitives CANNOT be null. Reference types CAN.
		String emptyBox = null;

		System.out.println("Value of empty box: " + emptyBox);

		// 3. Comparing Reference Types
		String s1 = new String("Java");
		String s2 = new String("Java");

		// Using '==' checks if they point to the same memory address
		System.out.println("Are they the same memory address? " + (s1 == s2)); // false

		// Using '.equals()' checks if the text INSIDE is the same
		System.out.println("Is the content the same? " + s1.equals(s2)); // true
	}
}