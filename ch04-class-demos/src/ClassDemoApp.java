import java.util.Scanner;

public class ClassDemoApp {

	public static void main(String[] args) {
		System.out.println("Chapter 4 y'all!");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		//if/else statements
		//free shipping if >50 or Prime Memeber
		
		System.out.println("Welcome to our Shopping App!");
		
		final double SHIPPING=5;
		
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Purchase Price: ");
			double purchasePrice=sc.nextDouble();
			
			System.out.println("Prime Member? true/false");
			boolean prime=sc.nextBoolean();
			
			if (purchasePrice <50) {
				if (!prime) {
					purchasePrice += SHIPPING;
				}
			}
			System.out.println("Total: "+purchasePrice);
			
			
			
			System.out.println("Continue? y/n");
			choice=sc.next();
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		System.out.println("Peace");
		
	}

}
