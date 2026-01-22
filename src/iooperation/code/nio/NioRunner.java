package iooperation.code.nio;

public class NioRunner {

	public static void main(String[] args) {
		System.out.println("--- Starting NIO Workflow ---");

		// 1. Define Path
		String targetFile = "src/iooperation/fileManager/nioData.txt";
		String message = "NIO is faster and cleaner.\nIt uses Paths instead of Files.";

		// 2. Use Writer
		System.out.println("\n[Task 1] Writing with NIO...");
		NioWriter writer = new NioWriter();
		writer.writeFile(targetFile, message);

		// 3. Use Reader
		System.out.println("\n[Task 2] Reading with NIO...");
		NioReader reader = new NioReader();
		reader.readFile(targetFile);

		System.out.println("\n--- Workflow Complete ---");
	}
}