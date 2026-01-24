package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAdvanced {

	public static void main(String[] args) {

		// 1. Bulk Add (addAll)
		List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		List<String> list2 = new ArrayList<>(Arrays.asList("C", "D", "E"));

		list1.addAll(list2);
		System.out.println("After addAll: " + list1);

		// 2. Remove All (Difference)
		List<String> removeExample = new ArrayList<>(Arrays.asList("A", "B", "C"));
		removeExample.removeAll(Arrays.asList("B"));
		System.out.println("After removeAll: " + removeExample);

		// 3. Retain All (Intersection)
		List<String> retainExample = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		retainExample.retainAll(Arrays.asList("B", "C"));
		System.out.println("After retainAll: " + retainExample);

		// 4. SubList (View)
		List<String> original = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));

		List<String> subList = original.subList(1, 4);
		System.out.println("SubList: " + subList);

		subList.set(0, "UPDATED");
		System.out.println("Original after subList modification: " + original);

		// 5. Sorting
		Collections.sort(original);
		System.out.println("Sorted List: " + original);

		Collections.reverse(original);
		System.out.println("Reversed List: " + original);

		// 6. Convert to Array
		Object[] objectArray = original.toArray();
		System.out.println("Object Array Length: " + objectArray.length);

		String[] stringArray = original.toArray(new String[0]);
		System.out.println("String Array: " + Arrays.toString(stringArray));

		// 7. Immutable List (Java 9+)
		List<String> immutableList = List.of("X", "Y", "Z");
		System.out.println("Immutable List: " + immutableList);
		// immutableList.add("A"); // throws UnsupportedOperationException
	}
}
