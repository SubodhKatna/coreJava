package exceptionhandling.fundamentals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUnchecked {

	public static void main(String[] args) {

		// --- 1. Unchecked Exception (RuntimeException) ---
		// The compiler does NOT force us to wrap this in try-catch.
		// It assumes the programmer is smart enough to check for zero.
		int a = 10;
		int b = 0;
		// This will crash the app at Runtime, but it COMPILES fine.
		// int result = a / b;

		// --- 2. Checked Exception (Compile-Time Exception) ---
		// The compiler knows files might not exist.
		// It FORCES you to handle the risk immediately.

		File file = new File("secret.txt");

		// UNCOMMENTING the line below causes a COMPILER ERROR (Red Line):
		// FileReader fr = new FileReader(file);

		// Correct approach for Checked Exceptions:
		try {
			FileReader fr = new FileReader(file);
		} catch (IOException e) {
			System.out.println("Handled the Checked Exception: File missing.");
		}
	}
}