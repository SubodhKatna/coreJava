package oops.fundamentals.multifile;

public class ConstructorDemo {
	public static void main(String[] args) {

		System.out.println("--- Scenario 1: Using Default Constructor ---");
		// We didn't pass any data, so it uses the defaults ("Unknown", 0)
		Student s1 = new Student();
		s1.displayInfo();

		System.out.println("\n--- Scenario 2: Using Parameterized Constructor ---");
		// We pass data immediately while creating the object
		Student s2 = new Student("Alice", 105);
		s2.displayInfo();

		// This is much safer because we don't forget to set the name!
	}
}