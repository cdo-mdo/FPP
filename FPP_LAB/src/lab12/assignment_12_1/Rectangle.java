package lab12.assignment_12_1;

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

	Rectangle(double width, double height) throws IllegalClosedCurveException {
		if (width <= 0 || height <= 0) {
			throw new IllegalClosedCurveException("Illegal inputs width = " + width + " height = " + height);
		}
		this.width = width;
		this.height = height;
	}

	@Override
	double computeArea() {
		area = width * height;
		return area;
	}

}
