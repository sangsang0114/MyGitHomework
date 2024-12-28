package management;

import java.util.Scanner;

public class UserApp {
	public static void main(String[] args) {
		UserManager manager = new UserManager();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		System.out.println("Welcome to the User Management System!");

		while (!exit) {
			System.out.println("\n1. Add User");
			System.out.println("2. Remove User");
			System.out.println("3. Display Users");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter username: ");
				String username = scanner.nextLine();
				System.out.print("Enter email: ");
				String email = scanner.nextLine();
				System.out.print("Enter role: ");
				String role = scanner.nextLine();
				manager.addUser(new User(username, email, role));
				break;
			case 2:
				System.out.print("Enter username to remove: ");
				String removeUsername = scanner.nextLine();
				manager.removeUser(removeUsername);
				break;
			case 3:
				manager.displayUsers();
				break;
			case 4:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}

		scanner.close();
	}
}
