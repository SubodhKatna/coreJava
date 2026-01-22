package iooperation.code.charstreams;

import java.io.FileWriter;
import java.io.IOException;

public class CharWriter {

	public void writeText(String filePath, String text) {
		FileWriter writer = null;
		try {
			// FileWriter is optimized for writing characters
			writer = new FileWriter(filePath);

			writer.write(text);

			System.out.println("...Success! Text written to: " + filePath);

		} catch (IOException e) {
			System.err.println("Error writing text: " + e.getMessage());
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}