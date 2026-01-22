package controlflow.branching;

import java.util.Scanner;

public class BreakStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to stop at:- ");
		int stopNum = sc.nextInt();

		for (int i = 1; i <= 100; i++) {
			if (i == stopNum) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("Loop stopped.");
		sc.close();
	}
}