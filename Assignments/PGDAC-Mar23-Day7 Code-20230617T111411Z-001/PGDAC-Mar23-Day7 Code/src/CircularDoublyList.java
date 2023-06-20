
public class CircularDoublyList implements SortedDoublyListIntf {
	private DListNode head;

	public CircularDoublyList() {
		// Create and initialize dummy node.
		head = new DListNode(0);
		head.next = head;
		head.previous = head;
	}
	@Override
	public void insert(int element) {
		// 1. Create new node
		// Make memory for new element, say newNode.
		DListNode newNode = new DListNode(element);

		// 3. Traverse list of find node - current node.
		// Set current to first node (head)
		DListNode current = head.next;
		// while (current is not empty) do
		while (current != head) {
			// if (current's data > element) then
			if (current.data > element) {
				// Found the node, end the traversal.
				break;
			}
			// Set current to current's next node.
			current = current.next;
		}

		// 6. Add newNode between current and current's previous node.
		// Set current node as next of newNode.
		newNode.next = current;
		// Set current node's previous as newNode's previous.
		newNode.previous = current.previous;
		// Set newNode as next of current's previous node.
		current.previous.next = newNode;
		// Set newNode as current node's previous.
		current.previous = newNode;
		// Stop.	
	}

	@Override
	public void printForward() {
		DListNode current;
		current = head.next;
		while (current != head) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	@Override
	public void printBackward() {
		DListNode current;
		current = head.previous;
		while (current != head) {
			System.out.println(current.data);
			current = current.previous;
		}
	}

	@Override
	public void delete(int element) {
		// TODO Auto-generated method stub

	}

}
