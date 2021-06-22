package business;

public class Actor {

	private int ID;
	private String firstname;
	private String lastname;
	private String gender;
	
	
	public Actor() {
		super();
	}


	public Actor(int iD, String firstname, String lastname, String gender) {
		super();
		ID = iD;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Actor [ID=" + ID + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + "]";
	}
	
	
	
}
