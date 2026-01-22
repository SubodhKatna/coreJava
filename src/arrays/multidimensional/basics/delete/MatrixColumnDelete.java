package arrays.multidimensional.basics.delete;

import java.util.Arrays;

public class MatrixColumnDelete {
	public static void main(String[] args) {

		int[][] original = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int colToDelete = 1; // We want to remove the middle column (2, 5, 8)

		int rows = original.length;
		int oldCols = original[0].length;

		// Step 1: Create new matrix with same height, but 1 less width
		int[][] newMatrix = new int[rows][oldCols - 1];

		// Step 2: Iterate through every row
		for (int i = 0; i < rows; i++) {

			int newColIndex = 0; // Reset column pointer for every new row

			for (int j = 0; j < oldCols; j++) {

				// If this is the column to nuke, skip it
				if (j == colToDelete) {
					continue;
				}

				// Copy data and move the new pointer forward
				newMatrix[i][newColIndex] = original[i][j];
				newColIndex++;
			}
		}

		// Print Result
		System.out.println("--- Column Deleted Matrix ---");
		for (int[] row : newMatrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}
/*
 * Output: [1, 3] [4, 6] [7, 9]
 */