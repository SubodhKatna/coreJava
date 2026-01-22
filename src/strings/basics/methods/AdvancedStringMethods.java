package strings.basics.methods;

public class AdvancedStringMethods {
	public static void main(String[] args) {

		System.out.println("--- 1. Memory Optimization (intern) ---");
		// We force a new Heap object
		String s1 = new String("Java");
		String s2 = "Java"; // Literal in the Pool

		System.out.println("Original refs equal? " + (s1 == s2)); // false

		// .intern() moves s1 to the Pool (or finds the existing one)
		// and returns the reference to the Pool version.
		String s3 = s1.intern();

		System.out.println("Interned refs equal? " + (s3 == s2)); // true (Both point to Pool)

		System.out.println("\n--- 2. Interoperability (contentEquals) ---");
		String text = "Hello";
		StringBuilder sb = new StringBuilder("Hello");

		// .equals() expects a String object, so this returns false or fails logic
		System.out.println("Equals StringBuilder? " + text.equals(sb)); // false

		// .contentEquals() checks the CHARACTER SEQUENCE, regardless of object type
		System.out.println("Content matches? " + text.contentEquals(sb)); // true
	}
}