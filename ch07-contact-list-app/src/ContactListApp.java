import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Conact List App");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			String firstName=Console.getString("Enter First Name: ");
			String lastName=Console.getString("Enter Last Name: ");
			String email=Console.getString("Enter Email Address: ");
			String phone=Console.getString("Enter Phone Number: ");

			Contact c1=new Contact(firstName, lastName, email, phone);
			
			System.out.println("-----------------------------");
			System.out.println("------Current Contact--------");
			System.out.println("-----------------------------");
			printContact(c1);
			System.out.println("-----------------------------");
			
			
			System.out.println("Continue? y/n");
			choice=sc.next();
		}
	
	
		System.out.println("Peace");
	}
	public static void printContact(Contact c) {
		System.out.println("Name: "+c.getFirstName()+c.getLastName());
		System.out.println("Email Address: "+c.getEmail() );
		System.out.println("Phone Number: "+c.getPhone() );
		
	}
}
