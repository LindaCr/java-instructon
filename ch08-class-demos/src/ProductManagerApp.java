
public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager");

		Book b=new Book("java","Murach's Java Programming",
						57.50, "Joel Murach");
		
		Software s=new Software ("netbeans","NetBeans",0,"8.2");
		
		System.out.println(b);
		System.out.println(s);
		
		Product p=b;
		System.out.println("p toString: "+p);
		
		//p 281 equals method
		Product p1=new Product("andr","Murach's Android",5.99);
		Product p2=new Product("andr","Murach's Android",5.99);
		
		if (p1.equals(p2))	{
			System.out.println("Same Book");
		}
		else {
			System.out.println("Different Book");
		}
		
		System.out.println("Peace");
	}

}
