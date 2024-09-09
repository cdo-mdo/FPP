package lab03.assignment_3_4;

public class Main {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(8, 4);
		Triangle triangle2 = new Triangle(5, 8, 6.4);
		Rectangle rectangle = new Rectangle(9, 4);
		Circle circle = new Circle(5);

		System.out.printf("Area of Triangle is: %.2f\n", triangle.getArea());
		System.out.printf("Area of Rectangle is: %.2f\n", rectangle.getArea());
		System.out.printf("Area of Circle is: %.2f\n", circle.getArea());

		System.out.printf("Area of Triangle2 is: %.2f\n", triangle2.getArea());
	}
}
