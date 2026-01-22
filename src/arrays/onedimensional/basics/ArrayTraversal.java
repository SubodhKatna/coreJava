package arrays.onedimensional.basics;

public class ArrayTraversal {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };

		System.out.println("--- 1. Standard For Loop ---");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
		System.out.println("\n--- 2. Enhanced For-Each Loop ---");
		for (int num : numbers) {
			System.out.println("Value: " + num);
		}
	}
}