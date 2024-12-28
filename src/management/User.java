package management;

public class User {
	private String username;
	private String email;
	private static int userCount = 0;
	private static int nextId = 1;
	private int userId;

	public User(String username, String email) {
		this.username = username;
		this.email = email;
		this.userId = nextId++;
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

	public int getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", userId=" + userId + '}';
	}
}
