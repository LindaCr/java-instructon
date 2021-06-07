import java.util.Scanner;

public class StoplightApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stoplight App");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		
		String choice="y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("What color is the stoplight? red/yellow/green");
			String color=sc.next();
			
			
			switch (color) {
			case "red":
			case "Red":
				System.out.println("Are you turning right? true/false");
				String right=sc.next();
				
				System.out.println("Is there anyone coming?");
				String obstacle=sc.next();
				
				
				break;
				
			case "yellow":
			case "Yellow":
				System.out.println("Are you more than 35 yards away? true/false");
				String yards=sc.next();
				
				break;
			case "green":
			case "Green":
				System.out.println("Are there any obstacles? true/false");
				String gogo=sc.next();
				break;
			}
			
			
			
			
			System.out.println("Continue? y/n");
			choice=sc.next();
		}
		
		sc.close();
		System.out.println("Peace");

	}

}
