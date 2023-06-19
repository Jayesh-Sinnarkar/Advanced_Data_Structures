package com.utils;

public class LinearSearch {
	public int linerSearch(int[] arr, int key)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key)
				return i;
		}
		
		return -1;
	}

}
