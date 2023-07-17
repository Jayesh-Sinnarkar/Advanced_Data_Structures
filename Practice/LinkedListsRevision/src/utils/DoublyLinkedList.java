package utils;

public class DoublyLinkedList {
	
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
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	//Data members of DoublyLinkedList class
	private Node head;
	private Node rear;
	
	
	//DoublyLinkedList ctors
	public DoublyLinkedList(){
		head=null;
		rear=null;
	}
	
	//methods
	//Insertion:
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			rear=newNode;
			newNode.next=null;
			newNode.prev=null;
			
		}
		else {
			newNode.prev = null;
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			
		}
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		newNode.next=null;
		newNode.prev=rear;
		rear.next=newNode;
		rear=newNode;		
	}
	
	public void addAtPos(int pos,int data) {
		if(head==null || pos<1) {
			throw new RuntimeException("List is empty or positionis invalid...");
		}
		else if(pos>getSize()) {
			addLast(data);
		}
		else {
			Node newNode = new Node(data);
			Node trav = head;
			for(int i=0; i<pos-1; i++) 
				trav=trav.next;
			newNode.prev=trav;
			newNode.next=trav.next;
			trav.next.prev=newNode;
			trav.next=newNode;			
		}		
	}
	//Deletion:
	public void delFront() {
		if(head==null)
			throw new RuntimeException("List is empty");
		head=head.next;
		head.prev=null;
		
	}
	public void delLast() {
		if(head==null)
			throw new RuntimeException("List is empty");
		rear=rear.prev;
		rear.next=null;
		
	}
	public void delAtPos(int pos) {
		if(head==null || pos<1)
			throw new RuntimeException("List is either empty or pos invalid...");
		else if(pos>getSize())
			throw new RuntimeException("Pos is beyond list size...");
		Node trav = head;
		for(int i=0;i<pos-1;i++) {
			trav=trav.next;			
		}
		Node temp = trav.next;
		trav.next=temp.next;
		temp.next.prev=trav;
		temp.next=null;
		temp.prev=null;		
	}
	//Display:
	public void display() {
		Node trav = head;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println("\n----------");
	}
	public void displayBackward() {
		
	}
	
	//Size and search:
	public int getSize() {
		int count = 0;
		Node trav = head;
		while(trav!=null) {
			count++;
			trav=trav.next;
		}
			
		return count;
	}
	public boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}
	public int search(int data) {	
		Node trav = head;
		int count=1;
		boolean elementFound = false;
		while(trav.data!=data && trav.next!=null)
		{
			count++;
			trav=trav.next;
			if(trav.data==data)
				elementFound=true;
		}
		if(count>0 && elementFound==true)
			return count;
		else
			throw new RuntimeException("Element not found...");
	}

}
