
public class SortedDoublyList implements SortedDoublyListIntf {
	DListNode head;
	DListNode tail;

	public SortedDoublyList() {
		head = null;
		tail = null;
	}

	@Override
	public void insert(int element) {
		// 1. Create new node
		// Make memory for new element, say newNode.
		DListNode newNode = new DListNode(element);

		// 2. If list is empty?
		// if head is empty then
		if (head == null) {
			// Make newNode as first and last node of list.
			head = newNode;
			tail = newNode;
			// Stop
			return;
		}

		// 3. Traverse list of find node - current node.
		// Set current to first node (head)
		DListNode current = head;
		// while (current is not empty) do
		while (current != null) {
			// if (current's data > element) then
			if (current.data > element) {
				// Found the node, end the traversal.
				break;
			}
			// Set current to current's next node.
			current = current.next;
		}

		// 4. If adding before fist node? - current is first node.
		// if (current is head) then
		if (current == head) {
			// Set newNode as previous of first node (head).
			head.previous = newNode;
			// Set first node (head) as next of newNode.
			newNode.next = head;
			// Set newNode as first node (head).
			head = newNode;
			// Stop.
			return;
		}

		// 5. If adding after last node? - current is empty.
		// if (current is empty) then
		if (current == null) {
			// After last node (tail), comes newNode.
			tail.next = newNode;
			// Before newNode comes last node (tail).
			newNode.previous = tail;
			// Set newNode as last node (tail).
			tail = newNode;
			// Stop
			return;
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
		current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	@Override
	public void printBackward() {
		DListNode current;
		current = tail;
		while (current != null) {
			System.out.println(current.data);
			current = current.previous;
		}
	}

	@Override
	public void delete(int element) {
	}
}
