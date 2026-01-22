package strings.mutable.stringbuffer;

public class StringBufferBasics {
	public static void main(String[] args) {

		// 1. Creation
		StringBuffer sb = new StringBuffer("Hello");

		// 2. Modification (Same methods as StringBuilder)
		sb.append(" World");
		sb.insert(5, " Java");
		sb.replace(6, 10, "Safe");
		sb.deleteCharAt(5); // Remove space

		System.out.println("Result: " + sb); // "HelloSafe World"

		// 3. Reversal
		sb.reverse();
		System.out.println("Reversed: " + sb);

		// 4. Capacity Management (Same)
		System.out.println("Capacity: " + sb.capacity());
	}
}