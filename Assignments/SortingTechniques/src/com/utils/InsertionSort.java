package com.utils;

public class InsertionSort {
	
	public static void insertionSort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++) {
			int j,temp=arr[i];
			
			for(j=i-1; j>=0 && arr[j]>temp;j--)
				arr[j+1]=arr[j];
			
			arr[j+1]=temp;
		}
	}

}
