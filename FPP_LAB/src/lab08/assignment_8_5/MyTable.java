package lab08.assignment_8_5;

public class MyTable {
	private Entry[] entries = new Entry[26];

	// returns the String that is matched with char c in the table
	public String get(char c) {
		Entry entry = entries[c - 'a'];
		return entry.getString();
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		if (c < 'a' || c > 'z') {
			return;
		}
		if (s == null) {
			return;
		}
		Entry entry = new Entry(c, s);
		entries[c - 'a'] = entry;
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		for (Entry entry : entries) {
			if (entry != null) {
				buffer.append(entry.toString());
				buffer.append("\n");
			}
		}
		return buffer.toString();
	}

	private class Entry {
		private char ch;
		private String str;

		Entry(char ch, String str) {
			this.ch = ch;
			this.str = str;
		}

		public String getString() {
			return str;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			return String.valueOf(ch) + "->" + str;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Willie");

		System.out.println(t);
	}
}