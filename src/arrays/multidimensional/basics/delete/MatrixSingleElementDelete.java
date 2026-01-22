package arrays.multidimensional.basics.delete;

import java.util.Arrays;

public class MatrixSingleElementDelete {
	public static void main(String[] args) {

		int[][] matrix = { { 10, 20, 30 }, { 40, 50, 60 }, // We want to remove 50 (at index 1)
				{ 70, 80, 90 } };

		System.out.println("--- Before Deletion ---");
		printMatrix(matrix);

		// Target: Remove value at [1][1] (which is 50)
		int targetRow = 1;
		int targetCol = 1;

		deleteElement(matrix, targetRow, targetCol);

		System.out.println("\n--- After Deletion (Shifted) ---");
		printMatrix(matrix);
	}

	public static void deleteElement(int[][] matrix, int r, int c) {

		// 1. Get the specific row where the deletion happens
		int[] row = matrix[r];

		// 2. Shift elements to the left, STARTING from the deletion point
		// We stop at length-1 to avoid an IndexOutOfBounds error on the last +1 check
		for (int j = c; j < row.length - 1; j++) {
			row[j] = row[j + 1];
		}

		// 3. Clear the last element (Fill with 0 or -1)
		row[row.length - 1] = 0;
	}

	// Helper method to print 2D arrays cleanly
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}