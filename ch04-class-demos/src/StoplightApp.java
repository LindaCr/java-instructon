import java.util.Scanner;

public class StoplightApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stoplight App");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		String choice="y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("What color is the stoplight? ");
			String color=sc.next();
			
			
			
			
			System.out.println("Continue? y/n");
			choice=sc.next();
		}
		
		sc.close();
		System.out.println("Peace");

	}

}
