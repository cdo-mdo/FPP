package assignment_3_4;

public final class Triangle {
	private double base;
	private double height;
	private double area;

	private double side1;
	private double side2;
	private double side3;

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		return area;
	}

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		calculateArea();
	}

	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

		double p = (side1 + side2 + side3) / 2;
		this.base = Integer.MIN_VALUE;
		if (base < side1) {
			base = side1;
			height = 2 * Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)) / side1;
		}
		if (base < side2) {
			base = side2;
			height = 2 * Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)) / side2;
		}
		if (base < side3) {
			base = side3;
			height = 2 * Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)) / side3;
		}
		calculateArea();
	}

	private void calculateArea() {
		area = base * height * 1 / 2;
	}
}
