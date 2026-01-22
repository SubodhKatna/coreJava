package iooperation.code.charstreams;

import java.io.FileReader;
import java.io.IOException;

public class CharReader {

	public void readText(String filePath) {
		FileReader reader = null;
		try {
			reader = new FileReader(filePath);

			System.out.println("...Reading content from: " + filePath);
			System.out.print("   [Content]: ");

			int data;
			// Read char by char (returns int value of char)
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println(); // New line for formatting

		} catch (IOException e) {
			System.err.println("Error reading text: " + e.getMessage());
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}