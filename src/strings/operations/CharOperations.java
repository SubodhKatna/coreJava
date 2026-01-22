package strings.operations;

public class CharOperations {
	public static void main(String[] args) {

		String input = "Code_101";

		System.out.println("--- 1. Accessing & Iterating ---");
		// Access a single character
		char first = input.charAt(0);
		System.out.println("First Char: " + first);

		// Loop through every character
		System.out.print("All Chars: ");
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			System.out.print(c + " ");
		}
		System.out.println();

		System.out.println("\n--- 2. Character Logic (The 'Character' Class) ---");
		// The 'Character' class provides static methods to check char types

		int letters = 0;
		int digits = 0;
		int others = 0;

		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				letters++;
				// We can also flip case for individual chars here
				// System.out.print(Character.toUpperCase(c));
			} else if (Character.isDigit(c)) {
				digits++;
			} else {
				others++; // Underscores, symbols, spaces
			}
		}

		System.out.println("Count Analysis:");
		System.out.println("Letters: " + letters); // 4 (C, o, d, e)
		System.out.println("Digits:  " + digits); // 3 (1, 0, 1)
		System.out.println("Symbols: " + others); // 1 (_)
	}
}