package utils;

public class CircularQueue {
	private int front;
	private int rear;
	private int size;
	private int[] arr;
	
	
	public CircularQueue() {
		super();
		this.front = -1;
		this.rear = -1;
		this.size = 5;
		this.arr = new int[size];
	}
	
	public CircularQueue(int size) {
		super();
		this.front = -1;
		this.rear = -1;
		this.size = size;
		this.arr = new int[size];
	}
	
	public void enQueue(int val) throws Exception
	{
		if(!isFull())
		{	
		rear = (rear+1)%size;
		arr[rear]=val;		
		}
		else 
			throw new Exception("Overflow");
	}
	public int deQueue() throws Exception
	{
		if(!isEmpty())
		{		
		front=(front+1)%size;
		return arr[front];
		}
		else
		{
			throw new Exception("Underflow");			
		}
	}
	
	public boolean isEmpty()
	{
		return rear==front;
	}
	
	public boolean isFull()
	{
		return front==(rear+1)%size;
	}
	
	public void print()
	{
		System.out.print("Elements are: ");
		for(int c: arr)
		{
			System.out.print(c+" ");
		}
	}

}
