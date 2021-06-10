
public class Employee extends Person {

	private String ssn;

	public Employee() {
		super();
		ssn="";
	}

	public Employee(String ssn) {
		super();
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	String last4=ssn.substring(7);
	
	@Override
	public String toString() {
		return super.toString()+"SSN: xxx-xx-"+last4;
	}
	
	
	
}
