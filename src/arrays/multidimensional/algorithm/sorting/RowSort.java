package arrays.multidimensional.algorithm.sorting;

import java.util.Arrays;

public class RowSort {
	public static void main(String[] args) {
		int[][] matrix = { { 9, 1, 5 }, { 8, 2, 7 }, { 3, 6, 4 } };

		// Sort each row independently
		for (int i = 0; i < matrix.length; i++) {
			Arrays.sort(matrix[i]);
		}

		// Print result
		System.out.println("Row-Wise Sorted:");
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}
/*
 * Output: [1, 5, 9] <-- Row 0 sorted [2, 7, 8] <-- Row 1 sorted [3, 4, 6] <--
 * Row 2 sorted
 */