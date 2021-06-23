package business;

public class Product {

	private int id;
	private int userId;
	private String partNbr;
	private String name;
	private double price;
	private String unit;
	private String photopath;
	
	
	public Product() {
		super();
	}


	public Product(int id, int userId, String partNbr, String name, double price, String unit, String photopath) {
		super();
		this.id = id;
		this.userId = userId;
		this.partNbr = partNbr;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photopath = photopath;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getPartNbr() {
		return partNbr;
	}


	public void setPartNbr(String partNbr) {
		this.partNbr = partNbr;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public String getPhotopath() {
		return photopath;
	}


	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", userId=" + userId + ", partNbr=" + partNbr + ", name=" + name + ", price="
				+ price + ", unit=" + unit + ", photopath=" + photopath + "]";
	}
	
	
	
}
