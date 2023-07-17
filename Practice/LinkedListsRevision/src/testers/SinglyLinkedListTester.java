package testers;

import utils.SinglyLinkedList;

public class SinglyLinkedListTester {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
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
		System.out.println("\n----------");
		list.delFirst();
		list.display();
		System.out.println("\n----------");
		list.addLast(100);
		list.display();
		System.out.println("\n----------");
		list.delLast();
		list.display();
		System.out.println("\n----------");
		list.addAtPos(3, 75);
		list.display();
		System.out.println("\n----------");
		list.addAtPos(-5, 95);
		list.display();
		System.out.println("\n----------");
		list.addAtPos(50, 175);
		list.display();
		System.out.println("\n----------");
		list.delAtPos(4);
		list.display();
		System.out.println("\n----------");
		list.delAtPos(8);
		list.display();
		System.out.println("\n----------");
		list.delAtPos(40);
		list.display();
		
		
		


	}

}
