package lab07.assignment_7_1;

public class Exponential {

	public double power(double x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}
	
	public static void main(String[] args) {
		Exponential exponetial = new Exponential();
		System.out.println(exponetial.power(2, 10));
	}

}
