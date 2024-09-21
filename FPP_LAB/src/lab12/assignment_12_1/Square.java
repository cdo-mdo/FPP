package lab12.assignment_12_1;

public final class Square extends ClosedCurve {
	private final double side;

	public Square(double side) throws IllegalClosedCurveException {
		if (side <= 0) {
			throw new IllegalClosedCurveException("Illegal side number = " + side);
		}
		this.side = side;

	}

	@Override
	public double computeArea() {
		return side * side;
	}

}
