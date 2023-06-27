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
				
			System.out.println("1. Add First \n2. Add Last \n3.Display \n4.Exit \n5.Add At Pos \n6.Delete At First \n7.Delete At Pos");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1://Add first
				System.out.println("Enter number to add: ");
				val = sc.nextInt();
				list.addFirst(val);
				System.out.println("List after addFirst");
				list.display();
				
				break;
			case 2://Add Last
				System.out.println("Enter number to add: ");
				val = sc.nextInt();
				list.addLast(val);
				System.out.println("List after addLast");
				list.display();
				break;
			case 3://Display
				list.display();
				break;
			case 4://Exit
				exit=true;
				break;
			case 5://5.Add At Pos
				System.out.println("Enter number to add: ");
				val = sc.nextInt();
				System.out.println("Enter position to add: ");
				int pos = sc.nextInt();
				list.addAtPos(val, pos);
				System.out.println("List after addAtPos("+pos+")");
				list.display();
				break;
			case 6://6.Delete At First
				list.delAtFirst();
				System.out.println("List after delAtFirst()");
				list.display();
				break;
			case 7://7.Delete At Pos
				System.out.println("Enter position: ");
				int position = sc.nextInt();
				list.delAtPos(position);
				System.out.println("List after delAtPos("+position+")");
				list.display();
				break;
			case 8:
				list.delAtLast();
				System.out.println("List after delAtLast()");
				list.display();
				break;
			}
			
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
