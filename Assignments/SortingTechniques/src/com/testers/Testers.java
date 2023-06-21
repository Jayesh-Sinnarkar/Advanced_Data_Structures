package com.testers;

import java.util.Arrays;
import java.util.Scanner;

import com.utils.BubbleSort;
import com.utils.InsertionSort;
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
//		SelectionSort.selectionSort(arr);
		InsertionSort.insertionSort(arr);
		
		System.out.println("Array Elements: "+Arrays.toString(arr));
		
		
	}
	
}
	

