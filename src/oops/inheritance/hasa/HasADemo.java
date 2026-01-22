package oops.inheritance.hasa;

public class HasADemo {
	public static void main(String[] args) {

		Address addr = new Address("New York", "NY");

		// Injecting the Address object into the Employee
		Employee emp = new Employee(101, "John", addr);

		emp.display();
	}
}