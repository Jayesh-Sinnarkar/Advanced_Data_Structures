package com.utils;

public class SinglyLinkedList {
	// static class for Node
	static class Node {
		// Node class fields
		private int data;
		private Node next;

		// Node class constructors
		public Node() {
			this.data = 0;
			this.next = null;
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	// SinglyLinkedList class fields
	private Node head;

	// SinglyLinkedList class methods
	public SinglyLinkedList() {
		head = null;
	}

	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}
	
	public void addAtPos(int data, int pos)
	{
		if(head==null || pos<=1) //if head is null or pos is equals to or less than 1
		{
			addFirst(data);
		}else {
		Node newNode = new Node(data);
		Node trav = head;
		for (int i = 1; i < pos-1; i++) {
			if(trav.next==null)//if pos is greater than length of list then add node to end of the list.
				break;
			trav = trav.next;
		}
		newNode.next = trav.next;
		trav.next = newNode;
		}
		
				
	}
	
	public void delAtFirst() throws Exception {
		if (head==null) {
			throw new Exception("list is empty");
		}
		head=head.next;
	}
	
	public void delAtPos(int pos)
	{
		Node temp=null, trav = head;
		for(int i=1;i<pos;i++)
		{
			temp = trav;
			trav=trav.next;
		}
		temp.next=trav.next;
	}

	public void display() {
		Node trav = head;
		System.out.println("List: ");
		if (head == null)
			System.out.println("List is empty");

		while (trav != null) {

			System.out.print(trav.data + "  ");
			trav = trav.next;
		}
		System.out.println();
	}
}
