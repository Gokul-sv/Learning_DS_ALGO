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
	
	void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
}
