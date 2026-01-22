package basics.userinput;

import java.util.Scanner;

public class LongInput {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the current world population: ");
		long population = reader.nextLong();

		System.out.println("The population you entered is: " + population);
		reader.close();
	}
}