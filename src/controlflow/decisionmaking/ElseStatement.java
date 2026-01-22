package controlflow.decisionmaking;

import java.util.Scanner;

public class ElseStatement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not old enough to vote yet.");
			System.out.println("Please wait " + (18 - age) + " more year(s).");
		}

		scanner.close();
	}
}