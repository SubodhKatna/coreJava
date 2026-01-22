package iooperation.code.manipulation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDeleter {

	// 1. CLEAR CONTENT: Makes the file empty but keeps the file
	public void clearFileContent(String filePath) {
		// Opening FileWriter without 'true' overwrites everything with nothing
		try (FileWriter writer = new FileWriter(filePath)) {
			writer.write("");
			System.out.println("...File content cleared.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2. DELETE FILE: Removes the file from the hard drive
	public void deleteFile(String filePath) {
		File file = new File(filePath);
		if (file.delete()) {
			System.out.println("...File successfully deleted from system.");
		} else {
			System.out.println("...Failed to delete the file (maybe it doesn't exist or is open?).");
		}
	}
}