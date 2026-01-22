package basics.datatypes;

public class CastingDemo {

	public static void main(String[] args) {

		System.out.println("--- Scenario 1: Real-world Percentage (Type Promotion) ---");
		int totalQuestions = 50;
		int correctAnswers = 42;

		// WITHOUT casting: Integer division truncates the decimal (result becomes 0.0)
		double wrongScore = correctAnswers / totalQuestions * 100;
		System.out.println("Wrong Score (No cast): " + wrongScore + "%");

		// WITH casting: One operand is cast to double, promoting the calculation to
		// double precision
		double correctScore = (double) correctAnswers / totalQuestions * 100;
		System.out.println("Correct Score (With cast): " + correctScore + "%");

		System.out.println("\n--- Scenario 2: Widening / Implicit Casting (Safe) ---");
		// Java handles this automatically because we are going from small -> large
		// container
		int myInt = 100;
		double myDouble = myInt; // int fits inside double easily
		long myLong = myInt; // int fits inside long easily

		System.out.println("Int value: " + myInt);
		System.out.println("Promoted to Double: " + myDouble);
		System.out.println("Promoted to Long: " + myLong);

		System.out.println("\n--- Scenario 3: Narrowing / Explicit Casting (Unsafe) ---");
		// We must manually cast because we are going from large -> small container
		// This usually results in losing the decimal part (Truncation)
		double pi = 3.9999;
		int integerPi = (int) pi;

		System.out.println("Original Double: " + pi);
		System.out.println("Casted to Int (Truncated, not rounded): " + integerPi);

		System.out.println("\n--- Scenario 4: The Overflow/Wrap-around Effect ---");
		// What happens when the number is simply too big for the container?
		long bigNumber = 1000L;

		// A byte can only hold numbers from -128 to 127.
		// 1000 is way outside this range.
		byte smallNumber = (byte) bigNumber;

		System.out.println("Original Long: " + bigNumber);
		System.out.println("Casted to Byte (Data Scramble): " + smallNumber);

		// Why -24? See the bitwise explanation below.
	}
}