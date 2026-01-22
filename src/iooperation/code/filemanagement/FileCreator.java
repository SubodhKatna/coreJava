package iooperation.code.filemanagement;

import java.io.File;
import java.io.IOException;

public class FileCreator {

	// Task: Create a file (and handle the error if it fails)
	public static void createFile(String path) {
		File file = new File(path);
		try {
			if (file.createNewFile()) {
				System.out.println("✅ CREATED File: " + file.getName());
			} else {
				System.out.println("ℹ️ EXISTS: File already there -> " + file.getName());
			}
		} catch (IOException e) {
			System.out.println("❌ ERROR: Could not create file at " + path);
			e.printStackTrace();
		}
	}

	// Task: Create a directory (and all parent folders if needed)
	public static void createDir(String path) {
		File dir = new File(path);
		// .mkdirs() is smarter than .mkdir() because it creates parent folders too
		if (dir.mkdirs()) {
			System.out.println("✅ CREATED Dir:  " + dir.getName());
		} else if (dir.exists()) {
			System.out.println("ℹ️ EXISTS: Dir already there -> " + dir.getName());
		} else {
			System.out.println("❌ ERROR: Failed to create dir at " + path);
		}
	}
}