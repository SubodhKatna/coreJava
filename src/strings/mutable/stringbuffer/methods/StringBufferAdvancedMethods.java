package strings.mutable.stringbuffer.methods;

public class StringBufferAdvancedMethods {
	public static void main(String[] args) {

		System.out.println("--- 1. Unicode & Emojis (codePointAt) ---");
		// A standard char is 16-bit. Some emojis are 32-bit (Surrogate Pairs).
		StringBuffer emojiBuffer = new StringBuffer("Hi 😀");

		// length() says 4 because the smiley face uses 2 chars!
		System.out.println("Length: " + emojiBuffer.length());

		// charAt(3) would give you garbage (half a smiley face).
		// codePointAt(3) gives you the actual Unicode ID.
		int unicodeId = emojiBuffer.codePointAt(3);
		System.out.println("Unicode Point: " + unicodeId); // 128512 (Decimal for 😀)

		System.out.println("\n--- 2. SubSequence (Read-Only Slice) ---");
		StringBuffer sb = new StringBuffer("System Design");

		// Returns a CharSequence (Interface) instead of a String object.
		// Useful for passing data to methods that expect CharSequence without full
		// conversion.
		CharSequence slice = sb.subSequence(0, 6);
		System.out.println("Slice: " + slice); // "System"

		System.out.println("\n--- 3. Bulk Copying (getChars) ---");
		// If you need to dump the buffer into a char[] array quickly.
		StringBuffer text = new StringBuffer("0123456789");
		char[] destination = new char[5];

		// Copy chars from index 3 to 8 into destination starting at index 0
		text.getChars(3, 8, destination, 0);

		System.out.print("Copied Chars: ");
		System.out.println(destination); // "34567"

		System.out.println("\n--- 4. Memory Trimming ---");
		// StringBuffer often holds more memory than it needs.
		// This frees up the unused space in the backing array.
		text.trimToSize();
		System.out.println("Capacity Optimized.");
	}
}