package com.testers;

import java.util.Scanner;

import com.utils.BubbleSort;
import com.utils.SelectionSort;

public class Testers {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Integers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		BubbleSort.bubbleSort(arr);
		SelectionSort.selectionSort(arr);
		
		System.out.println("Array Elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		
	}
	
//	public static void bubbleSort(int arr[])
//	{
//		int temp;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			for(int j=0;j<arr.length-i-1;j++)
//			{
//				if(arr[j]>arr[j+1])
//				{
//					temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//	}

}
