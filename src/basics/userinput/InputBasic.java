package basics.userinput;

import java.util.Scanner; // 1. Import the tool

public class InputBasic {
	public static void main(String[] args) {

		// 2. Create the Scanner object (we named it 'input')
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");

		// 3. Use the scanner to catch the text typed by the user
		String name = input.nextLine();

		System.out.println("Hello, " + name + "! Welcome to Java.");

		// Good practice: close the scanner when finished
		input.close();
	}
}