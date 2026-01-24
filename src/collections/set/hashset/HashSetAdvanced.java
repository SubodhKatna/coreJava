package collections.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetAdvanced {

	public static void main(String[] args) {

		// 1. Constructing HashSet with Initial Capacity
		// Reduces rehashing for large datasets
		Set<Integer> numbers = new HashSet<>(16, 0.75f);

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20); // duplicate ignored

		System.out.println("Numbers Set: " + numbers);

		// 2. Conversion: Set -> List
		List<Integer> numberList = List.copyOf(numbers);
		System.out.println("Converted to List: " + numberList);

		// 3. Conversion: List -> Set (Remove duplicates)
		List<String> duplicates = Arrays.asList("A", "B", "A", "C", "B");
		Set<String> uniqueValues = new HashSet<>(duplicates);
		System.out.println("Unique Values: " + uniqueValues);

		// 4. Checking Equality
		Set<String> s1 = new HashSet<>(Arrays.asList("X", "Y", "Z"));
		Set<String> s2 = new HashSet<>(Arrays.asList("Z", "Y", "X"));

		System.out.println("Sets Equal? " + s1.equals(s2)); // order does not matter

		// 5. toArray Conversion
		Object[] objArray = uniqueValues.toArray();
		String[] strArray = uniqueValues.toArray(new String[0]);

		System.out.println("Object Array Length: " + objArray.length);
		System.out.println("String Array: " + Arrays.toString(strArray));
	}
}
