package lab03.assignment_3_4;

public class Rectangle {
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

	Rectangle(double height, double width) {
		this.height = height;
		this.width = width;

		area = height * width;
	}

}
