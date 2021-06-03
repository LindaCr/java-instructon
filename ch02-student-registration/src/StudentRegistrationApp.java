import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		
		Scanner sc= new Scanner(System.in);
		
	
		System.out.println("Enter first name: ");
		String sentence1= sc.nextLine();
		System.out.println(sentence1);
		
		System.out.println("Enter Last Name: ");
		String sentence2= sc.nextLine();
		System.out.println(sentence2);
		
		System.out.println("Enter Year of Birth: ");
		String sentence3= sc.nextLine();
		System.out.println(sentence3);
		
		System.out.println("Welcome " + sentence1+" "+sentence2+ "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " +sentence1+"*"+sentence3);
		

	}

}
