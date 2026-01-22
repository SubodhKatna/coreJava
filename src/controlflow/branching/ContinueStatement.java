package controlflow.branching;

import java.util.Scanner;

public class ContinueStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to skip (1-10):- ");
		int skipNum = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			if (i == skipNum) {
				continue;
			}
			System.out.println(i);
		}
		sc.close();
	}
}