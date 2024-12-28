package management;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	private List<User> users;

	public UserManager() {
		users = new ArrayList<>();
	}

	public void addUser(User user) {
		users.add(user);
		System.out.println("User added: " + user);
	}

	public void removeUser(String username) {
		users.removeIf(user -> user.getUsername().equalsIgnoreCase(username));
		System.out.println("User removed: " + username);
	}

	public void displayUsers() {
		System.out.println("User List:");
		for (User user : users) {
			System.out.println(user);
		}
	}
}
