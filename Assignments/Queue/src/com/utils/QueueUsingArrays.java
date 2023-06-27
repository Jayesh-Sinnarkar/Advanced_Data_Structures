package com.utils;

public class QueueUsingArrays {
	//Data members
	private int front;
	private int rear;
	private int size;
	private int[] arr;
	
	//Constructors
	public QueueUsingArrays(int size)
	{
		front = -1;
		rear= -1;
		this.size = size;
		arr = new int[size];
	}
	
	
	//Methods
	public boolean isFull()
	{
		if((front == rear&&front != -1) || (front == -1 && rear == size-1))
			return true;
		else
			return false;		
	}
	
	public boolean isEmpty() {
		
		if(front == rear && front == -1)
			return true;
		else
			return false;		
	}
	
	public void push(int val) throws Exception {
		if(isFull())
			throw new Exception("Queue is full");
		
	
		rear = (rear+1)%size;
		arr[rear]= val;
		
//		display();
	}
	
	public void pop() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is empty");
		front = (front+1)%size;
		if(front==rear)
		{
			front = -1;
			rear = -1;
		}
//		display();		
	}
	
	public int peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Queue is empty");
		int index = (front+1)%size;
		return arr[index];
	}
	
	public void display() throws Exception
	{	
		if(isEmpty())
			throw new Exception("Queue is empty");
		
		int temp = front;
		if(front==rear || front == -1)
		{
			temp++;
			do{
				System.out.print(arr[temp]+" -> ");
				temp++;
			}while(temp<=rear);
		}
		else
		{
			while(temp!=rear)
			{
				System.out.print(arr[temp]+" -> ");
				temp++;
			}
		}
		System.out.println();
		
	}
	

}
