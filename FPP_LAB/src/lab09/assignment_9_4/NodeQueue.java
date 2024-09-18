package lab09.assignment_9_4;

public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;

	/* stores the element at the end of the queue, if it exists */
	private Node tail;

	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		Node newNode = new Node();
		newNode.data = s;
		if (tail != null) {
			tail.next = newNode;
		}
		else {
			// enqueue the first element
			head = newNode;
		}
		tail = newNode;
	}

	/**
	 * Removes node from the front of the queue and returns its value if head is n
	 */
	public String dequeue() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue is empty!");
		}
		String res = head.data;
		head = head.next;
		if (head == null) {
			// dequeue last item of the queue
			tail = null;
		}
		return res;
	}

	/**
	 * Returns value stored at the front of the queue
	 * 
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue is empty!");
		}
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "<empty queue>";
		}
		return head.toString();
	}
}
