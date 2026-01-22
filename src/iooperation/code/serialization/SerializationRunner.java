package iooperation.code.serialization;

public class SerializationRunner {

	public static void main(String[] args) {
		System.out.println("--- Starting Serialization Workflow ---");

		String filePath = "src/iooperation/fileManager/studentData.ser";

		// 1. Create the Object
		Student myStudent = new Student("Alice", 101, 3.8);
		System.out.println("Original Object: " + myStudent);

		// 2. Serialize (Save)
		System.out.println("\n[Task 1] Serializing...");
		Serializer serializer = new Serializer();
		serializer.serializeStudent(filePath, myStudent);

		// 3. Deserialize (Load)
		System.out.println("\n[Task 2] Deserializing...");
		Deserializer deserializer = new Deserializer();
		Student loadedStudent = deserializer.deserializeStudent(filePath);

		// 4. Verify
		System.out.println("Loaded Object:   " + loadedStudent);

		System.out.println("\n--- Workflow Complete ---");
	}
}