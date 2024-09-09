package lab04.assignment_4_5;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;

	public Square(double side) {
		this.side = side;

	}

	public double computeArea() {
		return side * side;
	}

	@Override
	public String polygonType() {
		return "Square";
	}

	@Override
	public double[] getArrayOfSides() {
		double[] res = new double[4];
		res[0] = side;
		res[1] = side;
		res[2] = side;
		res[3] = side;
		return res;
	}

	@Override
	public double computePerimeter() {
		return side * 4;
	}
}
