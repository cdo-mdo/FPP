package lab02.assignment_2_7;

public class Prog7Test {
	static String generateAdditionProblem() {
		int[] randoms = new int[8];
		String output = "";
		
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = RandomNumbers.getRandomInt(1, 99);
		}
		output = String.format("%16d %12d %12d %12d %n %n", randoms[0], randoms[1], randoms[2], randoms[3]);
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", randoms[4], "+", randoms[5], "+", randoms[6], "+", randoms[7]);
		output += String.format("%16s %12s %12s %12s","____", "____", "____", "____");
		
		return output;
	}
	
	public static void main(String[] args){
		String output = generateAdditionProblem();
		System.out.println(output);
		System.out.println();
		output = generateAdditionProblem();
		System.out.println(output);
		
	}
}