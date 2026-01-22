package iooperation.code.filemanagement;

public class FileManagerRunner {

	public static void main(String[] args) {

		System.out.println("--- Starting File Manager Workflow ---");

		// 1. Define paths relative to the Project Root (coreJava)
		// This puts the folder INSIDE src/iooperation/
		String folderPath = "src/iooperation/fileManager";

		// This puts the file INSIDE that new folder.
		// Note: You must give the file a name (e.g., "data.txt"), not just the path!
		String filePath = "src/iooperation/fileManager/data.txt";

		// 2. Use FileCreator
		System.out.println("\n[Step 1] Creating Resources...");

		// Ensure the parent directory exists first if your createDir doesn't handle
		// nested parents
		// But usually, standard mkdirs() handles this.
		FileCreator.createDir(folderPath);
		FileCreator.createFile(filePath);

		// 3. Use FileInfo
		System.out.println("\n[Step 2] Checking Details...");
		FileInfo.printStats(filePath);

		// 4. Use FileDeleter
		// ... (rest of your code) ...

		System.out.println("--- Workflow Complete ---");
	}
}