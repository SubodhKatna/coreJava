package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {

		// 1. Creation of ArrayList
		// Using List interface for loose coupling (best practice)
		List<String> fruits = new ArrayList<>();

		// 2. Adding Elements
		fruits.add("Apple"); // adds at end
		fruits.add("Banana");
		fruits.add("Orange");

		// Add element at specific index
		fruits.add(1, "Mango"); // shifts elements to the right

		System.out.println("Initial List: " + fruits);

		// 3. Accessing Elements
		String firstFruit = fruits.get(0);
		String lastFruit = fruits.get(fruits.size() - 1);

		System.out.println("First Fruit: " + firstFruit);
		System.out.println("Last Fruit: " + lastFruit);

		// 4. Updating Elements
		fruits.set(2, "Pineapple"); // replaces element at index 2
		System.out.println("After Update: " + fruits);

		// 5. Removing Elements
		fruits.remove(1); // remove by index
		fruits.remove("Apple"); // remove by object (first occurrence)

		System.out.println("After Removal: " + fruits);

		// 6. Checking Size
		System.out.println("Size of List: " + fruits.size());

		// 7. Checking Empty
		System.out.println("Is List Empty? " + fruits.isEmpty());
	}
}
