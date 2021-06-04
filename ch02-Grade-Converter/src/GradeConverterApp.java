import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		
		String choice= "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Numeric Grade: ");
			int numericGrade= sc.nextInt();
			
			String letterGrade= "F";
			if (numericGrade >= 88) {
				letterGrade= "A";
			}
			else if (numericGrade >= 80) {
				letterGrade= "B";
			}
			else if (numericGrade >= 68) {
				letterGrade= "C";
			}
			else if (numericGrade >= 60) {
				letterGrade= "D";
			}
			System.out.println("Letter grade: "+letterGrade);
			System.out.println();
			
			System.out.print("Continue (y/n)?");
			choice= sc.next();
		}
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
