package assignment_2_6;

public class Prog6 {
	public static String[] removeDups(String[] strs) {
		int[] markDuplicate = new int[strs.length];
		for (int i = 0; i < markDuplicate.length; i++) {
			markDuplicate[i] = 0;
		}
		
		int count = strs.length;
		for (int i = 0; i < strs.length; i++) {
			for (int j = i + 1; j < strs.length; j++) {
				if (strs[i].equals(strs[j])) {
					markDuplicate[j] = 1;
					count--;
				}
			}
		}
		
		String[] res = new String[count];
		int index = 0;
		for (int i = 0; i < strs.length; i++) {
			if (markDuplicate[i] == 0) {
				res[index] = strs[i];
				index++;
			}
		}
		
		return res;
	}
}
