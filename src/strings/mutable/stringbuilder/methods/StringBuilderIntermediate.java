package strings.mutable.stringbuilder.methods;

public class StringBuilderIntermediate {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java Programming");

		System.out.println("Original: " + sb);

		System.out.println("\n--- 1. Insert (Add in middle) ---");
		// Offset 5 is the space after "Java"
		sb.insert(5, "Core ");
		System.out.println("Inserted: " + sb); // "Java Core Programming"

		System.out.println("\n--- 2. Delete (Remove range) ---");
		// Remove "Core " (Indices 5 to 10)
		sb.delete(5, 10);
		System.out.println("Deleted:  " + sb); // "Java Programming"

		// Delete single char at index 4 (the space)
		sb.deleteCharAt(4);
		System.out.println("No Space: " + sb); // "JavaProgramming"

		System.out.println("\n--- 3. Replace (Swap range) ---");
		// Replace "Java" (0 to 4) with "Python"
		sb.replace(0, 4, "Python");
		System.out.println("Replaced: " + sb); // "PythonProgramming"

		System.out.println("\n--- 4. Reverse (Flip) ---");
		sb.reverse();
		System.out.println("Reversed: " + sb);
	}
}