package com.utils;

public class StackUsingArray {
	int[] arr;
	int top = -1;
	
	public StackUsingArray(int size)
	{
		arr = new int[size];
	}
	
	public void push(int val) throws Exception
	{
		if(isFull())
			throw new Exception("Stack is full\n");
		top++;
		arr[top]=val;
		display();
	}
	
	public int pop() throws Exception {
		
		if(isEmpty())
			throw new Exception("Stack is empty\n");
		
		int val = arr[top];
		top--;
		System.out.println("\n"+val+" is popped");
		display();
		return val;
	}
	
	public int peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty");
		return arr[top];
	}
	
	
	public boolean isFull() {
		return top==arr.length-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void display()
	{
		int temp = top;
		while(temp!= -1) {
			System.out.print(arr[temp]+" -> ");
			temp--;
		}
		System.out.println();
	}
	

}
