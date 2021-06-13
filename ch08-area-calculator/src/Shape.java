
public abstract class Shape {

	private double areaCircle;
	private double areaSquare;
	private double areaRectangle;
	
	
	public Shape() {
		super();
	}


	public Shape(double areaCircle, double areaSquare, double areaRectangle) {
		super();
		this.areaCircle = areaCircle;
		this.areaSquare = areaSquare;
		this.areaRectangle = areaRectangle;
	}


	public double getAreaCircle() {
		return areaCircle;
	}


	public void setAreaCircle(double areaCircle) {
		this.areaCircle = areaCircle;
	}


	public double getAreaSquare() {
		return areaSquare;
	}


	public void setAreaSquare(double areaSquare) {
		this.areaSquare = areaSquare;
	}


	public double getAreaRectangle() {
		return areaRectangle;
	}


	public void setAreaRectangle(double areaRectangle) {
		this.areaRectangle = areaRectangle;
	}


	public abstract double getArea();
	
	
}
