import java.util.Scanner;

public class AreaPerimeterCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter length: ");
			double length=sc.nextDouble();
			System.out.println("Enter width: ");
			double width=sc.nextDouble();
			
			double area= (length*width);
			double perimeter= (2*length + 2*width);
			System.out.println("Area "+area);
			System.out.println("Perimeter "+perimeter);
			
			System.out.println("Continue? y/n");
			choice=sc.next();
		}
		
		
		sc.close();
		System.out.println("Peace");
		
		
				
			
		
	}

}
