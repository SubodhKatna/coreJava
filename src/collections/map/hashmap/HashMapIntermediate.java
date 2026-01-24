package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntermediate {

	public static void main(String[] args) {

		Map<String, String> authorMap = new HashMap<>();
		authorMap.put("Naruto", "Kishimoto");
		authorMap.put("One Piece", "Oda");
		authorMap.put("Dragon Ball", "Toriyama");

		// 1. keySet() – keys only
		System.out.println("--- keySet() ---");
		for (String key : authorMap.keySet()) {
			System.out.println(key);
		}

		// 2. values() – values only
		System.out.println("\n--- values() ---");
		for (String value : authorMap.values()) {
			System.out.println(value);
		}

		// 3. entrySet() – MOST EFFICIENT
		System.out.println("\n--- entrySet() ---");
		for (Map.Entry<String, String> entry : authorMap.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}

		// 4. Java 8 forEach
		System.out.println("\n--- forEach() ---");
		authorMap.forEach((k, v) -> System.out.println(k + " = " + v));
	}
}
