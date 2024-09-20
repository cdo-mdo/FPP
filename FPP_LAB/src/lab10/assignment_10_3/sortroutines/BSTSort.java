package lab10.assignment_10_3.sortroutines;

import lab10.assignment_10_3.runtime.Sorter;

public class BSTSort extends Sorter {

	@Override
	public int[] sort(int[] arr) {
		MyBST myBST = new MyBST();
		myBST.insertAll(arr);
		
		return myBST.readIntoArray();
	}

}
