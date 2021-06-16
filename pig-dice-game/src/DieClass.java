
public class DieClass {

	
	private int result;

	public DieClass() {
		super();
		result=rollDie();
	}

	public DieClass(int result) {
		super();
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public static int rollDie() {
		return (int) (Math.random() * 6) + 1;
	}

}
