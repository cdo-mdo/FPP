package lab07.assignment_7_2;

public class MinSort {

	public String sort1(String s) {
		System.out.println(s);
		return s;
	}

	public String sort(String s) {

		if (s == null) {
			return "";
		}
		if (s.length() == 1) {
			return s;
		}

		// Find min character in the string
		StringBuilder buffer = new StringBuilder(s);
		int index = 0;
		char min = buffer.charAt(0);

		for (int i = 0; i < buffer.length(); i++) {
			if (min - buffer.charAt(i) > 0) {
				min = buffer.charAt(i);
				index = i;
			}
		}

		// Swap min character and first character
		char temp = buffer.charAt(0);
		buffer.setCharAt(0, buffer.charAt(index));
		buffer.setCharAt(index, temp);

		StringBuilder sortedStrs = new StringBuilder();

		sortedStrs.append(buffer.charAt(0));
		String remain = buffer.substring(1);
		sortedStrs.append(sort(remain));

		return sortedStrs.toString();
	}

	public static void main(String[] args) {
		String s = "zwxuabfkafutbbbb";

		MinSort ms = new MinSort();
		String result = ms.sort(s);

		System.out.println("Sorted string of " + s + " is " + result);
	}
}
