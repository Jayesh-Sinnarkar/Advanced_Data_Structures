package utils;

import utils.SinglyLinkedList.Node;

public class SinglyCircularLinkedList {

	static class Node {
		Node next;
		int data;

		Node() {
			data = 0;
			next = null;
		}

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	// SinglyCircularLinkedList class members
	Node head;

	public SinglyCircularLinkedList() {
		head = null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			newNode.next = head;
		}
		Node trav = head;
		while (trav.next != head)
			trav = trav.next;
		newNode.next = head;
		trav.next = newNode;
		head = newNode;
	}

	public void delFirst() {
		if(head==null)
			throw new RuntimeException("List is empty");
		Node trav = head;
		while(trav.next!=head)
			trav=trav.next;
		trav.next = head.next;
		head = head.next;

	}

	public void addLast(int data) {
		if(head==null)
			addFirst(data);
		Node newNode = new Node(data);
		Node trav = head;
		while(trav.next!=head)
			trav=trav.next;
		newNode.next = head;
		trav.next=newNode;
	}

	public void delLast() {
		if(head==null)
			throw new RuntimeException("List is empty");
		Node trav = head;
		while(trav.next.next!=head)
			trav=trav.next;
		trav.next=head;

	}

	public void addAtPos(int pos, int data) {
		if(head==null || pos<1)
			throw new RuntimeException("List is empty or position is invalid...");
		Node newNode = new Node(data);
		Node trav = head;		
		for(int i=0;i<pos-1;i++)
		{
			if(trav==null)
				throw new RuntimeException("Position is beyond list size.");
			trav=trav.next;
		}
		newNode.next=trav.next;
		trav.next=newNode;
	}

	public void delAtPos(int pos) {
		if(head==null || pos<1)
			throw new RuntimeException("List is empty or position is invalid...");
		
		Node trav = head;		
		for(int i=0;i<pos-1;i++)
		{
			if(trav==null)
				throw new RuntimeException("Position is beyond list size.");
			trav=trav.next;
		}
		trav.next=trav.next.next;
	}

	public void display() {
		if (head == null)
			throw new RuntimeException("List is empty");
		Node trav = head;
		do {			
			System.out.print(trav.data + " ");
			trav = trav.next;
		} while (trav != head);
		System.out.println("\n-----------");
	}

}
