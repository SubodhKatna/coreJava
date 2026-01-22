package iooperation.code.serialization;

import java.io.Serializable;

// 1. Implement Serializable interface (it's a marker, no methods to implement)
public class Student implements Serializable {

	// 2. Good practice: Add a version ID to ensure compatibility
	private static final long serialVersionUID = 1L;

	private String name;
	private int id;
	private double gpa;

	public Student(String name, int id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [ID=" + id + ", Name=" + name + ", GPA=" + gpa + "]";
	}
}