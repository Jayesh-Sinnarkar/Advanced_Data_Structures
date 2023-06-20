package com.utils;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
	
		this.root = null;
	}
	
	public void addNode(int data) throws Exception
	{
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setLeft(null);
		newNode.setRight(null);
		
		if(root==null) {
			root=newNode;
		}
		else {
			Node trav = root;
			while(true)
			{
				if(newNode.getData()<trav.getData())
				{
					if(trav.getLeft()==null)
					{
						trav.setLeft(newNode);
						break;
					}
					else {
						trav = trav.getLeft();
					}
				}
				else if(newNode.getData()>trav.getData())
				{
					if(trav.getRight()==null)
					{
						trav.setRight(newNode);
						break;
					}
					else {
						trav = trav.getRight();
					}
				}
				else {
					throw new Exception("Duplicate Value");
				}				
			}
		}
	}
	
	public void inorder() {
		inorder(root);
		
	}
	
	public void inorder(Node trav) {
		if(trav!=null) {
			inorder(trav.getLeft());
			System.out.print(trav.getData()+"  ");
			inorder(trav.getRight());
		}
		
	}
	
	public void postorder()
	{
		postorder(root);
	}
	
	public void postorder(Node trav)
	{
		if(trav!=null) {
			postorder(trav.getLeft());
			postorder(trav.getRight());
			System.out.print(trav.getData()+"  ");
		}
		
	}
	
	
	public void preorder()
	{
		preorder(root);
	}
	
	public void preorder(Node trav)
	{
		if(trav!=null) {
			System.out.print(trav.getData()+"  ");
			preorder(trav.getLeft());
			preorder(trav.getRight());
			
		}
	}
	
	public void preconverse()
	{
		preconverse(root);
	}
	
	public void preconverse(Node trav)
	{
		if(trav!=null) {
			System.out.print(trav.getData()+"  ");
			preconverse(trav.getRight());
			preconverse(trav.getLeft());
			
		}
	}
	

}
