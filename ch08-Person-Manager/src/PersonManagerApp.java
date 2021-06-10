import com.util.Console;

public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager");

		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			
			
			
			String person=Console.getString("Create customer or employee? c/e", 
					"c", "e");
			if (person.equalsIgnoreCase("c")) {
				String firstName=Console.getString("Enter First Name: ");
				String lastName=Console.getString("Enter Last Name: ");
				String custNumber=Console.getString("Enter Customer Number: ");
				System.out.println("You entered a new customer: \nName: "+
								firstName+" "+lastName+"\nCustomer Number: "+custNumber);
				
			}
			
			else if (person.equalsIgnoreCase("e")) {
				String firstName=Console.getString("Enter First Name: ");
				String lastName=Console.getString("Enter Last Name: ");
				String ssn=Console.getString("Enter SSN: ");
				String last4=ssn.substring(7);
				System.out.println("You entered a new Employee: \nName: "
								+firstName+" "+lastName+"\nSSN: xxx-xx-"+last4);
			}
			
			
			
			
			
			
			choice=Console.getString("Continue? y/n", "y", "n");
		}
		
		
		
		System.out.println("Peace");
	}

}
