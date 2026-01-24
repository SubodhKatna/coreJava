package collections.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetAdvanced {

	public static void main(String[] args) {

		TreeSet<String> dictionary = new TreeSet<>();

		dictionary.add("Apple");
		dictionary.add("Banana");
		dictionary.add("Cherry");
		dictionary.add("Date");
		dictionary.add("Elderberry");
		dictionary.add("Fig");

		System.out.println("Full Dictionary: " + dictionary);

		// 1. headSet (Elements strictly less than given value)
		SortedSet<String> head = dictionary.headSet("Date");
		System.out.println("HeadSet (< Date): " + head);

		// 2. tailSet (Elements greater than or equal to given value)
		SortedSet<String> tail = dictionary.tailSet("Date");
		System.out.println("TailSet (>= Date): " + tail);

		// 3. subSet (Start inclusive, End exclusive)
		SortedSet<String> sub = dictionary.subSet("Banana", "Elderberry");
		System.out.println("SubSet (Banana -> Date): " + sub);

		// IMPORTANT: These are backed views
		sub.remove("Cherry");
		System.out.println("Original after subSet removal: " + dictionary);

		// 4. Descending Order View
		System.out.println("Descending Set: " + dictionary.descendingSet());

		// 5. Clear
		dictionary.clear();
		System.out.println("After clear(), is empty? " + dictionary.isEmpty());
	}
}
