package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		int command=0;
		while (command!=6) {
			System.out.println();
			displayMenu();
			command=Console.getInt("Command");
			System.out.println();
		
			switch (command) {
			case 1:
				System.out.println("Nouns");
				System.out.println("---------------------");
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
				break;
			case 3:
				System.out.println("Adjectives");
				System.out.println("---------------------");
				getAdjectiveOne();
				System.out.println();
				
				break;
			case 4:
				System.out.println("Play a game! Madlibs!");
				System.out.println("---------------------");
				break;
			case 5:
				displayHelp();
				break;
			case 6:
				//exit
			default:
				System.out.println("Invalid entry. Try again.");
			}
		
		}
		
		System.out.println();
		System.out.println("Peace");
	}
	private static void getAdjectiveOne() {
		System.out.println("The bouncy ball bounced so high.");
		String sentence="The bouncy ball bounced so high";
		String[]sentenceParts= sentence.split(" ");
		String firstWord= sentenceParts[0];
		String secondWord= sentenceParts[1];
		String thirdWord= sentenceParts[2];
		String fourthWord= sentenceParts[3];
		String fifthWord= sentenceParts[4];
		String sixthWord= sentenceParts[5];
		String answer=Console.getLine("What is the Adjective?");
		if (answer.equalsIgnoreCase(secondWord)) {
			System.out.println("Bouncy is the adjective! Fantastic job!");
		}else {
			System.out.println("Try again");
		}
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
	}
	private static void getVerbOne() {
		System.out.println("He kicked the red ball.");
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
	}
	private static void getVerbTwo() {
		System.out.println("The furry dog barks loudly.");
		String sentence="The furry dog barks loudly";
		String[]sentenceParts=sentence.split(" ");
		String firstWord1=sentenceParts[0];
		String secondWord1=sentenceParts[1];
		String thirdWord1=sentenceParts[2];
		String fourthWord1=sentenceParts[3];
		String fifthWord1=sentenceParts[4];
		String answer1=Console.getLine("Which word is a verb?");
		if (answer1.equalsIgnoreCase(fourthWord1)) {
			System.out.println("Barks is the verb! Great job!");
		}else {
			System.out.println("Try again.");
		}
	}
	private static void getVerbThree() {
		System.out.println("They played the old piano.");
		String sentence="They played the old piano";
		String[] sentenceParts=sentence.split(" ");
		String firstWord2=sentenceParts[0];
		String secondWord2=sentenceParts[1];
		String thirdWord2=sentenceParts[2];
		String fourthWord2=sentenceParts[3];
		String fifthWord2=sentenceParts[4];
		String answer2=Console.getLine("What is the verb?");
		if (answer2.equalsIgnoreCase(secondWord2)) {
			System.out.println("Played is the verb! Great job!");
		}else {
			System.out.println("Try again");
		}
	}
	private static void getVerbFour() {
		System.out.println("The funny girl ran away.");
		String sentence="The funny girl ran away";
		String[] sentenceParts=sentence.split(" ");
		String firstWord3=sentenceParts[0];
		String secondWord3=sentenceParts[1];
		String thirdWord3=sentenceParts[2];
		String fourthWord3=sentenceParts[3];
		String fifthWord3=sentenceParts[4];
		String answer3=Console.getLine("What is the verb?");
		if (answer3.equalsIgnoreCase(fourthWord3)) {
			System.out.println("Ran is the verb! Great job!");
		}else {
			System.out.println("Try again");
		}
	}
	private static void getVerbFive() {
		System.out.println("We jumped on the enormous trampoline.");
		String sentence="We jumped on the enormous trampoline";
		String[] sentenceParts=sentence.split(" ");
		String firstWord4=sentenceParts[0];
		String secondWord4=sentenceParts[1];
		String thirdWord4=sentenceParts[2];
		String fourthWord4=sentenceParts[3];
		String fifthWord4=sentenceParts[4];
		String sixthWord4=sentenceParts[5];
		String answer4=Console.getLine("What is the verb?");
		if (answer4.equalsIgnoreCase(secondWord4)) {
			System.out.println("Jumped is the verb! Great Job!");
		}else {
			System.out.println("Bummer. Better luck next time.");
		}
	}


		private static void displayMenu() {
			System.out.println("Menu");
			System.out.println("----------------------");
			System.out.println("1- Practice nouns");
			System.out.println("2- Practice verbs");
			System.out.println("3- Practice adjectives");
			System.out.println("4- Play a game");
			System.out.println("5- Explain the parts of speech");
			System.out.println("6- Exit");
			System.out.println();
		}
		

		
}
