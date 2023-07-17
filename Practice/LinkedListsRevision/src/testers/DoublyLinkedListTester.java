package testers;

import utils.DoublyLinkedList;

public class DoublyLinkedListTester {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(80);
		list.addFirst(90);
		list.addFirst(100);
		list.display();
		list.addLast(150);
		list.display();
		System.out.println("Count: "+list.getSize());
		list.addAtPos(3, 40);
		list.display();
		list.delFront();
		list.display();
		list.delFront();
		list.display();
		list.delFront();
		list.display();
		list.delLast();
		list.display();
		list.delLast();
		list.display();
		list.addLast(250);
		list.addLast(350);
		list.addLast(450);
		list.addLast(550);
		list.addLast(650);
		list.addLast(750);
		list.addLast(850);
		list.addLast(950);
		list.display();
		list.delAtPos(3);
		list.display();
		list.delAtPos(5);
		list.display();
		list.delAtPos(7);
		list.display();
		list.delAtPos(1);
		list.display();
		//list.delAtPos(10);
		System.out.println("450 is at "+list.search(450)+" position.");
		System.out.println("550 is at "+list.search(550)+" position.");


	}

}
