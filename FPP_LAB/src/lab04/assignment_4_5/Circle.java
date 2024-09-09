package lab04.assignment_4_5;

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
	public double[] getArrayOfSides() {
		double[] res = new double[1];
		res[0] = Math.PI * radius * 2;
		return res;
	}

}
