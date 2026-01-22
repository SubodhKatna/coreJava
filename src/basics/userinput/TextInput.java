package basics.userinput;

import java.util.Scanner;

public class TextInput {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("What is your favorite hobby? ");
		String hobby = reader.nextLine(); // Captures the whole line of text

		System.out.println("That's cool! I like " + hobby + " too.");
		reader.close();
	}
}
