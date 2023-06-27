
public class DoublyLinkedList {
	
	static class Node{
		//Node class members
		private int data;
		private Node next;
		private Node prev;
	
		
		//Node class constructors
		
		public Node() {
			
			this.data = 0;
			this.next = null;
			this.prev = null;
		}
		
		public Node(int data) {
			
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	//List class members
	private Node head;
	
	//List class methods
	
	public void display() throws Exception
	{
		if(head==null)
			throw new Exception("List is empty");
		Node trav = head;
		do {
			System.out.print(trav.data+" ->");
			trav=trav.next;
			
		}while(trav != head);
		System.out.println();
	}
	
	public void addFirst(int val)
	{
		Node newNode = new Node(val);
		if(head==null)
		{
			head=newNode;
			head.next=newNode;
			head.prev=newNode;
		}
		else {
			newNode.next=head;
			newNode.prev=head.prev;
			head.prev.next=newNode;
			head.prev = newNode;
			head=newNode;
		}
	}
	
	public void addLast(int val)
	{
		Node newNode = new Node(val);
		if(head==null)
		{
			head=newNode;
			head.next=newNode;
			head.prev=newNode;
		}
		else {
			newNode.next = head;
			newNode.prev=head.prev;
			head.prev.next=newNode;
			head.prev=newNode;
			
		}
	}
	
	public void addAtPos(int pos, int val)
	{
		Node newNode = new Node(val);
		Node trav = head;
		for(int i=1;i<pos-1;i++)
		{
			trav=trav.next;
		}
		newNode.next = trav.next;
		newNode.prev=trav;
		trav.next.prev=newNode;
		trav.next=newNode;
		
	}
	
	
	

}
