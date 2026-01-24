package collections.set.linkedhashset;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashSetAdvanced {

	public static void main(String[] args) {

		// LinkedHashMap with accessOrder = true
		Map<String, Boolean> recentManga = new LinkedHashMap<>(3, 0.75f, true) {

			@Override
			protected boolean removeEldestEntry(Map.Entry<String, Boolean> eldest) {
				return size() > 3;
			}
		};

		// 1. Fill cache
		recentManga.put("Dragon Ball", true);
		recentManga.put("Naruto", true);
		recentManga.put("One Piece", true);

		System.out.println("Cache: " + recentManga.keySet());

		// 2. Add 4th entry → removes oldest
		recentManga.put("Bleach", true);
		System.out.println("After adding Bleach: " + recentManga.keySet());

		// 3. Access existing key (moves to end)
		recentManga.get("Naruto");
		System.out.println("After accessing Naruto: " + recentManga.keySet());
	}
}
