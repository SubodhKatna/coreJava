package arrays.multidimensional.algorithm.searching;

public class MatrixSearchLinear {

	public static void main(String[] args) {

		int[][] matrix = { { 5, 12, 17 }, { 9, 3, 8 }, { 1, 10, 4 } };

		int target = 8;
		boolean found = false;

		// Iterate through every single cell
		searchLoop: // Label for breaking out of nested loops
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == target) {
					System.out.println("Found " + target + " at: [" + i + "][" + j + "]");
					found = true;
					break searchLoop; // Stop searching once found
				}
			}
		}

		if (!found) {
			System.out.println("Element not found.");
		}
	}
}