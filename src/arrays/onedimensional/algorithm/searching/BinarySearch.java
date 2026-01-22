package arrays.onedimensional.algorithm.searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.print("Enter number to find: ");
		int target = sc.nextInt();
		int start = 0;
		int end = numbers.length - 1;
		int foundIndex = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (numbers[mid] == target) {
				foundIndex = mid;
				break;
			} else if (target < numbers[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if (foundIndex != -1) {
			System.out.println("Element found at index: " + foundIndex);
		} else {
			System.out.println("Element not found.");
		}
		sc.close();
	}
}
