package com.testers;

import com.utils.BinarySearch;
import com.utils.LinearSearch;

public class SearchingMain {

	public static void main(String[] args) {
					// 0   1   2   3   4   5   6   7   8   9   10
		int[] arr1 = {80, 55, 60, 10, 20, 30, 40, 22, 76, 59,  2};
		int[] arr2 = {12, 23, 32, 45, 57, 68, 72, 81, 96, 103, 117};
		
		//Linear Search
		LinearSearch ls = new LinearSearch();
		int key = ls.linerSearch(arr1, 59);
		System.out.println("Liner Search: "+key);
		
		//Binary Search
		BinarySearch bs = new BinarySearch();
		key = bs.binarySearch(arr2, 72);
		System.out.println("Binary Search: "+key);
		

	}

}
