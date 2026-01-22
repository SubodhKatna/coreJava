package arrays.onedimensional.algorithm.searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 15, 8, 23, 19, 42, 4 };
		System.out.print("Enter number to find: ");
		int target = sc.nextInt();
		int foundIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				foundIndex = i;
				break;
			}
		}
		if (foundIndex != -1) {
			System.out.println("Element found at index: " + foundIndex);
		} else {
			System.out.println("Element not found in the array.");
		}

		sc.close();
	}
}