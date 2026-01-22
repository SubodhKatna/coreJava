package arrays.onedimensional.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numbers = { 64, 25, 12, 22, 11 };
		System.out.println("Before Sorting: " + Arrays.toString(numbers));
		int n = numbers.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (numbers[j] < numbers[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = numbers[minIndex];
				numbers[minIndex] = numbers[i];
				numbers[i] = temp;
			}
		}
		System.out.println("After Sorting:  " + Arrays.toString(numbers));
	}
}