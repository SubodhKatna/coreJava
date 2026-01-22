package oops.fundamentals.multifile;

public class Student {

	// Instance Variables
	String name;
	int rollNumber;

	// --- 1. DEFAULT CONSTRUCTOR ---
	// Runs when you say: new Student();
	// Useful for setting default values.
	public Student() {
		System.out.println(">> Default Constructor called: Creating a generic student.");
		this.name = "Unknown";
		this.rollNumber = 0;
	}

	// --- 2. PARAMETERIZED CONSTRUCTOR ---
	// Runs when you say: new Student("John", 101);
	// Useful for forcing the user to provide data immediately.
	public Student(String name, int rollNumber) {
		System.out.println(">> Parameterized Constructor called for: " + name);
		this.name = name;
		this.rollNumber = rollNumber;
	}

	// method to display info
	public void displayInfo() {
		System.out.println("Student Name: " + this.name + " | Roll No: " + this.rollNumber);
	}

	// --- DESTRUCTOR NOTE ---
	// Java does NOT have a destructor (like ~Student() in C++).
	// The "Garbage Collector" automatically frees memory when the object is lost.
	// However, you might see 'finalize()' in old code (deprecated now).
}
