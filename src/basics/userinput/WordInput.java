package basics.userinput;

import java.util.Scanner;

public class WordInput {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter your full name: ");
		// If you type "John Doe", this only catches "John"
		String firstName = reader.next();

		System.out.println("Hello, " + firstName);
		reader.close();
	}
}
