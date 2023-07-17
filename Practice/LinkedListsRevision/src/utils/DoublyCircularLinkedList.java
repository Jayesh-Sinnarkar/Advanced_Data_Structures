package utils;

import javax.management.RuntimeErrorException;

import utils.DoublyLinkedList.Node;

public class DoublyCircularLinkedList {
	
	static class Node{
		Node next;
		Node prev;
		int data;
		//ctors
		Node(){
			next=null;
			prev=null;
			data=0;
		}
		Node(int data){
			next=null;
			prev=null;
			this.data=data;
		}
	}
	
	//DoublyCircularLinkedList class data members
	Node head;
	Node rear;
	
	//ctors for DoublyCircularLinkedList
	public DoublyCircularLinkedList() {
		head=null;
		rear=null;
	}
	
	//methods
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {//if list is empty
			head=newNode;
			rear=newNode;
			newNode.next=head;
			newNode.prev=rear;
		}
		else {
			newNode.next=head;
			newNode.prev=rear;
			head.prev=newNode;
			rear.next=newNode;
			head=newNode;
		}
			
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head=newNode;
			rear=newNode;
			newNode.next=head;
			newNode.prev=rear;
		}else {
			newNode.prev=rear;
			newNode.next=head;
			rear.next=newNode;
			head.prev=newNode;
			rear=newNode;
		}
				
	}
	
	public void addAtPos(int pos,int data) {
		if(isEmpty() || pos<1 || pos>getSize())
			throw new RuntimeException("Either list is empty or pos is invalid");
		Node newNode = new Node(data);
		Node trav=head;
		for(int i=0;i<pos-1;i++)
			trav=trav.next;
		newNode.prev=trav;
		newNode.next=trav.next;
		trav.next.prev=newNode;
		trav.next=newNode;			
	}
	//Deletion:
	public void delFront() {
		if(isEmpty())
			throw new RuntimeException("Either list is empty or pos is invalid");
		head=head.next;
		rear.next=head;
		
	}
	public void delLast() {
		if(isEmpty())
			throw new RuntimeException("Either list is empty or pos is invalid");
		rear=rear.prev;
		rear.next=head;
	}
	public void delAtPos(int pos) {
		if(isEmpty()||pos<1 || pos>getSize())
			throw new RuntimeException("Either list is empty or pos is invalid");
		Node trav=head;
		for(int i=0;i<pos-1;i++) {
			trav=trav.next;
		}
		Node temp=trav.next;
		trav.next=temp.next;
		trav.next.prev=trav;
		
	}
	//Display:
	public void display() {
		if(isEmpty())
			throw new RuntimeException("List is empty...");
		Node trav=head;
		do {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}while(trav!=head);
		System.out.println("\n----------");
	}
	public void displayBackward() {
		
	}
	
	//Size and search:
	public int getSize() {
		if(isEmpty())
			throw new RuntimeException("List is empty");
		Node trav=head;
		int count=1;
		do {
			trav=trav.next;
			count++;
		}while(trav.next!=head);
		return count;
	}
	public boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}
	public int search(int data) {	
		return 0;

}

}
