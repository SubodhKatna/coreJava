package collections.map.treemap.custom;

import java.util.ArrayList;
import java.util.List;

// K extends Comparable<K>: The Key MUST be sortable (like String or Integer)
public class CustomTreeMap<K extends Comparable<K>, V> {

	// Internal Node
	private class Node {
		K key;
		V value;
		Node left; // Smaller Keys
		Node right; // Larger Keys

		Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private Node root;
	private int size = 0;

	// --- 1. INSERTION (Recursive) ---
	public void put(K key, V value) {
		if (root == null) {
			root = new Node(key, value);
			size++;
		} else {
			putRecursive(root, key, value);
		}
	}

	private void putRecursive(Node current, K key, V value) {
		// Compare New Key vs Current Key
		int cmp = key.compareTo(current.key);

		if (cmp < 0) {
			// GO LEFT (New key is smaller)
			if (current.left == null) {
				current.left = new Node(key, value);
				size++;
			} else {
				putRecursive(current.left, key, value);
			}
		} else if (cmp > 0) {
			// GO RIGHT (New key is larger)
			if (current.right == null) {
				current.right = new Node(key, value);
				size++;
			} else {
				putRecursive(current.right, key, value);
			}
		} else {
			// MATCH (Key exists) -> Update Value
			current.value = value;
		}
	}

	// --- 2. RETRIEVAL (Recursive) ---
	public V get(K key) {
		return getRecursive(root, key);
	}

	private V getRecursive(Node current, K key) {
		if (current == null)
			return null;

		int cmp = key.compareTo(current.key);
		if (cmp < 0)
			return getRecursive(current.left, key);
		else if (cmp > 0)
			return getRecursive(current.right, key);
		else
			return current.value;
	}

	// --- 3. EXTRACTION (For Custom Sorting/Filtering) ---
	// Flattens the tree into a List so we can use Comparators on values later
	public List<V> values() {
		List<V> list = new ArrayList<>();
		collectValues(root, list);
		return list;
	}

	private void collectValues(Node node, List<V> list) {
		if (node != null) {
			collectValues(node.left, list);
			list.add(node.value);
			collectValues(node.right, list);
		}
	}

	// --- 4. PRINTING (Sorted Table) ---
	public void printMapSorted() {
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%-15s | %s%n", "KEY (Sorted)", "VALUE (Manga Details)");
		System.out.println("----------------------------------------------------------------------");
		printInOrder(root);
		System.out.println("----------------------------------------------------------------------");
	}

	private void printInOrder(Node node) {
		if (node != null) {
			printInOrder(node.left); // Visit Smallest
			System.out.printf("%-15s | %s%n", node.key, node.value); // Visit Self
			printInOrder(node.right); // Visit Largest
		}
	}
}