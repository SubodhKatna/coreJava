package basics.datatypes.primitive;

public class Others {
	public static void main(String[] args) {

		// --- CHARACTER INFO ---
		System.out.println("----- CHARACTER (char) -----");
		// char is 16-bit because it uses Unicode (to support all languages/symbols)
		System.out.println("Size in bits: " + Character.SIZE);
		System.out.println("Size in bytes: " + Character.BYTES);

		// Range is represented by Unicode values
		System.out.println("Min Value (Unicode): " + (int) Character.MIN_VALUE);
		System.out.println("Max Value (Unicode): " + (int) Character.MAX_VALUE);

		System.out.println(); // Space

		// --- BOOLEAN INFO ---
		System.out.println("----- BOOLEAN -----");
		/*
		 * Note: Boolean does not have .SIZE or .BYTES constants in Java. The size of a
		 * boolean is not precisely defined by the Java Virtual Machine (JVM). It
		 * technically only needs 1 bit (0 or 1), but it often uses 1 byte (8 bits) for
		 * efficiency in memory alignment.
		 */
		System.out.println("Possible values: true / false");
	}
}