package iooperation.code.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {

	public Student deserializeStudent(String filePath) {
		Student student = null;

		// Wrapper: FileInputStream -> ObjectInputStream
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {

			// We must cast the object back to (Student)
			student = (Student) in.readObject();
			System.out.println("...Success! Object loaded from memory.");

		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Deserialization Error: " + e.getMessage());
		}

		return student;
	}
}