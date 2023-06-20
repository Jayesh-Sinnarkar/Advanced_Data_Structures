
public class ListUsingArray implements SinglyListIntf {
	ArraySListNode[] nodes;
	int head;
	private final int EMPTY = -1;
	private final int FREE = -2;

	public ListUsingArray(int size) {
		nodes = new ArraySListNode[size];
		for (int i = 0; i < size; ++i) {
			nodes[i] = new ArraySListNode();
			nodes[i].next = FREE;
		}
		head = EMPTY; // empty
	}

	int getNewNode() {
		int i = 0;
		while (i < nodes.length) {
			if (nodes[i].next == FREE)
				return i;
			++i;
		}
		return EMPTY;
	}

	@Override
	public void addAtFront(int element) {
		// Make space for new element, say newNode
		int newNode = getNewNode();

		// Store element in newNode's data
		nodes[newNode].data = element;
		// Set newNode's next to empty
		nodes[newNode].next = EMPTY;

		// if list is empty
		if (head == EMPTY) {
			// Set head to newNode
			head = newNode;
			// Stop
			return;
		}

		// Set newNode's next to head
		nodes[newNode].next = head;
		// Set head as newNode
		head = newNode;
		
		// Stop
	}

	/* - Optimised AddAtFront() algorithm implementation.
	public void addAtFront(int element) {
		// Make space for new element, say newNode
		int newNode = getNewNode();

		// Store element in newNode's data
		nodes[newNode].data = element;

		// Set newNode's next to head
		nodes[newNode].next = head;

		// Set head as newNode
		head = newNode;
		
		// Stop
	}
	*/
	@Override
	public void deleteFirstNode() {
		// if list is empty then
		if (head == EMPTY) {
			// Stop
			return;
		}

		// Set current to head
		int current = head;
		
		// Move head to head’s next node
		head = nodes[head].next;

		// Release current node
		nodes[current].next = FREE;
	}

	@Override
	public void print() {
		int current;

		// Set current to first node of list.
		current = head;

		// while (current is not empty) do
		while (current != EMPTY) {

			// Process current node
			System.out.println(nodes[current].data);

			// Move current to current node’s next
			current = nodes[current].next;
		}
	}
}
