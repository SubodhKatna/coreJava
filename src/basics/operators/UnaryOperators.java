package basics.operators;

public class UnaryOperators {
	public static void main(String[] args) {

		int x = 10;

		// 1. Unary Plus (+) and Minus (-)
		// These indicate positive or negative values.
		int a = +x; // a is 10
		int b = -x; // b is -10
		System.out.println("Negative version: " + b);
		System.out.println("Positive version: " + a);

		// 2. Increment (++)
		// Increases value by 1
		x++;
		System.out.println("After increment: " + x); // 11

		// 3. Decrement (--)
		// Decreases value by 1
		x--;
		System.out.println("After decrement: " + x); // 10

		// 4. Logical NOT (!)
		// Inverts a boolean value
		boolean isFinished = false;
		System.out.println("Is not finished? " + !isFinished); // true

		// --- 5. POST-Increment vs PRE-Increment ---
		System.out.println("\n--- The Difference ---");

		int count = 5;
		// POST-increment: Use the value first, THEN increment.
		System.out.println("Post-increment (count++): " + count++); // Prints 5, then becomes 6

		int score = 5;
		// PRE-increment: Increment first, THEN use the value.
		System.out.println("Pre-increment (++score): " + ++score); // Becomes 6, then prints 6
	}
}