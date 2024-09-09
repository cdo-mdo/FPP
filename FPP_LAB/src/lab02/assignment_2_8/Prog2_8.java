package lab02.assignment_2_8;

public class Prog2_8 {
	static int min(int[] arrayOfInts) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arrayOfInts.length; i++) {
			if (min > arrayOfInts[i]) {
				min = arrayOfInts[i];
			}
		}
		return min;
	}
}
