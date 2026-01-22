package arrays.onedimensional.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("Original Array: " + Arrays.toString(numbers));

		System.out.print("Enter the index to update (0-4): ");
		int index = sc.nextInt();

		if (index >= 0 && index < numbers.length) {

			System.out.print("Enter the new value: ");
			int newValue = sc.nextInt();

			numbers[index] = newValue;

			System.out.println("Updated Array: " + Arrays.toString(numbers));

		} else {
			System.out.println("Error: Index out of bounds.");
		}

		sc.close();
	}
}