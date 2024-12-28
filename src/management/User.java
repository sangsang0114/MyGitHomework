package management;

public class User {
	private String username;
	private String email;
	private static int userCount = 0;

	public User(String username, String email) {
		this.username = username;
		this.email = email;
		userCount++;
	}

	public static int getUserCount() {
		return userCount;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + '}';
	}
}
