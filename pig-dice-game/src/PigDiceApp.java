import com.util.Console;

public class PigDiceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Dice Game!");
		System.out.println();
		
		String choice= "y";
		while (choice.equalsIgnoreCase("y")) {
			
			int roll=0;
			int totalScore=0;
			int count=1;
			int totalGames=Console.getInt("Number of games to play? ");
			
			for (int i=1; i<=totalGames; i++) {
				
				while (roll!=1) {
					roll=DieClass.rollDie();
					System.out.println(roll);
					totalScore+=roll;
					count++;
				}
				
				System.out.println("Number of games played: "+totalGames);
				System.out.println("Highest Score is: "+totalScore);
				
			}
			
			
			
			choice=Console.getString("Play Again? y/n", "y", "n");
		
		
		}
		System.out.println("Peace");

		}	

}

