package iooperation.code.filemanagement;

import java.io.File;

public class FileDeleter {

	public static void deleteResource(String path) {
		File resource = new File(path);

		if (resource.exists()) {
			if (resource.delete()) {
				System.out.println("🗑️ DELETED: " + resource.getName());
			} else {
				System.out.println("❌ ERROR: Could not delete " + resource.getName());
				System.out.println("   (Hint: If it's a folder, it must be empty first!)");
			}
		} else {
			System.out.println("⚠️ SKIP: Nothing to delete at " + path);
		}
	}
}