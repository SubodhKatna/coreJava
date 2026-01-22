package basics.userinput;

import java.util.Scanner;

public class CharInput {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter your grade (A, B, C, D, or F): ");
		// Get the first character of the input string
		char grade = reader.next().charAt(0);

		System.out.println("Your grade is " + grade);
		reader.close();
	}
}
