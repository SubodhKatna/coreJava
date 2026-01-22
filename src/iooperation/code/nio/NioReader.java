package iooperation.code.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioReader {

	public void readFile(String location) {

		Path path = Paths.get(location);

		// Check if file exists first (NIO best practice)
		if (!Files.exists(path)) {
			System.out.println("...File does not exist: " + location);
			return;
		}

		try {
			System.out.println("...Reading from: " + location);

			// Reads ALL lines into a List<String> at once
			List<String> lines = Files.readAllLines(path);

			System.out.println("   [Content Start]");
			for (String line : lines) {
				System.out.println("   " + line);
			}
			System.out.println("   [Content End]");

		} catch (IOException e) {
			System.err.println("NIO Read Error: " + e.getMessage());
		}
	}
}