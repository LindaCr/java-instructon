package ui;

public class StringDemoApp {

	public static void main(String[] args) {
		System.out.println("Hey");

		String name= "Robert Nesta Marley";
		int idx=name.indexOf(" ");
		System.out.println(idx);
		String firstName= name.substring(0,idx);
		System.out.println("firstname= "+firstName);
		int idx1=name.indexOf(" ", idx+1);
		String middleName= name.substring(idx+1,idx1);
		System.out.println("middle name= "+middleName);
		String lastName=name.substring(idx1+1);
		System.out.println("last name= "+lastName);
		
		
		String sentence="Hello-there-how-are-you?";
		//replace dashes with spaces
		sentence=sentence.replace("-", " ");
		System.out.println(sentence);
		//parse the sentence into a word array
		String [] words=sentence.split(" ");
		for (String word: words) {
			System.out.println(word);
		}
		
		//p431
		StringBuilder abc= new StringBuilder("abcdefghij");
		
		
		
		
		System.out.println("Peace");
	}

}
