package lab04.assignment_4_5;

public interface Polygon {
	public String polygonType();

	public double[] getArrayOfSides();

	static public double sum(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	default double computePerimeter() {
		double[] sides = getArrayOfSides();
		return Polygon.sum(sides);
	}
}
