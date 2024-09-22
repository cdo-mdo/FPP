package lab07.assignment_7_3;

import java.util.LinkedList;

/**
 * Recursively merges two sorted linked lists
 *
 */
public class Merge {
	public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> res = new LinkedList<>();
		if (list1.isEmpty() && list2.isEmpty()) {
			return res;
		}
		if (list1.isEmpty()) {
			res.addFirst(list2.removeFirst());
		} 
		else {
			if (list2.isEmpty()) {
				res.addFirst(list1.removeFirst());
			}		 
			else {
				if (list1.getFirst().compareTo(list2.getFirst()) < 0) {
					res.addFirst(list1.removeFirst());
				}
				else {
					res.addFirst(list2.removeFirst());
				}
			}
		}
		
		res.addAll(merge(list1, list2));
		return res;
	}

	// test your code
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(4);
		list1.add(5);
		list1.add(21);
		list1.add(25);
		list2.add(2);
		list2.add(9);
		list2.add(17);
		Merge m = new Merge();
		System.out.println("merge " + list1 + " and " + list2 + " to ");
		LinkedList<Integer> list3 = m.merge(list1, list2);
		if (list3 != null) {
			System.out.println(list3);
		}

	}
}
