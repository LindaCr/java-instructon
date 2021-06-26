package ui;

import com.util.Console;

public class GrammarTimeApp {

	public static void main(String[] args) {
		System.out.println("#========================#");
		System.out.println("|                        |");
		System.out.println("|      GRAMMAR TIME      |");
		System.out.println("|                        |");
		System.out.println("#========================#");
		System.out.println("     Parts of Speech      ");
		System.out.println();

		int command = 0;
		while (command != 6) {
			System.out.println();
			displayMenu();
			command = Console.getInt("Command");
			System.out.println();

			switch (command) {
			case 1:
				System.out.println("Nouns");
				System.out.println("---------------------");
				getNounOne();
				System.out.println();
				getNounTwo();
				System.out.println();
				getNounThree();
				System.out.println();
				getNounFour();
				System.out.println();
				getNounFive();
				System.out.println();
				break;
			case 2:
				System.out.println("Verbs");
				System.out.println("---------------------");
				getVerbOne();
				System.out.println();
				getVerbTwo();
				System.out.println();
				getVerbThree();
				System.out.println();
				getVerbFour();
				System.out.println();
				getVerbFive();
				System.out.println();
				break;
			case 3:
				System.out.println("Adjectives");
				System.out.println("---------------------");
				getAdjectiveOne();
				System.out.println();
				getAdjectiveTwo();
				System.out.println();
				getAdjectiveThree();
				System.out.println();
				getAdjectiveFour();
				System.out.println();
				getAdjectiveFive();
				System.out.println();
				break;
			case 4:
				System.out.println("Play a game! Madlibs!");
				System.out.println("---------------------");
				int choice = 0;
				while (choice != 4) {
					displayChoice();
					choice = Console.getInt("What number Madlib do you want to play? ");
					switch (choice) {
					case 1:
						getMadlibOne();
						break;
					case 2:
						getMadlibTwo();
						break;
					case 3:
						getMadlibThree();
						break;
					case 4:
						// exit
						break;
					default:
						System.out.println("Invalid choice. Choose again.");
						break;
					}
				}
				break;
			case 5:
				displayHelp();
				break;
			case 6:
				// exit
				break;
			default:
				System.out.println("Invalid entry. Try again.");
				break;
			}

		}

		System.out.println();
		System.out.println("Peace");
	}






	private static void getNounFive() {
		System.out.println("The funny girl ran away.");
		System.out.println();
		String sentence = "The funny girl ran away";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String answer = Console.getLine("What is the noun? ");
		if (answer.equalsIgnoreCase(thirdWord)) {
			System.out.println("Girl is the noun! Great job!");
		} else {
			System.out.println("Bummer. Better luck next time");
		}
		System.out.println();
	}

	private static void getNounFour() {
		System.out.println("His cat is fluffy.");
		System.out.println();
		String sentence = "His cat is fluffy";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String answer = Console.getLine("What is the noun? ");
		if (answer.equalsIgnoreCase(secondWord)) {
			System.out.println("Cat is the noun! Great job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getNounThree() {
		System.out.println("He kicked the red ball.");
		System.out.println();
		String sentence = "He kicked the red ball";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String answer = Console.getLine("What is the noun? ");
		if (answer.equalsIgnoreCase(fifthWord)) {
			System.out.println("Ball is the noun! Great job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getNounTwo() {
		System.out.println("We jumped on the enormous trampoline.");
		System.out.println();
		String sentence = "We jumped on the enormous trampoline";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String sixthword = sentenceParts[5];
		String answer = Console.getLine("What is the noun? ");
		if (answer.equalsIgnoreCase(sixthword)) {
			System.out.println("Trampoline is the noun! Great job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getNounOne() {
		System.out.println("The furry dog barks loudly.");
		System.out.println();
		String sentence = "The furry dog barks loudly";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String answer = Console.getLine("What is the noun? ");
		if (answer.equalsIgnoreCase(thirdWord)) {
			System.out.println("Dog is the noun! Great job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getAdjectiveFive() {
		System.out.println("His cat is fluffy.");
		System.out.println();
		String sentence = "His cat is fluffy";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String answer = Console.getLine("What is the adjective? ");
		if (answer.equalsIgnoreCase(fourthWord)) {
			System.out.println("Fluffy is the adjective! Great job!");
		} else {
			System.out.println("Bummer. Better luck next time.");
		}
		System.out.println();
	}

	private static void getAdjectiveFour() {
		System.out.println("They drive a fast car.");
		System.out.println();
		String sentence = "They drive a fast car";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String answer = Console.getLine("What is the adjective? ");
		if (answer.equalsIgnoreCase(fourthWord)) {
			System.out.println("Fast is the adjective! Spectacular job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getAdjectiveThree() {
		System.out.println("She danced under the bright sun.");
		System.out.println();
		String sentence = "She danced under the bright sun";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String sixthWord = sentenceParts[5];
		String answer = Console.getLine("What is the adjective? ");
		if (answer.equalsIgnoreCase(fifthWord)) {
			System.out.println("Bright is the adjective! Terrific job");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getAdjectiveTwo() {
		System.out.println("The clumsy kid fell down.");
		System.out.println();
		String sentence = "The clumsy kid fell down";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdword = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String answer = Console.getLine("What is the adjective? ");
		if (answer.equalsIgnoreCase(secondWord)) {
			System.out.println("Clumsy is the adjective! Great job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getAdjectiveOne() {
		System.out.println("The bouncy ball bounced so high.");
		System.out.println();
		String sentence = "The bouncy ball bounced so high";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String sixthWord = sentenceParts[5];
		String answer = Console.getLine("What is the Adjective? ");
		if (answer.equalsIgnoreCase(secondWord)) {
			System.out.println("Bouncy is the adjective! Fantastic job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void displayHelp() {
		System.out.println("Parts of Speech Helper");
		System.out.println("----------------------");
		System.out.println("Noun- a person, place, or thing");
		System.out.println("Examples- book, school, dog");
		System.out.println();
		System.out.println("Verb- a word that shows action or state of being");
		System.out.println("Examples- run, sing, play");
		System.out.println();
		System.out.println("Adjective- a word that describes a noun");
		System.out.println("Examples- large, purple, funny");
		System.out.println();
	}
	

	private static void getVerbOne() {
		System.out.println("He kicked the red ball.");
		System.out.println();
		String sentence = "He kicked the red ball";
		String[] sentenceParts = sentence.split(" ");
		String firstWord = sentenceParts[0];
		String secondWord = sentenceParts[1];
		String thirdWord = sentenceParts[2];
		String fourthWord = sentenceParts[3];
		String fifthWord = sentenceParts[4];
		String answer = Console.getLine("Which word is a verb? ");
		if (answer.equalsIgnoreCase(secondWord)) {
			System.out.println("Kicked is the verb! Great job!");
		} else {
			System.out.println("Try again.");
		}
		System.out.println();
	}

	private static void getVerbTwo() {
		System.out.println("The furry dog barks loudly.");
		System.out.println();
		String sentence = "The furry dog barks loudly";
		String[] sentenceParts = sentence.split(" ");
		String firstWord1 = sentenceParts[0];
		String secondWord1 = sentenceParts[1];
		String thirdWord1 = sentenceParts[2];
		String fourthWord1 = sentenceParts[3];
		String fifthWord1 = sentenceParts[4];
		String answer1 = Console.getLine("Which word is a verb? ");
		if (answer1.equalsIgnoreCase(fourthWord1)) {
			System.out.println("Barks is the verb! Great job!");
		} else {
			System.out.println("Try again.");
		}
		System.out.println();
	}

	private static void getVerbThree() {
		System.out.println("They played the old piano.");
		System.out.println();
		String sentence = "They played the old piano";
		String[] sentenceParts = sentence.split(" ");
		String firstWord2 = sentenceParts[0];
		String secondWord2 = sentenceParts[1];
		String thirdWord2 = sentenceParts[2];
		String fourthWord2 = sentenceParts[3];
		String fifthWord2 = sentenceParts[4];
		String answer2 = Console.getLine("What is the verb? ");
		if (answer2.equalsIgnoreCase(secondWord2)) {
			System.out.println("Played is the verb! Great job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getVerbFour() {
		System.out.println("The funny girl ran away.");
		System.out.println();
		String sentence = "The funny girl ran away";
		String[] sentenceParts = sentence.split(" ");
		String firstWord3 = sentenceParts[0];
		String secondWord3 = sentenceParts[1];
		String thirdWord3 = sentenceParts[2];
		String fourthWord3 = sentenceParts[3];
		String fifthWord3 = sentenceParts[4];
		String answer3 = Console.getLine("What is the verb? ");
		if (answer3.equalsIgnoreCase(fourthWord3)) {
			System.out.println("Ran is the verb! Great job!");
		} else {
			System.out.println("Try again");
		}
		System.out.println();
	}

	private static void getVerbFive() {
		System.out.println("We jumped on the enormous trampoline.");
		System.out.println();
		String sentence = "We jumped on the enormous trampoline";
		String[] sentenceParts = sentence.split(" ");
		String firstWord4 = sentenceParts[0];
		String secondWord4 = sentenceParts[1];
		String thirdWord4 = sentenceParts[2];
		String fourthWord4 = sentenceParts[3];
		String fifthWord4 = sentenceParts[4];
		String sixthWord4 = sentenceParts[5];
		String answer4 = Console.getLine("What is the verb? ");
		if (answer4.equalsIgnoreCase(secondWord4)) {
			System.out.println("Jumped is the verb! Great Job!");
		} else {
			System.out.println("Bummer. Better luck next time.");
		}
		System.out.println();
	}

	private static void getMadlibOne() {
		String wrd1 = Console.getLine("Enter an adjective: ");
		String wrd2 = Console.getLine("Enter a plural food: ");
		String wrd3 = Console.getLine("Enter a verb: ");
		String wrd4 = Console.getLine("Enter a saying: ");
		String wrd5 = Console.getLine("Enter a noun: ");
		String wrd6 = Console.getLine("Enter a plural food: ");
		String wrd7 = Console.getLine("Enter a color: ");
		String wrd8 = Console.getLine("Enter an animal: ");
		String wrd9 = Console.getLine("Enter a person: ");
		String wrd10 = Console.getLine("Name something you ride in: ");
		System.out.println();
		System.out.println("Today I went to my favorite Taco Stand called the " + wrd1 + " " + wrd8
				+ ".\n Unlike most food stands, they cook and prepare the food in a " + wrd10 + " while you " + wrd3
				+ ". \nThe best thing on the menu is the " + wrd7 + " " + wrd5
				+ ". \nInstead of ground beef they fill the taco with " + wrd2
				+ ", cheese, and top it off with a salsa made from " + wrd6
				+ ". \nIf that doesn't make your mouth water, then it's just like " + wrd9 + " always says: " + wrd4
				+ "!");
		System.out.println();
	}
	
	private static void getMadlibTwo() {
		String wrd1 = Console.getLine("Enter adjective: ");
		String wrd2 = Console.getLine("Enter noun: ");
		String wrd3 = Console.getLine("Enter adjective: ");
		String wrd4 = Console.getLine("Enter a place: ");
		String wrd5 = Console.getLine("Enter adjective: ");
		String wrd6 = Console.getLine("Enter adjective: ");
		String wrd7 = Console.getLine("Enter plural vehicle: ");
		String wrd8 = Console.getLine("Enter adjective: ");
		String wrd9 = Console.getLine("Enter plural noun: ");
		String wrd10 = Console.getLine("Enter adjective: ");
		String wrd11 = Console.getLine("Enter plural noun: ");
		String wrd12 = Console.getLine("Enter plural noun: ");
		String wrd13 = Console.getLine("Enter adjective: ");
		String wrd14 = Console.getLine("Enter noun: ");
		String wrd15 = Console.getLine("Enter verb: ");
		String wrd16 = Console.getLine("Enter adjective: ");
		String wrd17 = Console.getLine("Enter verb: ");
		String wrd18 = Console.getLine("Enter plural noun: ");
		String wrd19 = Console.getLine("Enter plural job: ");
		String wrd20 = Console.getLine("Enter adjective: ");
		String wrd21 = Console.getLine("Enter verb: ");
		String wrd22 = Console.getLine("Enter adjective: ");
		System.out.println();
		System.out.println("Star Wars is a " + wrd1 + " " + wrd2 + " of " + wrd3 + " versus evil in a " + wrd4
				+ "\n far far away. There are " + wrd5 + " battles between " + wrd6 + " " + wrd7 + " in " + wrd8
				+ "\n space and duels with " + wrd9 + " called " + wrd10 + " sabers. " + wrd11
				+ "\n called droids are helpers and " + wrd12 + " to the heroes. A " + wrd13 + "\n power called The "
				+ wrd14 + " " + wrd15 + " people to do " + wrd16 + " things, like " + wrd17 + " " + wrd18
				+ ".\n The Jedi " + wrd19 + " use The Force for the " + wrd20 + " side and the Sith " + wrd21
				+ "\n it for the " + wrd22 + " side.");
		System.out.println();
	}
	

	private static void getMadlibThree() {
		String wrd1=Console.getLine("Enter plural noun: ");
		String wrd2=Console.getLine("Enter adjective: ");
		String wrd3=Console.getLine("Enter plural animal: ");
		String wrd4=Console.getLine("Enter plural noun: ");
		String wrd5=Console.getLine("Enter adjective: ");
		String wrd6=Console.getLine("Enter a color: ");
		String wrd7=Console.getLine("Enter adjective: ");
		String wrd8=Console.getLine("Enter noun: ");
		String wrd9=Console.getLine("Enter plural noun: ");
		String wrd10=Console.getLine("Enter adjective: ");
		String wrd11=Console.getLine("Enter verb: ");
		String wrd12=Console.getLine("Enter plural noun: ");
		String wrd13=Console.getLine("Enter past tense verb: ");
		String wrd14=Console.getLine("Enter verb: ");
		String wrd15=Console.getLine("Enter noun: ");
		String wrd16=Console.getLine("Enter adjective: ");
		System.out.println();
		System.out.println("Unicorns aren't like other "+wrd1+"; they're "+wrd2+
							".\n They look like "+wrd3+", with "+wrd4+" for feet and a "+
							wrd5+"\n mane of hair. But unicorns are "+wrd6+" and have a "+
							wrd7+" "+wrd8+"\n on their heads. Some "+wrd9+" don't believe unicorns are "+
							wrd10+"\n but I believe in them. I would love to "+wrd11+ 
							"\n a unicorn to faraway "+wrd12+". One thing I've always "+wrd13+
							"\n about is whether unicorns "+wrd14+" rainbows, or is their \n"+
							wrd15+" "+wrd16+" like any other animal's?");
		System.out.println();
	}
	

	private static void displayMenu() {
		System.out.println("Menu");
		System.out.println("----------------------");
		System.out.println("1- Practice nouns ");
		System.out.println("2- Practice verbs ");
		System.out.println("3- Practice adjectives ");
		System.out.println("4- Play a game ");
		System.out.println("5- Explain the parts of speech ");
		System.out.println("6- Exit ");
		System.out.println();
	}

	private static void displayChoice() {
		System.out.println("Choose a Madlib!");
		System.out.println("-----------------");
		System.out.println("1- Madlib One ");
		System.out.println("2- Madlib Two ");
		System.out.println("3- Madlib Three ");
		System.out.println("4-exit Madlibs ");
		System.out.println();
	}

}
