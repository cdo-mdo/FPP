package assignment_3_4;

public class Circle {
	private double radius;
	private double area;

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return area;
	}

	Circle(double radius) {
		this.radius = radius;

		area = Math.pow(radius, 2) * Math.PI;
	}

}
