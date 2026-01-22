package arrays.multidimensional.basics;

import java.util.Arrays;

public class MatrixInitialization {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 10;
		matrix[1][1] = 50;
		matrix[2][2] = 90;
		System.out.println("Way 1 (Size Only): " + Arrays.deepToString(matrix));
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Way 2 (Literal): " + Arrays.deepToString(grid));
		int[][] jagged = new int[3][];
		jagged[0] = new int[] { 1, 2 };
		jagged[1] = new int[] { 3, 4, 5, 6 };
		jagged[2] = new int[] { 7 };

		System.out.println("Way 3 (Jagged): " + Arrays.deepToString(jagged));
	}
}