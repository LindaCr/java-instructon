import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		
		String choice= "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Degrees in Fahrenheit: ");
			double f=sc.nextDouble();
			
			double celsius= (double) (f-32)* 5/9;
			celsius= (double)Math.round(celsius*100) /100;
			System.out.println("Celsius= "+celsius);
			
			
			System.out.println("\nContinue? (y/n): ");
			choice= sc.next();
		}
		
		
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
