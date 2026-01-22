package iooperation.code.bytestreams;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteReader {

	public void readFromFile(String filePath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);

			System.out.println("...Reading content from: " + filePath);
			System.out.print("   [Content]: ");

			int i;
			// Read byte by byte until the end (-1)
			while ((i = fis.read()) != -1) {
				// Cast byte 'i' to char to print text
				System.out.print((char) i);
			}
			System.out.println(); // New line for clean formatting

		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}