package iooperation.code.charstreams;

public class CharStreamRunner {

	public static void main(String[] args) {
		System.out.println("--- Starting Character Stream Workflow ---");

		// 1. Define Path (Inside your fileManager folder)
		String targetFile = "src/iooperation/fileManager/charData.txt";
		String message = "Hello World! Character Streams handle text much better than Byte Streams.";

		// 2. Perform Write Task
		System.out.println("\n[Task 1] Writing Text...");
		CharWriter writer = new CharWriter();
		writer.writeText(targetFile, message);

		// 3. Perform Read Task
		System.out.println("\n[Task 2] Reading Text...");
		CharReader reader = new CharReader();
		reader.readText(targetFile);

		System.out.println("\n--- Workflow Complete ---");
	}
}