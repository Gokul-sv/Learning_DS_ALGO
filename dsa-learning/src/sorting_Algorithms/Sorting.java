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
	
	void mergeSort(int ar[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			mergeSort(ar,l,m);
			mergeSort(ar,m+1,r);
			merge(ar,l,m,r);
		}
	}
	void merge(int ar[],int l,int m,int r)
	{
		int Ll=m-l+1;
		int Rl=r-m;
		int L[]=new int[Ll];
		int R[]=new int[Rl];		
		
		for(int i=0;i<Ll;i++)
		{
			L[i]=ar[l+i];
		}
		for(int j=0;j<Rl;j++)
		{
			R[j]=ar[m+j+1];
		}
		
		int i=0,j=0;
		int k=l;
		
		while(i<Ll && j<Rl )
		{
			if(L[i]<=R[j])
			{
				ar[k]=L[i];
				i++;
			}
			else
			{
				ar[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<Ll)
		{
			ar[k]=L[i];
			i++;
			k++;
		}
		while(j<Rl)
		{
			ar[k]=R[j];
			j++;
			k++;
		}
		
	}
	
	void quickSort(int ar[],int low,int high)
	{
		if(low<high)
		{
			int pivot=partition(ar,low,high);
			quickSort(ar,low,pivot-1);
			quickSort(ar,pivot+1,high);
		}
	}
	//this method do the operation[i and j](make sure left side of the pivot should be lesser than pivot and right side should be higher than that ) and return the pivot
	int partition(int ar[],int low,int high)
	{
		int pivot=ar[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(ar[j]<pivot)
			{
				i++;
				int temp = ar[i];
				ar[i]= ar[j];
				ar[j]=temp;
			}
		}
		int temp=ar[i+1];
		ar[i+1]=ar[high];//high or pivot
		ar[high]=temp;
		
		return i+1;// i+1 is nothing but pivot
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
