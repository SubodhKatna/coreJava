package basics.userinput;

import java.util.Scanner;

public class DecimalInput {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the price of your coffee: ");
		double price = reader.nextDouble(); // Captures decimal numbers

		System.out.println("With a 10% tip, that would be $" + (price * 1.10));
		reader.close();
	}
}
