package lab09.assignment_9_3;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void enqueue(int value) {
		arr[rear] = value;
		rear++;
		size++;
		if (front == -1) {
			front = 0;
		}
		if (rear == arr.length) {
			resize();
		}
	}

	public int dequeue() {
		int res = arr[front];
		for (int i = front; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
		rear--;

		return res;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Cannot peak becasue the queue is empty!");
		}
		return arr[front];
	}

	private void resize() {
		System.out.println("resize ... ");
		int currentLength = arr.length;
		int newLength = 2 * currentLength;
		int[] temp = arr;
		arr = new int[newLength];
		System.arraycopy(temp, 0, arr, 0, currentLength);
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		// uncomment when ready
		for (int i = 0; i < 15; i++) {
			q.enqueue(i);
		}
		for (int i = 0; i < 14; i++) {
			q.dequeue();
		}
		System.out.println(q.size());
		System.out.println(q.peek());
		
		q.dequeue();
		try {
			q.peek();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
