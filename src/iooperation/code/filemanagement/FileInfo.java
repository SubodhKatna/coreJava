package iooperation.code.filemanagement;

import java.io.File;

public class FileInfo {

	public static void printStats(String path) {
		File file = new File(path);

		if (file.exists()) {
			System.out.println("\n--- 📄 STATS: " + file.getName() + " ---");
			System.out.println("   📍 Full Path: " + file.getAbsolutePath());
			System.out.println("   📏 Size:      " + file.length() + " bytes");
			System.out.println("   👀 Readable:  " + file.canRead());
			System.out.println("   ✍️ Writable:  " + file.canWrite());
			System.out.println("   📂 Is Folder: " + file.isDirectory());
			System.out.println("--------------------------------------\n");
		} else {
			System.out.println("⚠️ INFO: Cannot read stats. Path not found: " + path);
		}
	}
}