package collections.set.treeset.custom;

// Generic class: T must be Comparable so we can sort it
public class CustomTreeSet<T extends Comparable<T>> {

	// The Node is the building block.
	// Unlike a LinkedList node (which has 'next'), this has 'left' and 'right'.
	private class Node {
		T data;
		Node left; // Stores items smaller than 'data'
		Node right; // Stores items larger than 'data'

		Node(T data) {
			this.data = data;
		}
	}

	private Node root; // The top of the pyramid
	private int size = 0;

	// --- 1. INSERTION (Recursive) ---
	public boolean add(T data) {
		if (root == null) {
			root = new Node(data); // Tree was empty
			size++;
			return true;
		}
		// Start searching from the root
		return addRecursive(root, data);
	}

	private boolean addRecursive(Node current, T data) {
		int diff = data.compareTo(current.data);

		if (diff < 0) {
			// New data is SMALLER -> Go LEFT
			if (current.left == null) {
				current.left = new Node(data); // Found empty spot
				size++;
				return true;
			} else {
				return addRecursive(current.left, data); // Keep digging
			}
		} else if (diff > 0) {
			// New data is LARGER -> Go RIGHT
			if (current.right == null) {
				current.right = new Node(data); // Found empty spot
				size++;
				return true;
			} else {
				return addRecursive(current.right, data); // Keep digging
			}
		} else {
			// diff == 0 -> DUPLICATE
			return false; // Sets do not allow duplicates
		}
	}

	// --- 2. SEARCH (contains) ---
	// This is very fast (O(log n)). It cuts the search space in half at every step.
	public boolean contains(T data) {
		return containsRecursive(root, data);
	}

	private boolean containsRecursive(Node current, T data) {
		if (current == null)
			return false; // Hit rock bottom, didn't find it

		int diff = data.compareTo(current.data);
		if (diff == 0)
			return true; // Found it!

		// If data is smaller, look left. If larger, look right.
		if (diff < 0)
			return containsRecursive(current.left, data);
		else
			return containsRecursive(current.right, data);
	}

	// --- 3. NAVIGATION (first/last) ---
	public T first() {
		if (root == null)
			return null;
		Node current = root;
		// The smallest item is always the leftmost node
		while (current.left != null) {
			current = current.left;
		}
		return current.data;
	}

	public T last() {
		if (root == null)
			return null;
		Node current = root;
		// The largest item is always the rightmost node
		while (current.right != null) {
			current = current.right;
		}
		return current.data;
	}

	// --- 4. TRAVERSAL (Printing) ---
	// In-Order Traversal: Left -> Root -> Right
	public void printSorted() {
		printInOrder(root);
	}

	private void printInOrder(Node node) {
		if (node != null) {
			printInOrder(node.left); // 1. Visit smallest children
			System.out.println(node.data); // 2. Visit self
			printInOrder(node.right); // 3. Visit larger children
		}
	}
}