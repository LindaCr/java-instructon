package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

import business.Movie;
import business.MovieCollection;

public class MovieRatingApp {
	

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Rating App");

		int command=0;
		while (command!=6) {
			displayMenu();
			command=Console.getInt("Menu Choice");
			System.out.println();
		
			switch (command) {
			case 1:
				System.out.println("Enter a movie: ");
				System.out.println("---------------");
				//add a movie
				break;
			case 2:
				System.out.println("View top rated movies");
				System.out.println("---------------------");
				break;
			case 3:
				System.out.println("View most recent movies");
				System.out.println("-----------------------");
				break;
			case 4:
				System.out.println("View all movies");
				System.out.println("---------------");
				//get all movies
				break;
			case 5:
				System.out.println("View Ratings");
				System.out.println("------------");
				break;
			case 6:
				//quit
				break;
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
		
		
		
		
		}
		System.out.println();
		System.out.println("Peace");
	}

	private static void displayMenu() {
		System.out.println("---------------------------");
		System.out.println("  What do you want to do?  ");
		System.out.println("---------------------------");
		System.out.println("1. Enter a movie ");
		System.out.println("2. View top rated movies ");
		System.out.println("3. View most recent movies ");
		System.out.println("4. View all movies ");
		System.out.println("5. View Ratings ");
		System.out.println("6. Quit Application ");
		System.out.println("---------------------------");
	}
	
}
