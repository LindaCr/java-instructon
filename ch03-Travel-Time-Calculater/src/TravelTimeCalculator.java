import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		
		String choice= "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			double miles= sc.nextDouble();
			
			System.out.print("Enter miles per hour: ");
			double mph= sc.nextDouble();
			
			int time= (int) ((int)miles/mph);
			System.out.println("Hours: "+time);
			time= (int) (miles%mph);
			System.out.println("Minutes: "+time);
			
			
			System.out.println("\nContinue? (y/n): ");
			choice= sc.next();
		}
		
		
		
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
