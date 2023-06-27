
public class Tester {

	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		try {
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		list.display();
		list.addLast(100);
		list.display();
		list.addAtPos(3, 150);
		list.display();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}


