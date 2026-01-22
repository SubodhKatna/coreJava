package arrays.multidimensional.basics.delete;

import java.util.Arrays;

public class MatrixRowDelete {
	public static void main(String[] args) {

		int[][] original = { { 1, 1, 1 }, // Row 0
				{ 2, 2, 2 }, // Row 1 (To be deleted)
				{ 3, 3, 3 } // Row 2
		};

		int rowToDelete = 1;

		// Step 1: Create a new matrix with one less row
		int[][] newMatrix = new int[original.length - 1][original[0].length];

		// Step 2: Copy rows, skipping the target
		int p = 0; // Pointer for the new matrix

		for (int i = 0; i < original.length; i++) {

			// If this is the row to delete, just continue (skip it)
			if (i == rowToDelete) {
				continue;
			}

			// Copy the reference of the row
			newMatrix[p] = original[i];
			p++;
		}

		// Print Result
		System.out.println("--- New Matrix ---");
		for (int[] row : newMatrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}