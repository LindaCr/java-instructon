import java.util.Scanner;

public class SquaresandCubedApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubed Table");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter an integer:");
			int number=sc.nextInt();
			
			
			int square=0;
			int cube=0;
			for (int i=1; i<=number; i++) {
			//for loop needs to increment up to number variable, not descend	
				square= (int) Math.pow(number, 2);
				cube= (int) Math.pow(number, 3);
				System.out.println("Number   Square   Cubed");
				System.out.println(i+"         "+square+"        "+cube);
			}
			
			System.out.println("Continue? y/n");
			choice=sc.next();
		}


		sc.close();
		System.out.println("Peace!");
	}

}
