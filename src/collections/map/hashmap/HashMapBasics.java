package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {

		/*
		 * HashMap characteristics: - Stores data as Key → Value pairs - Keys must be
		 * UNIQUE - Values can be duplicated - One null key allowed - Multiple null
		 * values allowed - No insertion order guarantee
		 */

		Map<String, Integer> mangaChapters = new HashMap<>();

		// 1. put() – insert or overwrite
		mangaChapters.put("Naruto", 700);
		mangaChapters.put("Bleach", 686);
		mangaChapters.put("One Piece", 1100);

		// Overwrite existing value
		mangaChapters.put("One Piece", 1111);

		System.out.println("Map: " + mangaChapters);

		// 2. get()
		Integer naruto = mangaChapters.get("Naruto");
		System.out.println("Naruto chapters: " + naruto);

		// 3. get() for missing key → returns null
		Integer demonSlayer = mangaChapters.get("Demon Slayer");
		System.out.println("Demon Slayer chapters: " + demonSlayer);

		// 4. containsKey / containsValue
		System.out.println("Has Bleach? " + mangaChapters.containsKey("Bleach"));
		System.out.println("Has value 700? " + mangaChapters.containsValue(700));

		// 5. remove()
		mangaChapters.remove("Bleach");
		System.out.println("After removal: " + mangaChapters);

		// 6. size & empty check
		System.out.println("Size: " + mangaChapters.size());
		System.out.println("Is empty? " + mangaChapters.isEmpty());
	}
}
