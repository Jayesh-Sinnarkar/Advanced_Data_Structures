package com.utils;

public class BinarySearch {
	
	public int binarySearch(int[] arr, int key)
	{
		int left=0, middle = 0;
		int right = arr.length-1;
		
		while(left<=right)
		{
			middle = (left+right)/2;
			
			if(key==arr[middle])
				return middle;
			else if(key>arr[middle]) {
				left= middle+1;
			}
			else {
				right = middle-1;
			}			
		}
		
		return -1;
	}

}
