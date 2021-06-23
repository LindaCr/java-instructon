
package ui;

import java.time.LocalDate;
import java.util.List;

import com.util.Console;

import business.Actor;
import business.Credit;
import business.Movie;
import db.ActorDB;
import db.CreditDB;
import db.MovieDB;
import interfaces.DAO;


public class MovieManagerApp {
	private static final String ITEM_NOT_FOUND= "No item found for id: ";
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Manager App");


		//creating instance of of itemtextfile should create file
		DAO<Movie> moviesDAO= new MovieDB();
		DAO<Actor> actorsDAO= new ActorDB();
		CreditDB creditsDB= new CreditDB();
		
		int command=0;
		while (command!=99) {
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
				//get movie
				System.out.println("Get a Movie");
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
				System.out.println("Add a movie: ");
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
				System.out.println("Update a movie: ");
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
				System.out.println("Delete a movie:  ");
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
			case 6:
				//get all
				System.out.println("Get all actors");
				System.out.println("=================");
				for (Actor actor: actorsDAO.getAll()) {
					System.out.println(actor);
				}
				break;
			case 7:
				//get actor
				System.out.println("Get an Actor");
				System.out.println("================");
				 id=Console.getInt("ID: ");
				Actor actor= actorsDAO.get(id);
				if (actor!=null) {
					System.out.println("Actor found: "+actor);
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 8:
				//add
				System.out.println("Add an actor: ");
				System.out.println("==================");
			    //id=Console.getInt("ID: "); 
				String firstName=Console.getLine("First Name: ");
				String lastName=Console.getLine("Last Name: ");
				String gender=Console.getLine("Gender: ");
				String birthdateStr=Console.getString("Birthdate: ");
				LocalDate birthdate= LocalDate.parse(birthdateStr);
				if    (actorsDAO.add(new Actor(firstName, lastName, gender, birthdate))) {
					System.out.println("Actor added!");
				}
				else {
					System.out.println("Error adding actor.");
				}
				break;
			case 9:
				//delete
				System.out.println("Delete an actor:  ");
				System.out.println("===================");
				id=Console.getInt("ID: ");
				actor= actorsDAO.get(id);
				if (actor!=null) {
					actorsDAO.delete(actor);
					System.out.println("Actor deleted: "+actor);
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 10:
				//get all
				System.out.println("Get all credits");
				System.out.println("=================");
				for (Credit credit: creditsDB.getAll()) {
					System.out.println(credit.getCreditString());
					System.out.println("-----------------------");
				}
				break;
			case 11:
				//get credit
				System.out.println("Get a Credit");
				System.out.println("================");
				id=Console.getInt("ID: ");
				Credit credit= creditsDB.get(id);
				if (credit!=null) {
					System.out.println("Credit found: "+credit.getCreditString());
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 12:
				//add
				System.out.println("Add a credit: ");
				System.out.println("==================");
			    //id=Console.getInt("ID: "); 
			    //int actorId=Console.getInt("Actor ID ");
			    // actor= actorsDAO.get(id);
				//int movieId=Console.getInt("Movie ID: ");
				 //movie= moviesDAO.get(id);
				//String role=Console.getLine("Role: ");		
				//if    (creditsDB.add(new Credit(actor , movie, role))) {
				//	System.out.println("Credit added!");
				//}
				//else {
					//System.out.println("Error adding credit.");
				//}
				break;
			case 13:
				System.out.println("Delete a credit:  ");
				System.out.println("===================");
				id=Console.getInt("ID: ");
				credit= creditsDB.get(id);
				if (credit!=null) {
					creditsDB.delete(credit);
					System.out.println("Credit deleted: "+credit);
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 14:
				System.out.println("Get credits for a movie: ");
				System.out.println("=========================");
				id=Console.getInt("Movie ID: ");
			    movie= moviesDAO.get(id);
				if (movie!=null) {
					List<Credit> credits = creditsDB.getCreditsForMovie(movie);
					System.out.println("Credits for \""+movie.getTitle()+ 
							"("+movie.getYear()+")\":");
					System.out.println("==========================================");
					for (Credit c: credits) {
						System.out.println(c.getActor().getFullName()+" - "+c.getRole());
				}
				}else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 99:	
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
		System.out.println("4- Update a movie- don't use");
		System.out.println("5- Delete a movie");
		System.out.println("-------------------");
		System.out.println("6- Get all actors");
		System.out.println("7- Get an actor");
		System.out.println("8- Add an actor");
		System.out.println("9- Delete an actor");
		System.out.println("-------------------");
		System.out.println("10- Get all credits");
		System.out.println("11- Get a credit");
		System.out.println("12- Add a credit");
		System.out.println("13- Delete a credit");
		System.out.println("14- Get credits by movie");
		System.out.println("99- exit");
		System.out.println();
	}

}