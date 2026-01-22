package strings.mutable.stringbuffer.methods;

public class StringBufferIntermediateMethods {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello World");

		System.out.println("Original: " + sb);

		// 1. insert(index, data) - Pushes text to the right
		sb.insert(6, "Beautiful ");
		System.out.println("Inserted: " + sb); // "Hello Beautiful World"

		// 2. replace(start, end, str) - Swaps a chunk of text
		// Replaces "World" (indices 16 to 21) with "Code"
		sb.replace(16, 21, "Code");
		System.out.println("Replaced: " + sb); // "Hello Beautiful Code"

		// 3. delete(start, end) - Removes a chunk
		// Removes "Beautiful " (indices 6 to 16)
		sb.delete(6, 16);
		System.out.println("Deleted:  " + sb); // "Hello Code"

		// 4. reverse() - Flips the sequence
		sb.reverse();
		System.out.println("Reversed: " + sb); // "edoC olleH"
	}
}