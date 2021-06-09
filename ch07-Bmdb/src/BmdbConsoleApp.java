import java.util.Scanner;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bmdb App!");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		int iD=Console.getInt("ID? ");
		String title=Console.getString("Title? ");
		int year=Console.getInt("Year? ");
		String rating=Console.getString("Rating? ");
		String director=Console.getString("Director? ");
		
		Movie m1=new Movie(iD, title, year, rating, director);
		
		printMovie(m1);
		
		
	System.out.println("Peace");
	}
	
	private static void printMovie(Movie m) {
		System.out.println("ID: "+m.getID());
		System.out.println("Title: "+m.getTitle() );
		System.out.println("Year: "+m.getYear() );
		System.out.println("Rating: "+m.getRating() );
		System.out.println("Director: "+m.getDirector());
	}
	
	
}
