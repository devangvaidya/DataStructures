package Queue;

public class IntQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntQueue intQueue = new IntQueue();
		intQueue.enqueue(2);
		intQueue.enqueue(3);
		intQueue.enqueue(4);
		
		/*
		 * while(!intQueue.isEmpty()) { System.out.println(intQueue.dequeue()); }
		 */
		
		intQueue.showAll();
	}

}
