package oops.inheritance.hasa;

public class Employee {
	int id;
	String name;

	// HAS-A Relationship: Employee HAS An Address
	Address address;

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(name + " lives in " + address.city + ", " + address.state);
	}
}