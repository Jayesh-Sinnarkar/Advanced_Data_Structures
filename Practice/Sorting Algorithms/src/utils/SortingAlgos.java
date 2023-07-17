package utils;

public class SortingAlgos {
	
	
	
	public void selectionSort(int[] arr)
	{
		int temp=0;
		//applying selection sort
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//printing elements
		System.out.print("\nSelection sort: ");
		for(int a : arr)
			System.out.print(a+" ");			
	}
	
	public void bubbleSort(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length; i++)
		{
			boolean swapFlag = false;
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j]=temp;
					swapFlag = true;
				}
				
			}
			if(!swapFlag)
				break;
		}
		//printing array elements
		System.out.print("\nBubble Sort: ");
		for(int a : arr)
			System.out.print(a+" ");		
	}
	
	
	public void insertionSort(int[] arr)
	{
		
		for(int i=1; i<arr.length; i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		System.out.print("\nInsertion Sort: ");
		for(int a: arr)
			System.out.print(a+" ");
	}

}
