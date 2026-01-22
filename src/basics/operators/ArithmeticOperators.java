package basics.operators;

public class ArithmeticOperators {
	public static void main(String[] args) {

		// 1. Basic Operands
		int a = 15;
		int b = 4;

		// 2. Addition (+)
		int sum = a + b; // 19
		System.out.println("Addition (15 + 4): " + sum);

		// 3. Subtraction (-)
		int difference = a - b; // 11
		System.out.println("Subtraction (15 - 4): " + difference);

		// 4. Multiplication (*)
		int product = a * b; // 60
		System.out.println("Multiplication (15 * 4): " + product);

		// 5. Division (/)
		// NOTE: Since both are 'int', the result is 3, not 3.75
		int quotient = a / b;
		System.out.println("Integer Division (15 / 4): " + quotient);

		// 6. Modulo (%)
		// This gives you the REMAINDER left over after division.
		// 15 divided by 4 is 3, with a remainder of 3.
		int remainder = a % b;
		System.out.println("Modulo (Remainder of 15 / 4): " + remainder);

		// 7. Increment (++) and Decrement (--)
		int score = 10;
		score++; // Adds 1. score is now 11
		System.out.println("Incremented Score: " + score);

		score--; // Subtracts 1. score is back to 10
		System.out.println("Decremented Score: " + score);
	}
}