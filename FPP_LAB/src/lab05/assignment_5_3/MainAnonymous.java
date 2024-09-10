package lab05.assignment_5_3;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

	public static void main(String[] args) {
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		
		Arrays.sort(testStrings, new Comparator<>() {
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		
		System.out.println(Arrays.asList(testStrings));
	}
}
