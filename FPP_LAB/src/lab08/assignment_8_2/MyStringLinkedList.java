package lab08.assignment_8_2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null);
	}
	
	public void insert(String data, int pos) {
		if (data == null) {
			return;
		}
		if (pos < 0) {
			return;
		}
		if (pos == 0) {
			addFirst(data);
			return;
		}
		
		int count = 0;
		Node node = header;
		while (true) {
			if (count == pos) {
				// found position to add
				break;
			}
			if (node.next == null) {
				// position is bigger than size of array
				return;
			}
			node = node.next;
			++count;
		}
		// insert new element at position
		Node newNode = new Node(data);
		Node prevNode = node.previous;
		newNode.previous = prevNode;
		prevNode.next = newNode;
		newNode.next = node;
		node.previous = newNode;
		
		return;
	}

	
	public boolean remove(String data) {
		if (data == null) {
			return false;
		}
		
		Node node = header;
		while (node.next != null) {
			if (node.value.equals(data)) {
				// found node to remove
				break;
			}
			node = node.next;
		}
		if (node.next == null) {
			// Cannot find node to remove
			return false;
		}
		
		
		Node prevNode = node.previous;
		Node nextNode = node.next;
		prevNode.next = nextNode;
		nextNode.previous = prevNode;
		
		return true;
	}
	
	
	// adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		// place new node after header and
		// establish links from new node to
		// surrounding nodes
		n.next = header.next;
		n.previous = header;

		// establish links from surrounding
		// nodes to the new node
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		// find last node
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		// now last.next == null
		last.next = n;
		n.previous = last;
	}

	// removes node in last position
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null) {
			current = current.next;
		}
		// now current.next == null, so remove current
		Node previous = current.previous;
		// previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}

	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}
	}
	
	public void minSort() {
		Node index = header.next;
		while (index != null) {
			Node min = minNode(index);
			swap(index, min);
			index = index.next;
		}
	}
	
	public Node minNode(Node nodeIndex) {
		Node node = nodeIndex;
		String minStr = node.value;
		Node res = node;
		Node nextNode = node.next;
		while (nextNode != null) {
			if (minStr.compareTo(nextNode.value) > 0) {
				minStr = nextNode.value;
				res = nextNode;
			}
			nextNode = nextNode.next;
		}
		
		return res;
	}
	
	public void swap(Node n1, Node n2) {
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
	}

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0)
			return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(String value) {
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
		
		
		String[] strs = {"big", "small", "tall", "short", "round", "square", 
				"enormous", "tiny","gargantuan", "lilliputian", 
				"numberless", "none", "vast", "miniscule"};
		var list1 = new MyStringLinkedList();
		for (String str: strs) {
			list1.addLast(str);
		}
		System.out.println(list1);
		
		list1.minSort();
		
		System.out.println(list1);
		
		
	}
}
