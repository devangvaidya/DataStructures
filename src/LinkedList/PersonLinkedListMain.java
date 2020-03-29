package LinkedList;

import LinkedList.Person;

public class PersonLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Devang", "1");
		Person p2 = new Person("Vaidya", "2");
		Person p3 = new Person("ZXCV", "3");
		
		PersonLinkedList linkedList = new PersonLinkedList(p1);
		
		linkedList.insertItemAtLastNode(p2);
		linkedList.insertItemAtLastNode(p3);
		
		linkedList.printAllItems();
		linkedList.insertItemAtFirstNode(new Person("ulupi" , " 10"));
		linkedList.printAllItems();
		
		
		System.out.println("Sorting");
		linkedList.sortList();
		linkedList.printAllItems();
	}

}
