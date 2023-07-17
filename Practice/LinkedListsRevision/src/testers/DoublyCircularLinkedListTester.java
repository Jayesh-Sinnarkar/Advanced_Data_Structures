package testers;

import utils.DoublyCircularLinkedList;

public class DoublyCircularLinkedListTester {

	public static void main(String[] args) {
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		list.addFirst(100);		
		list.addFirst(90);		
		list.addFirst(80);
		list.addFirst(70);
		list.addFirst(60);
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.display();
		list.addLast(110);
		list.display();
		list.addAtPos(3, 35);
		list.display();
		System.out.println("Total elements in list: "+list.getSize());
		list.delFront();
		list.display();
		list.delLast();
		list.display();
		list.delAtPos(2);
		list.display();
		list.delAtPos(8);
		list.display();
	}

}
