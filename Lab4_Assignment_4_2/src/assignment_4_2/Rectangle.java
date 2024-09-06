package assignment_4_2;

public class Rectangle extends ClosedCurve {

	private double width;
	private double height;
	private double area;
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return area;
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double computeArea() {
		area = width * height;
		return area;
	}

}
