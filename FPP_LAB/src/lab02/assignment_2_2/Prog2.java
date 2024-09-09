package lab02.assignment_2_2;

public class Prog2 {
	public static void main(String[] args) {	
		int x = RandomNumbers.getRandomInt(1, 9);
		int y = RandomNumbers.getRandomInt(3, 14);
		
		System.out.println("Compute PI^" + x + " = " + Math.pow(Math.PI, x));
		System.out.println("Compute " + y + "^PI = " + Math.pow(y, Math.PI));
	}
}
