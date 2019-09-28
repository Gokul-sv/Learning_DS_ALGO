package sorting_Algorithms;

public class Sorting {
	
	int[] bubbleSort(int ar[])
	{
		int n=ar.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)//*
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
	}
	
	int[] selectionSort(int ar[])
	{
		int n = ar.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			int j;
			for(j=i;j<n;j++)
			{
				if(ar[j]<ar[min])
				{
					min=j;
				}
			}
			if(min!=j)
			{
				int temp=ar[i];
				ar[i]=ar[min];
				ar[min]=temp;
			}
		}
		return ar;
	}
	
	int[] insertionSort(int ar[])
	{
		for(int i=1;i<ar.length;i++)
		{
			int curelmt=ar[i];
			int j=i;
			while(j>0 && ar[j-1]>curelmt)//**here we are checking new element(curelmt) with last element of the sorted part (if it fails then new element is greater than the sorted part it will add followed by the sorted array)
			{
				ar[j]=ar[j-1];// shifting element to right side. 
				j--;
			}
			ar[j]=curelmt;// inserting new element in the correct position.
		}
		return ar;
	}
	void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
}
