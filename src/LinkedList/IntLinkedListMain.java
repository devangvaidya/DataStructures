package LinkedList;

public class IntLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntLinkedList intLinkedList = new IntLinkedList(); //Assuming 1st element is 0 and to be neglected
		intLinkedList.insertItemAtLastNode(2);
		intLinkedList.insertItemAtLastNode(3);
		intLinkedList.printAllItems();
		intLinkedList.insertItemAtFirstNode(3);
		
		intLinkedList.printAllItems();
		
		intLinkedList.deleteitemByValue(3);
		intLinkedList.printAllItems();
		
		System.out.println("Sorting");
		
		IntLinkedList intLinkedList2 = new IntLinkedList(); //Assuming 1st element is 0 and to be neglected
		intLinkedList2.insertItemAtLastNode(2);
		intLinkedList2.insertItemAtLastNode(3);
		
		intLinkedList2.insertItemAtFirstNode(3);
		intLinkedList2.insertItemAtFirstNode(11);
		intLinkedList2.printAllItems();
		intLinkedList2.sortList();
		intLinkedList2.printAllItems();
		
	}

}
