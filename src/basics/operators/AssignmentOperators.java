package basics.operators;

public class AssignmentOperators {
	public static void main(String[] args) {

		// 1. Simple Assignment (=)
		int balance = 100;
		System.out.println("Initial Balance: " + balance);

		// 2. Addition Assignment (+=)
		// This is shorthand for: balance = balance + 50;
		balance += 50;
		System.out.println("After balance += 50: " + balance);

		// 3. Subtraction Assignment (-=)
		// This is shorthand for: balance = balance - 30;
		balance -= 30;
		System.out.println("After balance -= 30: " + balance);

		// 4. Multiplication Assignment (*=)
		// This is shorthand for: balance = balance * 2;
		balance *= 2;
		System.out.println("After balance *= 2: " + balance);

		// 5. Division Assignment (/=)
		// This is shorthand for: balance = balance / 4;
		balance /= 4;
		System.out.println("After balance /= 4: " + balance);

		// 6. Modulo Assignment (%=)
		// This is shorthand for: balance = balance % 10;
		balance %= 10;
		System.out.println("After balance %= 10: " + balance);
	}
}