package Tree;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertChild(new Person("M", "1"));
		tree.insertChild(new Person("A", "2"));
		tree.insertChild(new Person("Z", "2"));
		tree.insertChild(new Person("R", "2"));
		tree.insertChild(new Person("D", "2"));
		
		tree.showAll(tree.findNode("Z"));
		Person p = tree.getData(tree.findParent("Z"));
		System.out.println(p);
	}

}
