package collections.set.linkedhashset.custom;

public class CustomLinkedHashSet<T> {

	// Make Node static or suppress warnings, but usually, just treating it as a raw
	// type for array creation is easiest.
	// However, to fix your specific error, we cast the array creation.
	private class Node {
		T data;

		// Chain 1: Hash Bucket (Vertical - for Collisions)
		Node nextInBucket;

		// Chain 2: Insertion Order (Horizontal - for Iteration)
		Node after;
		Node before;

		Node(T data) {
			this.data = data;
		}
	}

	private Node[] buckets;
	private int capacity;
	private int size = 0;

	// Pointers for Global Insertion Order
	private Node head;
	private Node tail;

	@SuppressWarnings("unchecked")
	public CustomLinkedHashSet(int capacity) {
		this.capacity = capacity;
		// FIX IS HERE: Create a raw array of the Inner Class, then cast it.
		// We use 'CustomLinkedHashSet.Node' explicitly to avoid the generic array
		// creation error.
		this.buckets = (Node[]) new CustomLinkedHashSet.Node[capacity];
	}

	private int getBucketIndex(T key) {
		return Math.abs(key.hashCode() % capacity);
	}

	// --- INSERTION (Add) ---
	public boolean add(T key) {
		int index = getBucketIndex(key);
		Node current = buckets[index];

		// 1. Check for duplicates
		while (current != null) {
			if (current.data.equals(key))
				return false;
			current = current.nextInBucket;
		}

		// 2. Create and Link to Bucket (Vertical)
		Node newNode = new Node(key);
		newNode.nextInBucket = buckets[index];
		buckets[index] = newNode;

		// 3. Link to Global List (Horizontal)
		linkNodeLast(newNode);

		size++;
		return true;
	}

	private void linkNodeLast(Node node) {
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.after = node;
			node.before = tail;
			tail = node;
		}
	}

	// --- DELETION (Remove) ---
	public boolean remove(T key) {
		int index = getBucketIndex(key);
		Node current = buckets[index];
		Node prevInBucket = null;

		while (current != null) {
			if (current.data.equals(key)) {
				// Found it! Now unlink it.

				// A. Unlink from Bucket Chain
				if (prevInBucket == null) {
					buckets[index] = current.nextInBucket; // Was Head of bucket
				} else {
					prevInBucket.nextInBucket = current.nextInBucket; // Skip over
				}

				// B. Unlink from Global Insertion Chain
				unlinkGlobalNode(current);

				size--;
				return true;
			}
			prevInBucket = current;
			current = current.nextInBucket;
		}
		return false; // Not found
	}

	private void unlinkGlobalNode(Node node) {
		// Fix "after" pointers
		if (node.before == null) {
			head = node.after; // Was Head
		} else {
			node.before.after = node.after;
		}

		// Fix "before" pointers
		if (node.after == null) {
			tail = node.before; // Was Tail
		} else {
			node.after.before = node.before;
		}
	}

	// --- UPDATION (Helper) ---
	public void update(T oldKey, T newKey) {
		boolean removed = remove(oldKey);
		if (removed) {
			add(newKey);
			System.out.println("-> Updated: " + oldKey + " to " + newKey);
		} else {
			System.out.println("-> Update Failed: Could not find " + oldKey);
		}
	}

	// --- DISPLAY ---
	public void printInsertionOrder() {
		System.out.println("--- Iterating (Insertion Order) ---");
		Node current = head;
		if (current == null)
			System.out.println("[Empty]");
		while (current != null) {
			System.out.println(current.data);
			current = current.after;
		}
	}

	public void printBuckets() {
		System.out.println("\n--- Internal Buckets (Hash Structure) ---");
		for (int i = 0; i < capacity; i++) {
			if (buckets[i] != null) {
				System.out.print("Bucket " + i + ": ");
				Node current = buckets[i];
				while (current != null) {
					System.out.print("[" + ((Manga) current.data).getTitle() + "] -> ");
					current = current.nextInBucket;
				}
				System.out.println("NULL");
			}
		}
	}
}