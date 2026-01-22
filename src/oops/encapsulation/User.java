package oops.encapsulation;

public class User {

	// 1. userId is Read-Only (No Setter)
	private int userId;

	// 2. username is Read-Only (No Setter)
	private String username;

	// 3. password is Write-Only (No Getter for security)
	@SuppressWarnings("unused")
	private String password;

	// 4. age is Read-Write with Validation
	private int age;

	// Constructor to initialize fields
	public User(int userId, String username, String password, int age) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		setAge(age); // Use setter internally to ensure validation runs immediately
	}

	// --- GETTERS (Read Access) ---

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public int getAge() {
		return age;
	}
	// Note: No getPassword(). You cannot view the password.

	// --- SETTERS (Write Access) ---

	// Logic: Users can change their password, but it must be strong (> 5 chars)
	public void setPassword(String newPassword) {
		if (newPassword != null && newPassword.length() >= 6) {
			this.password = newPassword;
			System.out.println(">> Password updated successfully.");
		} else {
			System.out.println(">> Error: Password is too short! Update failed.");
		}
	}

	// Logic: Age cannot be negative or unrealistic
	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println(">> Error: Invalid age provided (" + age + "). Keeping old value.");
		}
	}
	// Note: No setUserId() or setUsername(). These are strictly immutable.
}