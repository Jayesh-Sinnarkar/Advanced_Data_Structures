package testers;

import utils.SinglyCircularLinkedList;

public class SinglyCircularLinkedListTester {

	public static void main(String[] args) {
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		list.addFirst(60);
		list.addFirst(70);
		list.addFirst(80);
		list.addFirst(90);
		list.addFirst(100);
		list.display();
		list.delFirst();
		list.display();
		list.addLast(5);
		list.display();
		list.delLast();
		list.display();
		list.addAtPos(5, 55);
		list.display();
		list.delAtPos(5);
		list.display();
		

	}

}
