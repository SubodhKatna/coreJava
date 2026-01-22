package controlflow.looping;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int num = sc.nextInt();
		int count = 1;
		while (count <= num) {
			System.out.println(count);
			count++;
		}
		sc.close();
	}
}