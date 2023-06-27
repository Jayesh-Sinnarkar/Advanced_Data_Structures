package com.tester;

import com.utils.SinglyLinkedList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		try {
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		
		list.display();
		list.reverse();
		list.display();
//		list.sort();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
