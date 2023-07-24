package utils;

public class BinarySearchTree {
	static class Node {
		private int data;
		private Node right, left;

		Node() {
			data = 0;
			right = null;
			left = null;
		}

		Node(int data) {
			this.data = data;
			right = null;
			left = null;
		}
	}

	// Data members of BinarySearchTree
	private Node root;

	// Methods of BinarySearchTree

	public void add(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
		} else {
			Node trav = root;
			while (true) {
				if (data < trav.data) {
					// add it to left
					if (trav.left != null)
						trav = trav.left;
					else {
						trav.left = newNode;
						break;
					}
				} else { // if(data>=trav.data)
					// add it to right
					if (trav.right != null)
						trav = trav.right;
					else {
					trav.right = newNode;
					break;
					}
				}
			}
		}

	}
}
