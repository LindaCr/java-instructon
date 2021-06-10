import com.util.Console;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter App");
		System.out.println();

		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			int numGrade=Console.getInt("Enter Numeric Grade ", -1, 101);
			Grade g=new Grade(numGrade);
			System.out.println("Letter Grade: "+g.getLetter());
			
			choice=Console.getString("Continue? y/n", "y", "n");
		}
		
		System.out.println("Peace");
	}

}
