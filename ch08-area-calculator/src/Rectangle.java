
public class Rectangle extends Shape {

	private double length;
	private double widthr;
		
	
	public Rectangle() {
		super();
	}


	public Rectangle(double length, double widthr) {
		super();
		this.length = length;
		this.widthr = widthr;
	}



	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return widthr;
	}


	public void setWidth(double widthr) {
		this.widthr = widthr;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
