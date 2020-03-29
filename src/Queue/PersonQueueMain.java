package Queue;

public class PersonQueueMain {
	public static void main(String[] args) {
		Person p1 = new Person("Devang", "1");
		Person p2 = new Person("Vaidya", "2");
		PersonQueue personQueue = new PersonQueue();
		
		personQueue.enqueue(p1);
		personQueue.enqueue(p2);
		
		personQueue.showAll();
	}
}
