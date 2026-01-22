package arrays.onedimensional.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] originalArray = { 10, 20, 30, 40, 50 };
		System.out.println("Original Array: " + Arrays.toString(originalArray));

		System.out.print("Enter the number to insert: ");
		int element = sc.nextInt();

		System.out.print("Enter the index (0-5): ");
		int index = sc.nextInt();

		int[] newArray = new int[originalArray.length + 1];

		for (int i = 0; i < index; i++) {
			newArray[i] = originalArray[i];
		}

		newArray[index] = element;

		for (int i = index; i < originalArray.length; i++) {
			newArray[i + 1] = originalArray[i];
		}

		System.out.println("After Insertion: " + Arrays.toString(newArray));

		sc.close();
	}
}