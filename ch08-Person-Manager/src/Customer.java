
public class Customer extends Person {

	
	private String custNumber;

	public Customer() {
		super();
		custNumber="";
	}

	

	public Customer(String firstName, String lastName, String custNumber) {
		super(firstName, lastName);
		this.custNumber = custNumber;
	}



	public String getCustNumber() {
		return custNumber;
	}

	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCustomer Number: "+custNumber;
	}
	
	
	
	
	
}
