package testers;

import utils.SortingAlgos;

public class Tester {

	public static void main(String[] args) {
		SortingAlgos algos = new SortingAlgos();
		int[] arr = {90, 80, 70, 100, 50, 40, 200};
		System.out.print("\nArray before sort: ");
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		
		//algos.selectionSort(arr);
		//algos.bubbleSort(arr);
		algos.insertionSort(arr);
		

	}

}
