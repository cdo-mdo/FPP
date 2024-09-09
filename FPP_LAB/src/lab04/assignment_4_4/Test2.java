package lab04.assignment_4_4;

public class Test2 {
	public static void main(String[] args) {
		Polygon[] objects = { new Square(3), new Triangle(4, 5, 6), new Rectangle(3, 4) };

		StringBuilder buffer = new StringBuilder();
		for (Polygon obj : objects) {
			buffer.append("For this " + obj.polygonType() + "\n");
			buffer.append("    Number of sides = " + obj.getNumberOfSides() + "\n");
			buffer.append("    Perimeter = " + obj.computePerimeter() + "\n");
		}

		System.out.println(buffer.toString());
	}
}
