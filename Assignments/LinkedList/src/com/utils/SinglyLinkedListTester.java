package com.utils;

import java.util.Scanner;

public class SinglyLinkedListTester {
	
	public static void main(String[] args)
	{
		int choice,val;
		boolean exit=false;
		SinglyLinkedList list = new SinglyLinkedList();
		try(Scanner sc = new Scanner(System.in))
		{
			while(!exit) {
				
			System.out.println("1. Add First \n2. Add Last \n3.Display \n4.Exit \n5.Add At Pos \n6.Delete At First \7.Delete At Pos");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1://Add first
				System.out.println("Enter number to add: ");
				val = sc.nextInt();
				list.addFirst(val);
				
				break;
			case 2://Add Last
				System.out.println("Enter number to add: ");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 3://Display
				list.display();
				break;
			case 4://Exit
				exit=true;
				break;
			}
			
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
