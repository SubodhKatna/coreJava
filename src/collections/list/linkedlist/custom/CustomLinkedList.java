package collections.list.linkedlist.custom;

public class CustomLinkedList<T> {

	// Internal Node class
	private class Node {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	// Add Last (Standard add)
	public void add(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	// Add First (The "specialty" of LinkedList)
	public void addFirst(T data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		if (tail == null) {
			tail = newNode;
		}
		size++;
	}

	public T getFirst() {
		if (head == null)
			return null;
		return head.data;
	}

	public int size() {
		return size;
	}

	public void printList() {
		Node current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("NULL");
	}

	// Helper for the library demo to convert to standard list for sorting
	public java.util.List<T> toJavaUtilList() {
		java.util.List<T> list = new java.util.ArrayList<>();
		Node current = head;
		while (current != null) {
			list.add(current.data);
			current = current.next;
		}
		return list;
	}
}