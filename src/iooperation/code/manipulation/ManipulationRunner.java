package iooperation.code.manipulation;

import iooperation.code.charstreams.CharWriter; // Reusing your previous writer

public class ManipulationRunner {

	public static void main(String[] args) {
		String path = "src/iooperation/fileManager/updateDemo.txt";

		// PREP: Create a file first
		new CharWriter().writeText(path, "Hello Java. Java is fun.");

		System.out.println("--- Starting Update/Delete Workflow ---");

		FileUpdater updater = new FileUpdater();
		FileDeleter deleter = new FileDeleter();

		// 1. Update: Append
		System.out.println("\n[Task 1] Appending...");
		updater.appendText(path, "\nCoding is life.");

		// 2. Update: Replace
		System.out.println("\n[Task 2] Replacing Text...");
		updater.replaceText(path, "Java", "Python");
		// File is now: "Hello Python. Python is fun.\nCoding is life."

		// 3. Delete: Clear Content
		System.out.println("\n[Task 3] Clearing Content...");
		deleter.clearFileContent(path);
		// File exists but is empty

		// 4. Delete: Remove File
		System.out.println("\n[Task 4] Deleting File...");
		deleter.deleteFile(path);

		System.out.println("\n--- Workflow Complete ---");
	}
}