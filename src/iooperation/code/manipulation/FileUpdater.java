package iooperation.code.manipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUpdater {

	// 1. APPEND: Adds text to the end of the file
	public void appendText(String filePath, String data) {
		// The 'true' argument turns on Append Mode
		try (FileWriter writer = new FileWriter(filePath, true)) {
			writer.write(data);
			System.out.println("...Appended: " + data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2. MODIFY: Replaces specific words (Read All -> Modify -> Rewrite All)
	public void replaceText(String filePath, String oldWord, String newWord) {
		StringBuilder oldContent = new StringBuilder();

		// Step A: Read the existing content
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				oldContent.append(line).append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// Step B: Modify the content in memory
		String newContent = oldContent.toString().replace(oldWord, newWord);

		// Step C: Rewrite the file with new content (false = overwrite)
		try (FileWriter writer = new FileWriter(filePath, false)) {
			writer.write(newContent);
			System.out.println("...Replaced '" + oldWord + "' with '" + newWord + "'");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}