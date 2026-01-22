package basics.userinput;

import java.util.Scanner;

public class BooleanInput {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Is it raining? (true/false): ");
		boolean isRaining = reader.nextBoolean(); // Captures true or false

		System.out.println("Should you take an umbrella? " + isRaining);
		reader.close();
	}
}
