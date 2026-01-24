package collections.map.treemap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAdvanced {

	public static void main(String[] args) {

		TreeMap<Integer, String> rankMap = new TreeMap<>();

		rankMap.put(1100, "One Piece");
		rankMap.put(700, "Naruto");
		rankMap.put(686, "Bleach");
		rankMap.put(139, "Attack on Titan");
		rankMap.put(500, "Death Note");

		System.out.println("Full Map: " + rankMap);

		// 1. headMap (keys strictly less than given key)
		SortedMap<Integer, String> shortSeries = rankMap.headMap(700);
		System.out.println("Short Series (<700): " + shortSeries);

		// 2. tailMap (keys greater than or equal to given key)
		SortedMap<Integer, String> longSeries = rankMap.tailMap(700);
		System.out.println("Long Series (>=700): " + longSeries);

		// 3. subMap (range selection)
		SortedMap<Integer, String> mediumSeries = rankMap.subMap(500, 1000);
		System.out.println("Medium Series (500–999): " + mediumSeries);

		// IMPORTANT: These are backed views
		mediumSeries.remove(686);
		System.out.println("Original after subMap removal: " + rankMap);

		// 4. Navigable SubMaps (inclusive/exclusive control)
		NavigableMap<Integer, String> customRange = rankMap.subMap(500, true, 1000, true);

		System.out.println("Custom Range: " + customRange);
	}
}
