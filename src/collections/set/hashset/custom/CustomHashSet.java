package collections.set.hashset.custom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomHashSet<T> {

	private LinkedList<T>[] buckets;
	private int capacity;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public CustomHashSet(int capacity) {
		this.capacity = capacity;
		this.buckets = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			buckets[i] = new LinkedList<>();
		}
	}

	private int getBucketIndex(T key) {
		return Math.abs(key.hashCode() % capacity);
	}

	public boolean add(T key) {
		int index = getBucketIndex(key);
		LinkedList<T> bucket = buckets[index];

		for (T item : bucket) {
			if (item.equals(key))
				return false; // Duplicate
		}

		bucket.add(key);
		size++;
		return true;
	}

	// NEW HELPER: We need to extract the data to a List to sort it!
	public List<T> toList() {
		List<T> list = new ArrayList<>();
		for (LinkedList<T> bucket : buckets) {
			list.addAll(bucket);
		}
		return list;
	}

	public void printBuckets() {
		for (int i = 0; i < capacity; i++) {
			if (!buckets[i].isEmpty()) {
				System.out.println("Bucket " + i + ": " + buckets[i]);
			}
		}
	}
}