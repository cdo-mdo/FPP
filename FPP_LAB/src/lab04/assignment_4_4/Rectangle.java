package lab04.assignment_4_4;

public class Rectangle extends ClosedCurve implements Polygon {

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

	@Override
	public int getNumberOfSides() {
		return 4;
	}

	@Override
	public double computePerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String polygonType() {
		return "Rectangle";
	}

}
