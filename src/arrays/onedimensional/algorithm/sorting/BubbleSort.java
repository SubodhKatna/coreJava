package arrays.onedimensional.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = { 64, 34, 25, 22, 12, 11, 90 };
		System.out.println("Before Sorting: " + Arrays.toString(numbers));
		int n = numbers.length;
		boolean swap = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false) {
				break;
			}
		}
		System.out.println("After Sorting:  " + Arrays.toString(numbers));
	}
}