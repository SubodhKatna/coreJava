package basics.operators;

public class ComparisonOperators {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// 1. Equal to (==)
		// Note: Use two equal signs to compare, one to assign!
		System.out.println("Is a equal to b? " + (a == b)); // false

		// 2. Not equal to (!=)
		System.out.println("Is a NOT equal to b? " + (a != b)); // true

		// 3. Greater than (>)
		System.out.println("Is a greater than b? " + (a > b)); // false

		// 4. Less than (<)
		System.out.println("Is a less than b? " + (a < b)); // true

		// 5. Greater than or equal to (>=)
		System.out.println("Is a >= 10? " + (a >= 10)); // true

		// 6. Less than or equal to (<=)
		System.out.println("Is b <= 20? " + (b <= 20)); // true

		// Comparing characters (based on Unicode/ASCII values)
		char letter1 = 'A'; // value 65
		char letter2 = 'B'; // value 66
		System.out.println("Is 'A' < 'B'? " + (letter1 < letter2)); // true
	}
}