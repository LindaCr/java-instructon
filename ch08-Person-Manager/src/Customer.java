
public class Customer extends Person {

	
	private String custNumber;

	public Customer() {
		super();
		custNumber="";
	}

	public Customer(String custNumber) {
		super();
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
		return super.toString()+"Customer Number: "+custNumber;
	}
	
	
	
	
	
}
