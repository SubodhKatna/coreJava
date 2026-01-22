package arrays.multidimensional.basics.traversal;

public class ColumnTraversal {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("--- Column-Major Traversal ---");
		int totalRows = matrix.length;
		int totalCols = matrix[0].length;
		for (int col = 0; col < totalCols; col++) {
			for (int row = 0; row < totalRows; row++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}