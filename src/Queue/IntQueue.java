package Queue;

public class IntQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int total;
	private int size;
	
	public IntQueue () {
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		queue = new int[size];
	}
	public IntQueue (int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		queue = new int[this.size];
	}
	
	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		}
		
		total++;
		queue[rear] = item;
		rear = (rear + 1) % size;
		
		return true;
	}
	
	public boolean isFull() {
		return (size == total);
	}
	public boolean isEmpty() {
		return (total == 0);
	}
	
	public int dequeue() {
		int item = queue[front];
		total--;
		front = (front + 1) % size;
		return item;
	}
	
	public void showAll() {
		int f = front;
		
		if(total != 0) {
			for(int i = 0; i < total ; i++) {
				System.out.println(queue[f]);
				f = (f+1)%size;
			}
		}
	}
	
	
}
