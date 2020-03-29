package LinkedList;

import LinkedList.IntLinkedList.Node;

public class PersonLinkedList {
	
	private Node start;
	
	public PersonLinkedList(Person p) {
		start = new Node(p);
	}
	
	public boolean insertItemAtFirstNode(Person item) {
		
		Node n = new Node(item);
		n.link = start;
		start = n ;
		return true;
	}
	
	public boolean insertItemAtLastNode(Person item) {
		Node p = start; 
		Node n = new Node(item);
		while(p.link !=null) {
			p = p.link;
		}
		p.link = n;
		return true;
	}
	
	public boolean deleteitemByValue(Person item) {
		
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
		Node n =start;
		while(n !=null) {
			System.out.println(n.value);
			n = n.link;
		}
	}
	
	public void sortList() {
		
		Node a = start;
		while(a.link!=null) {
			Node b = start;
			while(b.link != null) {
				
				int compareValue = b.value.getName().compareTo(b.link.value.getName());
				if(compareValue > 0) {
					String c = b.value.getName();
					b.value.setName(b.link.value.getName()); 
					b.link.value.setName(c);
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
		private Person value;
		private Node link;
		
		public Node(Person item) {
			value = item;
			link =null;
		}
	}
	


}
