package lab04.assignment_4_4;

public final class Circle extends ClosedCurve implements Polygon {
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return (Math.PI * radius * radius);
	}

	@Override
	public String polygonType() {
		return "Circle";
	}

	@Override
	public int getNumberOfSides() {
		return 1;
	}

	@Override
	public double computePerimeter() {
		return Math.PI * 2 * radius;
	}
}
