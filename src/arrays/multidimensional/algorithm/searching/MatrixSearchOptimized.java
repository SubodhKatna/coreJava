package arrays.multidimensional.algorithm.searching;

public class MatrixSearchOptimized {

	public static void main(String[] args) {

		// Notice: Every row is sorted, every column is sorted
		int[][] sortedMatrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		int target = 29;

		// Start pointer at Top-Right Corner
		int row = 0;
		int col = sortedMatrix[0].length - 1;

		boolean found = false;

		while (row < sortedMatrix.length && col >= 0) {

			int currentVal = sortedMatrix[row][col];

			if (currentVal == target) {
				System.out.println("Found at: [" + row + "][" + col + "]");
				found = true;
				break;
			} else if (currentVal > target) {
				// Current is too big? Go Left to find smaller numbers.
				col--;
			} else {
				// Current is too small? Go Down to find bigger numbers.
				row++;
			}
		}

		if (!found)
			System.out.println("Element not found.");
	}
}