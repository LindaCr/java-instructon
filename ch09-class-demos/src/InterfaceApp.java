
public class InterfaceApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Book b1=new Book("java","Murach's Java Programming",
							57.5, "Joel Murach");
		
		System.out.println(b1); //calls toString
		printIt(b1);
		
		//p 316 cloneable
		Book b2=(Book)b1.clone();
		
		
		System.out.println("B2: ");
		printIt(b2);
	}

	private static void printIt(Printable p) {
		p.print();
	}
	
	
}
