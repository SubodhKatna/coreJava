package strings.modern;

public class ModernJsonString {
	public static void main(String[] args) {

		System.out.println("--- 1. The Old 'Nightmare' Way ---");
		// BEFORE Java 15: You had to escape every double quote.
		// Hard to read, hard to edit.
		String oldJson = "{\n" + "  \"id\": 101,\n" + "  \"name\": \"Alice\",\n" + "  \"active\": true\n" + "}";
		System.out.println(oldJson);

		System.out.println("\n--- 2. The Modern Way (Text Blocks) ---");
		// Java 15+ Feature: Triple quotes (""")
		// 1. Preserves format (newlines are real).
		// 2. No need to escape double quotes inside.
		// 3. Automatically removes accidental indentation (incidental whitespace).

		String jsonTemplate = """
				{
				    "id": %d,
				    "name": "%s",
				    "role": "ADMIN",
				    "active": %b
				}
				""";

		System.out.println(jsonTemplate);

		System.out.println("\n--- 3. Injecting Data (formatted) ---");
		// Java 15+ Feature: .formatted()
		// It's a cleaner version of String.format().
		// We inject data directly into the placeholders (%d, %s, %b).

		int userId = 505;
		String userName = "Gemini_User";
		boolean isActive = true;

		String finalJson = jsonTemplate.formatted(userId, userName, isActive);

		System.out.println(finalJson);
		/*
		 * Output: { "id": 505, "name": "Gemini_User", "role": "ADMIN", "active": true }
		 */

		System.out.println("\n--- 4. Handling Special Chars (translateEscapes) ---");
		// Sometimes you receive a raw string with literal backslashes like
		// "Line1\\nLine2"
		// and you want Java to treat them as real control characters.

		String rawInput = "Title:\\tReport\\nDate:\\t2024";
		System.out.println("Raw: " + rawInput);

		// translateEscapes() converts literal "\t" into a real Tab space
		System.out.println("Translated:\n" + rawInput.translateEscapes());
	}
}