import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Roll the dice? y/n");
		String roll=sc.next();
		//String choice=getNextString(sc,"Roll the dice? y/n");
		
		int die1=1;
		int die2=1;
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			
			die1= (int) (Math.random()*6)+1;
			die2= (int) (Math.random()*6)+1;
			int total= die1+die2;
			//int die1=rollDie;
			//int die2=rollDie;
			
			System.out.println("Die 1: "+die1);
			System.out.println("Die 2: "+die2);
			System.out.println("Total: "+total);
			//printResults(die1, die2);
			
			if (die1==1 && die2==1) {
				total=2;
				System.out.println("Snake Eyes!");
			}
			if (die1==6 && die2==6) {
				total=12;
				System.out.println("Boxcars!");
			}
			
			
			
			System.out.println("Roll Again? y/n");
			choice=sc.next();
			//System.out.println();
			//choice=getNextString(sc, "Roll again? y/n");
		}
		
		sc.close();
		System.out.println("Peace");

	}
		//private static String getNextString(Scanner sc, String prompt) {
			//System.out.print(prompt);
			//return sc.next();
		//}
		
		//private static int rollDie() {
			//return (int) (Math.random()*6) +1;
		//}
		
		//private static void printResults(int die1, int die2) {
			//int total=die1+die2;
			//System.out.println("Die1: "+die1);
			//System.out.println("Die2: "+die2);
			//System.out.println("Total: "+total);
			//if (total==2) {
				//System.out.println("Snake Eyes!");
			//}
			//else if (total==12) {
				//System.out.println("Boxcars!");
			//}
		
		
	
	



}
