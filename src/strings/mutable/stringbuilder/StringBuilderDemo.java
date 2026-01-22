package strings.mutable.stringbuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {

		System.out.println("--- 1. Creation & Appending ---");
		// Unlike String, this creates ONE object that we can change.
		// Default capacity is usually 16 characters + string length.
		StringBuilder sb = new StringBuilder("Java");

		System.out.println("Original: " + sb);
		System.out.println("Address (Hash): " + System.identityHashCode(sb));

		// .append() adds to the END
		sb.append(" Programming");
		System.out.println("After Append: " + sb);
		System.out.println("Address (Same): " + System.identityHashCode(sb)); // Proof it's the same object!

		System.out.println("\n--- 2. Modification (Insert & Replace) ---");

		// .insert(index, text) adds to the MIDDLE
		// "Java Programming" -> "Java Core Programming"
		sb.insert(5, "Core ");
		System.out.println("After Insert: " + sb);

		// .replace(start, end, text) swaps text
		// "Java Core Programming" -> "Java Advanced Programming"
		// Remember: 'end' index is exclusive (up to, but not including)
		sb.replace(5, 9, "Advanced");
		System.out.println("After Replace: " + sb);

		System.out.println("\n--- 3. Deletion & Reversal ---");

		// .delete(start, end) removes text
		// Removes "Advanced " (indices 5 to 14)
		sb.delete(5, 14);
		System.out.println("After Delete: " + sb); // Back to "Java Programming"

		// .reverse() flips the entire sequence
		sb.reverse();
		System.out.println("After Reverse: " + sb);

		System.out.println("\n--- 4. Capacity vs Length ---");
		// Length: How many characters are actually in it.
		// Capacity: How much memory is reserved (to avoid resizing too often).

		StringBuilder capacityDemo = new StringBuilder();
		System.out.println("Default Capacity: " + capacityDemo.capacity()); // Usually 16

		capacityDemo.append("abcdefghijklmnop"); // Fill 16 chars
		System.out.println("Full Capacity: " + capacityDemo.capacity()); // Still 16

		capacityDemo.append("q"); // Add 17th char -> Forces resize!
		System.out.println("New Capacity (Expanded): " + capacityDemo.capacity());
		// Formula is usually: (Old Capacity * 2) + 2
	}
}