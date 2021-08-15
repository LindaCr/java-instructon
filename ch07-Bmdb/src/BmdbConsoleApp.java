import java.util.Scanner;

public class BmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bmdb App!");
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		int id=Console.getInt("ID? ");
		String title=Console.getLine("Title? ");
		int year=Console.getInt("Year? ");
		String rating=Console.getString("Rating? ");
		String director=Console.getLine("Director? ");
		
		//make a new movie object
		Movie m1=new Movie(id, title, year, rating, director);
		System.out.println();
		System.out.println("Movie Summary: ");
		System.out.println("===============");
		System.out.println(m1);
		
	System.out.println();	
	System.out.println("Peace");
	}
	

	
	
}
