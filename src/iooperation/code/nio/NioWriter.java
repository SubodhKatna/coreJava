package iooperation.code.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioWriter {

	public void writeFile(String location, String content) {

		// 1. Create a Path object (NIO way of finding files)
		Path path = Paths.get(location);

		try {
			// 2. Write content.
			// - CREATE: Make file if missing
			// - TRUNCATE_EXISTING: Overwrite if it exists
			Files.write(path, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

			System.out.println("...Success! Written to: " + path.toAbsolutePath());

		} catch (IOException e) {
			System.err.println("NIO Write Error: " + e.getMessage());
		}
	}
}