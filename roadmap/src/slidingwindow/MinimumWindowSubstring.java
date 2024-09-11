package slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubstring {
	
	Solution solution = new Solution();
	
	class Solution {
		public String minWindow(String s, String t) {
			Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
			int size = s.length();
			for (int i = 0; i < s.length(); i++) {
				Set<Character> chrs = buildSet(t);
				for (int j = i; j < s.length(); j++) {
					if (chrs.contains(s.charAt(j)) == true) {
						chrs.remove(Character.valueOf(s.charAt(j)));
					}
					if (chrs.isEmpty()) {
						// found substring
						size = Math.min(size, j - i + 1);
						maps.put(Integer.valueOf(size), Integer.valueOf(i));
						break;
					}
				}
			}
			int index = maps.get(Integer.valueOf(size)).intValue();
			
			return s.substring(index, index + size);
		}
		
		private Set<Character> buildSet(String strs) {
			Set<Character> res = new HashSet<Character>();
			char[] chrs = strs.toCharArray();
			for (int i = 0; i < chrs.length; i++) {
				res.add(Character.valueOf(chrs[i]));
			}
			return res;
		}
	}
	
	public static void main(String[] args) {
		String s = "OUZODYXAZV";
		String t = "XYZ";
		
		MinimumWindowSubstring problem = new MinimumWindowSubstring();
		
		
		System.out.println("Minimum window substring of " + s + " to contain all characters of " + t + " is " + problem.solution.minWindow(s, t));
	}
}
