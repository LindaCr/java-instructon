
package ui;

import com.util.Console;

import business.Movie;
import db.MovieDB;
import interfaces.DAO;
import text.MovieTextFile;

public class MovieManagerApp {
	private static final String ITEM_NOT_FOUND= "No item found for id: ";
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Manager App");


		//creating instance of of itemtextfile should create file
		DAO<Movie> moviesDAO= new MovieDB();
		
		int command=0;
		while (command!=9) {
			displayMenu();
			command=Console.getInt("Command");
			System.out.println();
			
			switch (command) {
			case 1:
				//get all
				System.out.println("Get all movies");
				System.out.println("=================");
				for (Movie movie: moviesDAO.getAll()) {
					System.out.println(movie);
				}
				break;
			case 2:
				//get item
				System.out.println("Get an Movie");
				System.out.println("================");
				int id=Console.getInt("ID: ");
				Movie movie= moviesDAO.get(id);
				if (movie!=null) {
					System.out.println("Movie found: "+movie);
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 3:
				//add
				System.out.println("Add an movie: ");
				System.out.println("==================");
			    //id=Console.getInt("ID: "); 
				String title=Console.getLine("Title: ");
				int year=Console.getInt("Year: ");
				String rating=Console.getLine("Rating: ");
				String director=Console.getLine("Director: ");		
				if    (moviesDAO.add(new Movie(title, year, rating, director))) {
					System.out.println("Movie added!");
				}
				else {
					System.out.println("Error adding movie.");
				}
				break;
			case 4:
				//update
				System.out.println("Update an movie: ");
				System.out.println("==================");
				id=Console.getInt("ID: ");
				movie= moviesDAO.get(id);
				if (movie!=null) {
					String newTitle=Console.getLine("New Title: ");
					int newYear=Console.getInt("Updated Year: ");
					String newRating=Console.getLine("Updated Rating: ");
					String newDirector=Console.getLine("Updated Director: ");
					movie.setTitle(newTitle);
					movie.setYear(newYear);
					movie.setRating(newRating);
					movie.setDirector(newDirector);
					moviesDAO.update(movie);
					System.out.println("Movie updated!");
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 5:
				//delete
				System.out.println("Delete an movie:  ");
				System.out.println("===================");
				id=Console.getInt("ID: ");
				movie= moviesDAO.get(id);
				if (movie!=null) {
					moviesDAO.delete(movie);
					System.out.println("Movie deleted: "+movie);
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 9:
				//exit
				break;
			default:	
				System.out.println("Invalid command! Try again.");
				break;
			}
			
			
			
			System.out.println("Peace");
		}
		
	}
	private static void displayMenu() {
		System.out.println("Command menu");
		System.out.println("=================");
		System.out.println("1- Get all movies");
		System.out.println("2- Get an movies");
		System.out.println("3- Add a movie");
		System.out.println("4- Update a movie-don't use right now");
		System.out.println("5- Delete a movie");
		System.out.println("9- exit");
		System.out.println();
	}

}