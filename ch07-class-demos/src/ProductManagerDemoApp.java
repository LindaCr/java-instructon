
public class ProductManagerDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager");
		
		//p225 create products, use empty constructors
		Product p1= new Product();
		p1.setCode("java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(57.5);
		printProduct(p1);
		
		//fully loaded constructor
		Product p3=new Product("andr","Murach's Android Programming", 59.50);
		Product p2=new Product("andr","Murach's Android Programming", 59.50);
		printProduct(p2);
		printProduct(p3);
		
		///this is checking to see if they are the same object in memory
		//not checking if it's the same book
		if (p2==p3) {
			System.out.println("Same!");
		}
		
		//redid after override toString in Product class
		System.out.println(p1);
		
		System.out.println("Peace");

	}

	private static void printProduct(Product p) {
		System.out.println("Product Detail: ");
		System.out.println("code: "+ p.getCode());
		System.out.println("desc: "+ p.getDescription());
		System.out.println("Price: "+ p.getPrice());
	}
	
	
	
}
