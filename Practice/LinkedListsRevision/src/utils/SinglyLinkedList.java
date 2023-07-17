package utils;

public class SinglyLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(){
			data=0;
			next=null;
		}
		
		Node(int data){
			this.data=data;
			this.next=null;			
		}
	}
	
	//SinglyLinkedList data members
	private Node head;
	
	//Ctor
	public SinglyLinkedList() {
		head=null;
	}
	
	//Methods
	
	public void addFirst(int data){
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;//if List is Empty
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	public void delFirst(){
		if(head==null) {
			throw new RuntimeException("List is empty...");//if list is empty
		}
		head=head.next;		
	}
	
	public void addLast(int data){
		if(head==null)
		{
			addFirst(data);
		}
		else {
			Node newNode = new Node(data);
			Node trav = head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next = newNode;
		}
		
	}
	
	public void delLast(){
		if(head==null) {
			throw new RuntimeException("List is empty...");//if list is empty
		}
		Node trav = head;
		while(trav.next.next!=null)
			trav=trav.next;
		trav.next=null;		
		
	}
	
	public void addAtPos(int pos, int data) {
		if(head==null || pos<1 )
			addFirst(data);
		else {
			Node newNode =new Node(data);
			Node trav = head;
			
			for(int i=0; i<pos-1; i++)
			{				
				if(trav.next==null) {
					addLast(data);
					return;
				}
				trav=trav.next;
			}
			newNode.next = trav.next;
			trav.next=newNode;
		}
		
	}
	
	public void delAtPos(int pos) {
		if(head==null)
			throw new RuntimeException("List is empty...");
		else if(pos<1)
			throw new RuntimeException("Invalid Position...");

		Node trav = head.next;
		Node temp = head;
		for(int i=0;i<pos-1;i++) {
			if(trav.next==null)
				throw new RuntimeException("Position is beyond list size...");
			trav=trav.next;
			temp=temp.next;		
		}
		temp.next=trav.next;		
	}
	
	public void display() {
		if(head==null)
			throw new RuntimeException("List is empty");
		Node trav = head;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
	}

	

}
