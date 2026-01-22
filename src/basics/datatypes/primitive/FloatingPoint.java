package basics.datatypes.primitive;

public class FloatingPoint {
	public static void main(String[] args) {

		// --- FLOAT INFO ---
		System.out.println("----- FLOAT -----");
		// Size in bits (32) and bytes (4)
		System.out.println("Size in bits: " + Float.SIZE);
		System.out.println("Size in bytes: " + Float.BYTES);
		// Range
		System.out.println("Min Value: " + Float.MIN_VALUE);
		System.out.println("Max Value: " + Float.MAX_VALUE);

		System.out.println(); // Empty line for readability

		// --- DOUBLE INFO ---
		System.out.println("----- DOUBLE -----");
		// Size in bits (64) and bytes (8)
		System.out.println("Size in bits: " + Double.SIZE);
		System.out.println("Size in bytes: " + Double.BYTES);
		// Range
		System.out.println("Min Value: " + Double.MIN_VALUE);
		System.out.println("Max Value: " + Double.MAX_VALUE);

	}
}