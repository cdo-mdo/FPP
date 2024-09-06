package assignment_2_3;

public class Prog3 {
	public static void main(String[] args) {
		float var1 = (float) 1.27;
		float var2 = (float) 3.881;
		float var3 = (float) 9.6;
		
		float sum = var1 + var2 + var3;
		int intSum1 = (int) sum;
		int intSum2 = Math.round(sum);
		
		System.out.println("result of int sum by cast: " + sum + " " + intSum1);
		System.out.println("result of int sum by Math.round(): " + intSum2);
		
	}
}
