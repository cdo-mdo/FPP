package lab04.assignment_4_2;

public final class Square extends ClosedCurve {
	private final double side;

	public Square(double side) {
		this.side = side;

	}

	@Override
	public double computeArea() {
		return side * side;
	}

}
