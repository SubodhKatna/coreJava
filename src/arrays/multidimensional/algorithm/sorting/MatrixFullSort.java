package arrays.multidimensional.algorithm.sorting;

import java.util.Arrays;

public class MatrixFullSort {
	public static void main(String[] args) {

		int[][] matrix = { { 5, 12, 17 }, { 9, 3, 8 }, { 1, 10, 4 } };

		int rows = matrix.length;
		int cols = matrix[0].length;

		// Step 1: Flatten into a 1D array
		int[] tempArray = new int[rows * cols];
		int k = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tempArray[k++] = matrix[i][j];
			}
		}

		// Step 2: Sort the 1D array
		Arrays.sort(tempArray);

		// Step 3: Fill the 2D matrix back up
		k = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = tempArray[k++];
			}
		}

		// Print Result
		System.out.println("Fully Sorted Matrix:");
		for (int i = 0; i < rows; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}