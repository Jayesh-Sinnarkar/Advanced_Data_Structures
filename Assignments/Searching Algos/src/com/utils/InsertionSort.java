package com.utils;

public class InsertionSort {
	
	public void insertion(int[] arr)
	{
		int j, temp = arr.length-1;
		for (j = arr.length-2; j>=0 && arr[j]>temp; j--) {
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
	}
	
	public static void insertionSort(int[] arr)
	{	int temp,i,j;
		for ( i = 1; i < arr.length; i++) {
			 temp = arr[i];
			for ( j = i-1; j>=0 && arr[j]>temp; j--) {
				arr[j+1]=arr[j];				
			}
			arr[j+1]=temp;
		}
	}

}
