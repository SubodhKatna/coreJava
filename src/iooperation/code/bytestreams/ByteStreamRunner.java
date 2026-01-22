package iooperation.code.bytestreams;

public class ByteStreamRunner {

	public static void main(String[] args) {
		System.out.println("--- Starting Split-Task Workflow ---");

		// 1. Define the Path (Inside your fileManager folder)
		String targetFile = "src/iooperation/fileManager/byteData.txt";
		String message = "Hello! This data was written using Byte Streams.";

		// 2. Perform Write Task
		System.out.println("\n[Task 1] Writing Data...");
		ByteWriter writer = new ByteWriter();
		writer.writeToFile(targetFile, message);

		// 3. Perform Read Task
		System.out.println("\n[Task 2] Reading Data...");
		ByteReader reader = new ByteReader();
		reader.readFromFile(targetFile);

		System.out.println("\n--- Workflow Complete ---");
	}
}