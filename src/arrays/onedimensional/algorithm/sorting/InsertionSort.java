package arrays.onedimensional.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] numbers = { 12, 11, 13, 5, 6 };
		System.out.println("Before Sorting: " + Arrays.toString(numbers));
		for (int i = 1; i < numbers.length; i++) {
			int key = numbers[i];
			int j = i - 1;
			while (j >= 0 && numbers[j] > key) {
				numbers[j + 1] = numbers[j];
				j = j - 1;
			}
			numbers[j + 1] = key;
		}

		System.out.println("After Sorting:  " + Arrays.toString(numbers));
	}
}
