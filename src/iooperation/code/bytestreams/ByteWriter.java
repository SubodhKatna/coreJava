package iooperation.code.bytestreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriter {

	public void writeToFile(String filePath, String data) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filePath);

			// Convert string to bytes because FileOutputStream writes raw bytes
			byte[] byteData = data.getBytes();

			fos.write(byteData);
			System.out.println("...Success! Data written to: " + filePath);

		} catch (IOException e) {
			System.err.println("Error writing file: " + e.getMessage());
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}