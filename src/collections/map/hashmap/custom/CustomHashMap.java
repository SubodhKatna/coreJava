package collections.map.hashmap.custom;

import java.util.ArrayList;
import java.util.List;

public class CustomHashMap<K, V> {

	// Internal Node (Key-Value Pair)
	private class Entry {
		K key;
		V value;
		Entry next; // Pointer to next Entry in case of collision

		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private Entry[] buckets;
	private int capacity;
	private int size = 0;

	// Load Factor: When map is 75% full, we resize (double the array)
	private static final float LOAD_FACTOR = 0.75f;

	@SuppressWarnings("unchecked")
	public CustomHashMap(int capacity) {
		this.capacity = capacity;
		// CASTING FIX: Create raw array of the Inner Class to avoid Generic Array
		// Creation error
		this.buckets = (Entry[]) new CustomHashMap.Entry[capacity];
	}

	// Hashing Function: Converts Key -> Index
	private int getBucketIndex(K key) {
		return Math.abs(key.hashCode() % capacity);
	}

	// --- PUT (Insert or Update) ---
	public void put(K key, V value) {
		// 1. Check if resize is needed
		if (size >= capacity * LOAD_FACTOR) {
			resize();
		}

		int index = getBucketIndex(key);
		Entry current = buckets[index];

		// 2. Check for Update (Key already exists?)
		while (current != null) {
			if (current.key.equals(key)) {
				current.value = value; // Update value
				return;
			}
			current = current.next;
		}

		// 3. Insert New Entry at Head of Bucket
		Entry newEntry = new Entry(key, value);
		newEntry.next = buckets[index]; // Point new node to old head
		buckets[index] = newEntry; // Set new node as head
		size++;
	}

	// --- GET (Retrieve Value) ---
	public V get(K key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];

		while (current != null) {
			if (current.key.equals(key)) {
				return current.value;
			}
			current = current.next;
		}
		return null; // Key not found
	}

	// --- REMOVE (Delete Entry) ---
	public boolean remove(K key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];
		Entry prev = null;

		while (current != null) {
			if (current.key.equals(key)) {
				if (prev == null) {
					buckets[index] = current.next; // Remove Head
				} else {
					prev.next = current.next; // Skip over current
				}
				size--;
				return true;
			}
			prev = current;
			current = current.next;
		}
		return false;
	}

	// --- HELPER: Extract Values for Sorting/Filtering ---
	public List<V> values() {
		List<V> list = new ArrayList<>();
		for (Entry bucket : buckets) {
			Entry current = bucket;
			while (current != null) {
				list.add(current.value);
				current = current.next;
			}
		}
		return list;
	}

	// --- RESIZE (Dynamic Growth) ---
	@SuppressWarnings("unchecked")
	private void resize() {
		System.out.println("-> [System] Load Factor Reached. Resizing Map...");
		Entry[] oldBuckets = buckets;

		capacity *= 2; // Double capacity
		buckets = (Entry[]) new CustomHashMap.Entry[capacity];
		size = 0; // Reset size (put will re-increment)

		// Re-Hash every item
		for (Entry node : oldBuckets) {
			while (node != null) {
				put(node.key, node.value);
				node = node.next;
			}
		}
	}

	// --- PRINT FULL DATA ---
	public void printAllData() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.printf("%-18s | %s%n", "ISBN (Key)", "MANGA DETAILS (Value)");
		System.out.println("--------------------------------------------------------------------------------------");

		for (Entry bucket : buckets) {
			Entry current = bucket;
			while (current != null) {
				System.out.printf("%-18s | %s%n", current.key, current.value);
				current = current.next;
			}
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
}