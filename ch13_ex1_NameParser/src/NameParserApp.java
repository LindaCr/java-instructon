

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        //int idx=name.indexOf(" ");
		//System.out.println(idx);
		//String firstName= name.substring(0,idx);
		//System.out.println("First name: "+firstName);
		//int idx1=name.indexOf(" ", idx+1);
		//String middleName= name.substring(idx+1,idx1);
		//System.out.println("Middle name: "+middleName);
		//String lastName=name.substring(idx1+1);
		//System.out.println("Last name: "+lastName);
		
		String[] nameParts=name.split(" ");
		String firstName= nameParts [0];
		String middleName= nameParts [1];
		String lastName= nameParts [2];
		System.out.println("First Name: "+firstName);
		System.out.println("Middle Name: "+middleName);
		System.out.println("Last Name: "+lastName);
		
    }
}
    
    
