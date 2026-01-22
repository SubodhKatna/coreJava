package controlflow.looping;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of 1 to " + n + " is: " + sum);
		sc.close();
	}
}