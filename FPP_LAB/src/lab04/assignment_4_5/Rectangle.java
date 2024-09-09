package lab04.assignment_4_5;

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
	public double[] getArrayOfSides() {
		double[] res = new double[4];
		res[0] = this.height;
		res[1] = this.width;
		res[2] = this.height;
		res[3] = this.width;
		return res;
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
