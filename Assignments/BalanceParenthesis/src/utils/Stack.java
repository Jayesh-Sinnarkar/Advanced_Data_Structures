package utils;

public class Stack {
	private char[] arr;
	private int size;
	private int top;

	public Stack() {

		size = 5;
		arr = new char[size];
		top = -1;

	}

	public Stack(int s) {

		size = s;
		arr = new char[size];
		top = -1;

	}

	public void push(char val) throws Exception {
		if (!isFull())
			arr[++top] = val;
		else
			throw new Exception("Overflow");

	}

	public char pop() throws Exception {
		if (!isEmpty())
			return arr[top--];
		else
			throw new Exception("Underflow");

	}
	
	public char peep() throws Exception {
		if (!isEmpty())
			return arr[top];
		else
			throw new Exception("Underflow");

	}

	public boolean isFull() {
		return top == size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

}
