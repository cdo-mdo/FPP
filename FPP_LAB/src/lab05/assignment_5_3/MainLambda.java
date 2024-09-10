package lab05.assignment_5_3;

import java.util.Arrays;

public class MainLambda {
	public static void main(String[] args) {
		String[] strs = {"andy", "mike", "joe", "allen", "stephan"};
		
		Arrays.sort(strs, (s1, s2) -> s2.length() - s1.length());
		
		System.out.println(Arrays.toString(strs));
	}
}
