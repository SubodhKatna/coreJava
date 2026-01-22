package controlflow.decisionmaking;

import java.util.Scanner;

public class ElseIfStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the temperature in Celsius: ");
		int temp = sc.nextInt();
		if (temp > 30) {
			System.out.println("It's a hot day! Stay hydrated.");
		} else if (temp >= 20) {
			System.out.println("It's a nice, warm day.");

		} else if (temp >= 10) {
			System.out.println("It's a bit cool. Wear a jacket.");

		} else {
			System.out.println("It's cold! Wear a coat.");
		}

		sc.close();
	}
}
