package controlflow.looping;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:- ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;

		do {
			sum = sum + i;
			i++;
		} while (i <= n);

		System.out.println("The sum of 1 to " + n + " is: " + sum);
		sc.close();
	}
}