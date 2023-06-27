package com.utils;

public class StackUsingLinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node() {
			data=0;
			next=null;
		}
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	//data members
	private Node head;
	private Node tail;
	
	//ctors
	public StackUsingLinkedList()
	{
		head=null;
		tail=null;
	}
	
	//methods;
	
	public void push(int val) {
		addFirst(val);
		System.out.println(val+"is pushed");
		display();
	}
	
	private void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty())
			head=newNode;
		else {
			newNode.next=head;
			head=newNode;
			
		}
	}
	
	public int pop() throws Exception {
		return delFirst();	
	}
	
	private int delFirst() throws Exception
	{
		if(isEmpty())
			throw new Exception("List is empty");
		else {
			int val = head.data;
			head=head.next; //prev node will be eligible for GC
			System.out.println(val+"is popped");
			display();
			return val;
		}
	}
	
	public int peek() {
		return head.data;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void display() {
		Node trav = head;
		while(trav!=null)
		{
			System.out.print(trav.data+" -> ");
			trav=trav.next;
		}
		System.out.println();
	}
	
	

}
