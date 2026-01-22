package arrays.multidimensional.basics.traversal;

public class SimpleMatrixTraversal {
	public static void main(String[] args) {
		int[][] matrix = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println("--- Simple Row-Major Traversal ---");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}