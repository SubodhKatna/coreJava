package iooperation.code.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {

	public void serializeStudent(String filePath, Student student) {
		// Wrapper: FileOutputStream -> ObjectOutputStream
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {

			out.writeObject(student);
			System.out.println("...Success! Object saved to: " + filePath);

		} catch (IOException e) {
			System.err.println("Serialization Error: " + e.getMessage());
		}
	}
}