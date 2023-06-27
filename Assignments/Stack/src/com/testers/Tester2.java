package com.testers;

import com.utils.StackUsingLinkedList;

public class Tester2 {

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		try {
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
//			stack.push(60);
			System.out.println("\n"+stack.peek()+" is peekd");
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
