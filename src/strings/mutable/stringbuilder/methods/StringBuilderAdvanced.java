package strings.mutable.stringbuilder.methods;

public class StringBuilderAdvanced {
	public static void main(String[] args) {

		System.out.println("--- 1. Performance Optimization ---");
		StringBuilder sb = new StringBuilder();

		// PRE-ALLOCATE memory for 1000 characters.
		// This prevents Java from resizing the array 6-7 times as we add data.
		sb.ensureCapacity(1000);

		System.out.println("Capacity after ensure: " + sb.capacity()); // 1000+

		System.out.println("\n--- 2. Truncating (setLength) ---");
		sb.append("This is a very long sentence that we will cut short.");

		// Instantly cuts the string. No new object created.
		sb.setLength(4);
		System.out.println("Truncated: " + sb); // "This"

		System.out.println("\n--- 3. Memory Cleanup (trimToSize) ---");
		// Current content is "This" (4 chars), but capacity is still 1000+!
		// This is a waste of RAM.
		System.out.println("Wasted Capacity: " + sb.capacity());

		sb.trimToSize(); // Shrinks the backing array to fit exactly the content
		System.out.println("Optimized Capacity: " + sb.capacity());

		System.out.println("\n--- 4. Low-level Modification (setCharAt) ---");
		// Much faster than replace() for single characters
		sb.setCharAt(0, 'X');
		System.out.println("Modified: " + sb); // "Xhis"

		System.out.println("\n--- 5. Method Chaining (Fluent API) ---");
		// We can stack commands because every method returns 'this'
		sb.setLength(0); // Clear it

		sb.append("Start").append("-End").insert(5, " Middle").reverse();

		System.out.println("Chained Result: " + sb);
	}
}