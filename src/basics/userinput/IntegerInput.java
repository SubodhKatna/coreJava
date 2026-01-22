package basics.userinput;

import java.util.Scanner;

public class IntegerInput {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = reader.nextInt(); // Captures a whole number

		System.out.println("Next year, you will be " + (age + 1) + " years old.");
		reader.close();
	}
}
