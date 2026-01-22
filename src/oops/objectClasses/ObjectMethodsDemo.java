package oops.objectClasses;

public class ObjectMethodsDemo {
	public static void main(String[] args) {

		Laptop l1 = new Laptop("MacBook Pro", 2000);
		Laptop l2 = new Laptop("MacBook Pro", 2000); // Same data as l1
		Laptop l3 = new Laptop("Dell XPS", 1500);

		System.out.println("--- 1. toString() Demo ---");
		// Without override, this prints memory address (e.g., Laptop@6bc7c054)
		// With override, it prints our nice string.
		System.out.println(l1);

		System.out.println("\n--- 2. equals() Demo ---");
		// '==' compares MEMORY addresses. l1 and l2 are different objects in heap.
		System.out.println("l1 == l2? " + (l1 == l2)); // false

		// '.equals()' compares CONTENT (because we overrode it).
		System.out.println("l1.equals(l2)? " + l1.equals(l2)); // true

		System.out.println("\n--- 3. hashCode() Demo ---");
		// Since l1 and l2 are "equal", they must have the same hash code.
		System.out.println("HashCode l1: " + l1.hashCode());
		System.out.println("HashCode l2: " + l2.hashCode());

		// l3 is different, so it (likely) has a different hash code.
		System.out.println("HashCode l3: " + l3.hashCode());

		System.out.println("\n--- 4. getClass() Demo ---");
		// Returns the actual runtime class of the object.
		System.out.println("Class of l1: " + l1.getClass().getName());
	}
}