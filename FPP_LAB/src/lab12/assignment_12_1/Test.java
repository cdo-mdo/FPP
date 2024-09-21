package lab12.assignment_12_1;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 7), new Circle(3) };
		// compute areas
		StringBuilder buffer = new StringBuilder();;
		for (ClosedCurve cc : objects) {
			buffer.append("The area of this " + cc.getClass().getSimpleName() + " is " + cc.computeArea() + "\n");
		}
		System.out.println(buffer.toString());
	}

}