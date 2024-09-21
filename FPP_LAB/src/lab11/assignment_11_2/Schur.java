package lab11.assignment_11_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Schur {
	boolean checkForSum(List<Integer> list, Integer z) {
		Set<Integer> complements = new HashSet<>();
		for (Integer num: list) {
			if (complements.contains(num)) {
				return true;
			}
			int complement = z - num;
			complements.add(complement);
		}
		return false;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Schur schur = new Schur();
		
		System.out.println(schur.checkForSum(list, 8));
		
		System.out.println(schur.checkForSum(list, 10));
		
	}
}
