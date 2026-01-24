package collections.list.arraylist.custom;

import java.util.Arrays;

// Generic class so it can hold Manga or anything else
public class CustomArrayList<T> {
	private static final int INITIAL_CAPACITY = 2; // Small start to force resize testing
	private Object[] data;
	private int size = 0;

	public CustomArrayList() {
		data = new Object[INITIAL_CAPACITY];
	}

	public void add(T element) {
		if (size == data.length) {
			resize();
		}
		data[size++] = element;
	}

	private void resize() {
		int newCapacity = data.length * 2;
		data = Arrays.copyOf(data, newCapacity);
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return (T) data[index];
	}

	public int size() {
		return size;
	}

	// Helper to return a standard Java Array (useful for sorting utilities)
	public Object[] toArray() {
		return Arrays.copyOf(data, size);
	}
}