package collections.map.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapIntermediate {

	public static void main(String[] args) {

		TreeMap<Integer, String> rankMap = new TreeMap<>();

		rankMap.put(1100, "One Piece");
		rankMap.put(700, "Naruto");
		rankMap.put(686, "Bleach");
		rankMap.put(139, "Attack on Titan");

		System.out.println("Rank Map: " + rankMap);

		// 1. Navigation Methods (Closest Matches)

		// strictly less than
		System.out.println("Lower than 700: " + rankMap.lowerKey(700));

		// less than or equal to
		System.out.println("Floor of 700: " + rankMap.floorKey(700));
		System.out.println("Floor of 600: " + rankMap.floorKey(600));

		// strictly greater than
		System.out.println("Higher than 700: " + rankMap.higherKey(700));

		// greater than or equal to
		System.out.println("Ceiling of 700: " + rankMap.ceilingKey(700));
		System.out.println("Ceiling of 800: " + rankMap.ceilingKey(800));

		// 2. Entry-level navigation
		Map.Entry<Integer, String> lowest = rankMap.firstEntry();
		Map.Entry<Integer, String> highest = rankMap.lastEntry();

		System.out.println("Lowest Entry: " + lowest);
		System.out.println("Highest Entry: " + highest);

		// 3. Polling (Retrieve + Remove)
		rankMap.pollFirstEntry();
		rankMap.pollLastEntry();

		System.out.println("After polling: " + rankMap);

		// 4. Descending Order View
		NavigableMap<Integer, String> descMap = rankMap.descendingMap();
		System.out.println("Descending Map: " + descMap);
	}
}
