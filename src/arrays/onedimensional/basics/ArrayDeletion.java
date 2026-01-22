package arrays.onedimensional.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] originalArray = { 10, 20, 30, 40, 50 };
		System.out.println("Original Array: " + Arrays.toString(originalArray));

		System.out.print("Enter index to delete (0-4): ");
		int index = sc.nextInt();

		if (index < 0 || index >= originalArray.length) {
			System.out.println("Invalid index.");
			sc.close();
			return;
		}

		int[] newArray = new int[originalArray.length - 1];

		for (int i = 0, k = 0; i < originalArray.length; i++) {

			if (i == index) {
				continue;
			}

			newArray[k] = originalArray[i];
			k++;
		}

		System.out.println("After Deletion: " + Arrays.toString(newArray));

		sc.close();
	}
}