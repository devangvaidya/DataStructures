package Tree;

public class BinarySearchTree {
	Node root;
	class Node{
		private Node left_child;
		private Node right_child;
		private Person data;
		
		Node(Person p){
			left_child =null;
			right_child = null;
			data = p;
		}
	}
	public BinarySearchTree() {
		root =null;
	}
	
	public boolean insertChild(Person item) {
		Node n = new Node(item);
		if(root == null) {
			root = n;
			return true;
		}
		
		Node c = root;
		Node p = root; //Keep the reference of parent
		while(c != null) {
			p = c;
			if(item.getName().compareTo(c.data.getName()) < 0) {
				c = c.left_child;
			}else {
				c = c.right_child;
			}
		}
		if(item.getName().compareTo(p.data.getName()) < 0) {
			p.left_child = n;
		}else {
			p.right_child = n;
		}
		
		
		return true;
	}
	
	public Person getData(Node n) {
		return n.data;
	}
	
	public Node findParent(String key) {
		
		Node p = root;
		Node c = root;
		
		do {
			if(key.compareTo(c.data.getName()) == 0) {
				break;
			}
			p=c;
			if(key.compareTo(c.data.getName()) < 0) {
				c = c.left_child;
			}else {
				c = c.right_child;
			}
		}while(c!=null) ;
		
		System.out.println(">>" + p.data.getName());
		
		if(c != null) {
			return p;
		}else {
			return null;
		}
		
	}
	
	public Node findNode(String key) {
		Node c = root;
		while(c != null) {
			if(key.compareTo(c.data.getName()) == 0) {
				break;
			}
			if(key.compareTo(c.data.getName()) < 0) {
				c = c.left_child;
				
			}else {
				c= c.right_child;
			}
		}
		
		return c;
	}
	public void showAll(Node n) {
		Node p = n;
		if(p != null) {
			System.out.println(" "+ p.data);
			showAll(p.left_child);
			showAll(p.right_child);
		}
	}
	
	
}
