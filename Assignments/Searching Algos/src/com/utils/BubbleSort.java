package com.utils;

public class BubbleSort {
	private static int temp;
	
	public static void bubbleSort(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) {
			boolean swapFlag=false;
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1])
				{
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapFlag = true;
				}
			}
			if(swapFlag==false)
				break;
			}
	}
	

}
