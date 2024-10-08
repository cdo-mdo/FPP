package lab12.assignment_12_1;

public final class Circle extends ClosedCurve {
	private final double radius;

	public Circle(double radius) throws IllegalClosedCurveException {
		if (radius <= 0) {
			throw new IllegalClosedCurveException("Illegal radius number " + radius);
		}
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
}
