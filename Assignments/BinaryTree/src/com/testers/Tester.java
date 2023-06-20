package com.testers;

import com.utils.BinarySearchTree;

public class Tester {

	public static void main(String[] args) {
		try {
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(50);
		bst.addNode(20);
		bst.addNode(40);
		bst.addNode(10);
		bst.addNode(70);
		bst.addNode(24);
		
		System.out.println("Inorder: ");
		bst.inorder();
		System.out.println("\n\nPostorder: ");
		bst.postorder();
		System.out.println("\n\nPreorder: ");
		bst.preorder();
		System.out.println("\n\nPreConverse: ");
		bst.preconverse();
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
