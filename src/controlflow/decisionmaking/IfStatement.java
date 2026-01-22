package controlflow.decisionmaking;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are an adult.");
			System.out.println("You are eligible to vote.");
		}
		if (age >= 16) {
			System.out.println("You can apply for a learner's permit.");
		} else {
			System.out.println("You are too young to drive.");
		}
		System.out.print("Enter your exam score (0-100): ");
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("Grade: A");
		} else if (score >= 80) {
			System.out.println("Grade: B");
		} else if (score >= 70) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: F (Keep studying!)");
		}
		sc.close();
	}
}
