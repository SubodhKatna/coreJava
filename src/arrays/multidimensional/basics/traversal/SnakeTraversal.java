package arrays.multidimensional.basics.traversal;

public class SnakeTraversal {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("--- Snake Traversal ---");
		for (int row = 0; row < matrix.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < matrix[row].length; col++) {
					System.out.print(matrix[row][col] + " ");
				}
			} else {
				for (int col = matrix[row].length - 1; col >= 0; col--) {
					System.out.print(matrix[row][col] + " ");
				}
			}
			System.out.println();
		}
	}
}
