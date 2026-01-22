package basics.datatypes.primitive;

public class Integers {
	public static void main(String[] args) {

		// --- BYTE INFO ---
		System.out.println("----- BYTE -----");
		System.out.println("Size in bits: " + Byte.SIZE);
		System.out.println("Size in bytes: " + Byte.BYTES);
		System.out.println("Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

		// --- SHORT INFO ---
		System.out.println("\n----- SHORT -----");
		System.out.println("Size in bits: " + Short.SIZE);
		System.out.println("Size in bytes: " + Short.BYTES);
		System.out.println("Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

		// --- INTEGER INFO ---
		System.out.println("\n----- INTEGER -----");
		System.out.println("Size in bits: " + Integer.SIZE);
		System.out.println("Size in bytes: " + Integer.BYTES);
		System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

		// --- LONG INFO ---
		System.out.println("\n----- LONG -----");
		System.out.println("Size in bits: " + Long.SIZE);
		System.out.println("Size in bytes: " + Long.BYTES);
		System.out.println("Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
	}
}