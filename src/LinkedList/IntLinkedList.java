package LinkedList;

public class IntLinkedList {
	
	private Node start;
	
	public IntLinkedList() {
		start = new Node();
	}
	
	public boolean insertItemAtFirstNode(int item) {
		
		Node n = new Node(item);
		n.link = start.link;
		start.link = n ;
		return true;
	}
	
	public boolean insertItemAtLastNode(int item) {
		Node p = start; 
		Node n = new Node(item);
		while(p.link !=null) {
			p = p.link;
		}
		p.link = n;
		return true;
	}
	
	public boolean deleteitemByValue(int item) {
		
		Node p =start;
		
		if(start.value == item) {
			start = start.link;
			return true;
		}else {
			while(p!=null) {
				if(p.link ==null ||p.link.value == item ) {
					break;
				}
				p = p.link;
			}
			if(p.link == null) {
				return false;
			}
			p.link = p.link.link;
			return true;
		}
		
	}
	
	public void printAllItems() {
		System.out.println("My List");
		Node n =start.link;
		while(n !=null) {
			System.out.println(n.value);
			n = n.link;
		}
	}
	
	public void sortList() {
		
		Node a = start.link;
		while(a.link!=null) {
			Node b = start.link;
			while(b.link != null) {
				if(b.value > b.link.value) {
					int c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
				b = b.link;
			}
			a = a.link;
		}
		
	}
	
	public boolean isListEmpty(Node n) {
		
		return (n.link == null);
	}

	class Node{
		private int value;
		private Node link;
		
		public Node() {
			value = 0;
			link =null;
		}
		
		public Node(int item) {
			value = item;
			link =null;
		}
	}
	
}
