package lab09.assignment_9_1;

public class MyStringStack {
	private MyStringLinkedList storage;
	
	public MyStringStack() {
		storage = new MyStringLinkedList();
	}
	
	public void push(String data) {
		storage.add(data);
	}
	
	public String pop() {
		String res = storage.get(0);
		storage.remove(0);
		return res;
	}
	
	public String peek() {
		return storage.get(0);
	}
	
	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		
		System.out.println("Poping ... " + stack.pop());
		System.out.println("Peeking ... " + stack.peek());
		System.out.println("Poping ... " + stack.pop());
	}
 }
