package assignment_3_3;

public class MyStringList {
	private String[] strArray;
	private int size;
	private int pointToResize;

	private int actualSize = 0;
	private final int CHUNK_SIZE = 50;

	MyStringList() {
		this.size = 0;
		this.pointToResize = 2;
		actualSize = CHUNK_SIZE;
		strArray = new String[actualSize];
	}

	public void add(String s) {
		strArray[size] = s;
		size++;
		if (size >= pointToResize) {
			resize();
			pointToResize *= 2;
		}
		if (size > actualSize) {
			// double the size of strArray to have bigger buffer
			actualSize *= 2;
			String[] temp = strArray;
			strArray = new String[actualSize];
			System.arraycopy(temp, 0, strArray, 0, size);
		}
	}

	public String get(int i) {
		if (i >= size) {
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		for (String str : strArray) {
			if (s.equals(str)) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(String s) {
		for (int i = 0; i < size; i++) {
			if (s.equals(strArray[i])) {
				for (int j = i + 1; j < size; j++) {
					// shift elements of array backward to save space
					strArray[j - 1] = strArray[j];
				}
				size--;
				return true;
			}
		}
		return false;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				buffer.append(strArray[i]);
			} else {
				buffer.append(strArray[i] + ", ");
			}
		}
		buffer.append("]");

		return buffer.toString();
	}

	public int size() {
		return size;
	}

	private void resize() {
		System.out.println("Resizing...");
	}
}
