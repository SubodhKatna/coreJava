package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapAdvanced {

	public static void main(String[] args) {

		Map<String, Integer> inventory = new HashMap<>();
		inventory.put("Naruto Vol 1", 5);

		// 1. getOrDefault()
		int bleachStock = inventory.getOrDefault("Bleach Vol 1", 0);
		System.out.println("Bleach stock: " + bleachStock);

		// 2. putIfAbsent()
		inventory.putIfAbsent("Naruto Vol 1", 10); // ignored
		inventory.putIfAbsent("One Piece Vol 1", 10);
		System.out.println("After putIfAbsent: " + inventory);

		// 3. computeIfAbsent() – lazy initialization
		inventory.computeIfAbsent("Dragon Ball Vol 1", k -> 25);
		System.out.println("After computeIfAbsent: " + inventory);

		// 4. computeIfPresent()
		inventory.computeIfPresent("Naruto Vol 1", (k, v) -> v + 5);
		System.out.println("After computeIfPresent: " + inventory);

		// 5. merge()
		inventory.merge("Naruto Vol 1", 5, Integer::sum);
		inventory.merge("Bleach Vol 1", 3, Integer::sum);

		System.out.println("After merge: " + inventory);
	}
}
