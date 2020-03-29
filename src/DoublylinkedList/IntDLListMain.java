package DoublylinkedList;

public class IntDLListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntDLList dlList = new IntDLList(2);
		dlList.insertItemAtFirstNode(5);
		dlList.insertItemAtFirstNode(4);
		dlList.insertItemAtFirstNode(3);
		dlList.printAllItems();
		
		
		dlList.deleteitemByValue(3);
		dlList.printAllItems();
	}

}
