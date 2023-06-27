package com.utils;

public class SinglyLinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node() {
			super();
			this.data = 0;
			this.next = null;
		}

		public Node(int data) {
			
			this.data = data;
			this.next = null;
		}
		
	}
	//List Data Members
	private Node head;
	
	public SinglyLinkedList() {
		
		this.head = null;
	}
	
	//Methods 
	public void display()
	{
		Node trav = head;
		System.out.println("List: ");
		do {
			System.out.print(trav.data+" -> ");
			trav = trav.next;
		}while(trav!=null);
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(head==null)
			head=newNode;
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void delFirst() throws Exception {
		if(head==null)
			throw new Exception("List is empty");
		else {
			head = head.next;
		}
		
		System.out.println("\nAfter delFirst: ");
		display();		
	}
	
	public void reverse()
	{
//		Node temp, oldHead =head;
//		head = null;
//		
//		while(oldHead!=null)
//		{
//			temp = oldHead;
//			oldHead=temp.next;
//			temp.next=head;
//			head=temp;
//		}
	if(head!=null)
		recReverse(head);
	}
	
	private Node recReverse(Node h)
	{
		if(h.next==null) {
			head=h;
			return h;
		}
		
		Node t =recReverse(h.next);
		t.next=h;
		h.next=null;
		return h;
	}
	
	public void sort() {
		
		Node i,j,temp = new Node();
		for(i=head; i!=null; i=i.next)
		{
			for(j=i.next;j!=null;j=j.next)
			{
				while(i.data>j.data)
				{
					temp.data=i.data;
					i.data = j.data;
					j.data=temp.data;
				}
			}
		}
		
		
		System.out.println("\nAfter sorting: ");
		display();
		
	}
	
	
	

}
