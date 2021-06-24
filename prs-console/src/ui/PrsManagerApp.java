package ui;

import com.util.Console;

import business.User;
import db.UserDB;
import interfaces.DAO;

public class PrsManagerApp {
	private static final String USER_NOT_FOUND= "No user found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Manager App");
		
		DAO<User> usersDAO= new UserDB();
		
		int command=0;
		while (command!=99) {
			displayMenu();
			command=Console.getInt("Command");
			System.out.println();
			
			switch (command) {
			case 1:
				//get all
				System.out.println("Get all users");
				System.out.println("=================");
				for (User user: usersDAO.getAll()) {
					System.out.println(user);
				}
				break;
			case 2:
				//get item
				System.out.println("Get a User");
				System.out.println("================");
				int id=Console.getInt("ID: ");
				User user= usersDAO.get(id);
				if (user!=null) {
					System.out.println("User found: "+user);
				}
				else {
					System.out.println(USER_NOT_FOUND+ id);
				}
				break;
			case 3:
				//add
				System.out.println("Add a user: ");
				System.out.println("==================");
			   // id=Console.getInt("ID: "); with a database, we don't set the id
				String username=Console.getLine("Username: ");
				String password=Console.getLine("Password: ");
				String firstName=Console.getLine("First name: ");
				String lastName=Console.getLine("Last name: ");
				String phone=Console.getLine("Phone number (xxx-xxx-xxxx): ");
				String email=Console.getLine("Email: ");
				//reviewer
				//String rvwStr=Console.getString("Reviewer y/n: ", "y", "n");
				//boolean rvw= (rvwStr.equalsIgnoreCase("y")) ? true:false;
				boolean rvw=Console.getBoolean("Reviewer y/n: ");
				//admin
				//String admStr=Console.getString("Admin y/n: ", "y", "n");
				//boolean adm= (admStr.equalsIgnoreCase("y")) ? true: false;
				boolean adm=Console.getBoolean("Admin y/n: ");
				if    (usersDAO.add(new User(username, password, firstName, lastName, phone, email, rvw, adm))) {
					System.out.println("User added!");
				}
				else {
					System.out.println("Error adding user.");
				}
				break;
			case 4:
				//update
				System.out.println("Update a user: ");
				System.out.println("==================");
				id=Console.getInt("ID: ");
				user= usersDAO.get(id);
				if (user!=null) {
					String newUser=Console.getLine("New User: ");
					user.setUsername(newUser);
					usersDAO.update(user);
					System.out.println("User updated!");
				}
				else {
					System.out.println(USER_NOT_FOUND+ id);
				}
				break;
			case 5:
				//delete
				System.out.println("Delete a user:  ");
				System.out.println("===================");
				id=Console.getInt("ID: ");
				user= usersDAO.get(id);
				if (user!=null) {
					usersDAO.delete(user);
					System.out.println("User deleted: "+user);
				}
				else {
					System.out.println(USER_NOT_FOUND+ id);
				}
				break;
			case 99:
				//exit
				break;
			default:	
				System.out.println("Invalid command! Try again.");
				break;
			}
			
			
			
			
		}
		
		
		
		
		
		
		System.out.println("Peace");
	}

	private static void displayMenu() {
		System.out.println("Command menu");
		System.out.println("=================");
		System.out.println("1- Get all users");
		System.out.println("2- Get a user");
		System.out.println("3- Add a user");
		System.out.println("4- Update a user-don't use");
		System.out.println("5- Delete a user");
		System.out.println("99- exit");
		System.out.println();
	}
	
}
