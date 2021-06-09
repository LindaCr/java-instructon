
public class Product {

	//p 217 business class, pojo, or javabean
	//1.create instance variables
	//2.generate or create constructors
	//3.generate or create getters and setters
	//4.Optional-toString()
	private String code;
	private String description;
	private double price;
	
	//default or empty constructor
	public Product() {
		//by default Java sets primitive numeric type to 0 and 
		//string types to null
		
	}
	
	//fully loaded constructor
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code=code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
	
	
}
