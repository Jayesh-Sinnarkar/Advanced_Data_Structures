
public class SortedDoublyListApp {

	public static void testDoublyList() {
		SortedDoublyListIntf l = new CircularDoublyList();

		l.insert(100);
		l.insert(10);
		l.insert(5);
		l.insert(20);
		l.insert(15);
		l.insert(1);
		l.insert(50);
		System.out.println("Ascending order ...");
		l.printForward();
		System.out.println("Descending order ...");
		l.printBackward();
	}

	public static void testSListUsingArray() {
		ListUsingArray l = new ListUsingArray(10);
		l.addAtFront(10);
		l.addAtFront(5);
		l.addAtFront(1);
		System.out.println("After adding elements ...");
		l.print();

		l.deleteFirstNode();
		l.deleteFirstNode();
		System.out.println("After deleting elements ...");
		l.print();

		l.addAtFront(20);
		l.addAtFront(15);
		System.out.println("After adding elements ...");
		l.print();
	}
	public static void main(String[] args) {
		testSListUsingArray();
	}
}
