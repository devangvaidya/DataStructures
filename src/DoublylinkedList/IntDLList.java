package DoublylinkedList;


public class IntDLList {
	
	private Node start;
	class Node{
		private Node prev;
		private int value;
		private Node next;
		
		public Node(int item) {
			prev = null;
			value = item;
			next =null;
		}
	}
	public IntDLList(int item) {
		start = new Node(item);
	}
	
	public boolean insertItemAtFirstNode(int item) {
		
		Node n = new Node(item);
		start.prev = n;
		n.next =start;
		start = n;
		return true;
	}
	
	public boolean insertItemAtLastNode(int item) {
		
		return true;
	}
	
	public boolean deleteitemByValue(int item) {
		
		Node p =start;
		
		if(start.value == item) {
			start = start.next;
			return true;
		}else {
			while(p!=null) {
				if(p.next ==null ||p.next.value == item ) {
					break;
				}
				p = p.next;
			}
			if(p.next == null) {
				return false;
			}
			p.next = p.next.next;
			return true;
		}
		
	}
	
	public void printAllItems() {
		System.out.println("My List");
		Node n =start;
		while(n !=null) {
			System.out.println(n.value);
			n = n.next;
		}
	}
	
	public void sortList() {
		
		Node a = start.next;
		while(a.next!=null) {
			Node b = start.next;
			while(b.next != null) {
				if(b.value > b.next.value) {
					int c = b.value;
					b.value = b.next.value;
					b.next.value = c;
				}
				b = b.next;
			}
			a = a.next;
		}
		
	}
	
	public boolean isListEmpty(Node n) {
		
		return (n.next == null);
	}

	
	


}
