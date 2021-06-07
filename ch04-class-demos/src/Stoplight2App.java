import java.util.Scanner;

public class Stoplight2App {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stoplight App");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Answer a few questions to determine\n"
				+ "what action you should take (Proceed vs. Stop).\n");
		
		String choice ="y";
		while (choice.equalsIgnoreCase("y")) {
			
			//proceed will dictate final message
			boolean proceed= false;
			System.out.println("Light Color (r/y/g)?");
			String lightcolor=sc.next();
			if (lightcolor.equalsIgnoreCase("r")) {
				System.out.println("Right turn (true/false)?");
				boolean rightTurn=sc.nextBoolean();
				if (rightTurn) {
					System.out.println("Obstacle? (true/false)");
					boolean obstacle=sc.nextBoolean();
					if (!obstacle) {
						proceed= true;
					}
				}
			}
			else if (lightcolor.equalsIgnoreCase("y")) {
				System.out.println("Yards from light?");
				int yards=sc.nextInt();
				if (yards <30) {
					System.out.println("Obstacle? (true/false)");
					boolean obstacle=sc.nextBoolean();
					if (!obstacle) {
						proceed= true;
					}
				}
			}
			else if (lightcolor.equalsIgnoreCase("g")) {
				System.out.println("Obstacle? (true/false)");
				boolean obstacle=sc.nextBoolean();
				if (!obstacle) {
					proceed= true;
				}
			}
			else {
				System.out.println("Invalid light color. Try again.");
				continue;
			}
			
			if (proceed) {
				System.out.println("Proceed!");
			}
			else {
				System.out.println("Stop!");
			}
			
			System.out.println("Again? y/n");
			choice=sc.next();
		}
		
		sc.close();
		System.out.println("Peace");

	}

}
