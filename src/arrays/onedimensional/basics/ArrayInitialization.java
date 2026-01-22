package arrays.onedimensional.basics;

import java.util.Arrays;

public class ArrayInitialization {
	public static void main(String[] args) {

		int[] numbers = new int[5]; // Creates [0, 0, 0, 0, 0]
		numbers[0] = 10;
		numbers[1] = 20;

		System.out.println("Way 1 (Size Only): " + Arrays.toString(numbers));

		String[] fruits = { "Apple", "Banana", "Cherry" };

		System.out.println("Way 2 (Literal): " + Arrays.toString(fruits));

		int[] scores;
		scores = new int[] { 90, 85, 88, 92 };

		System.out.println("Way 3 (Anonymous): " + Arrays.toString(scores));
	}
}
