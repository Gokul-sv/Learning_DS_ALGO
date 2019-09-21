package binary_Heap;

public class BinaryHeap_MinHeap {
	int sizeOfHeap=0;// also index
	int ar[];
	BinaryHeap_MinHeap(int length)
	{
		ar=new int[length+1];
	}
	
	void insert(int data)
	{
		if(!(sizeOfHeap<ar.length))
		{
			System.out.println("Can't insert");
		}
		else
		{
			sizeOfHeap++;
			ar[sizeOfHeap]=data;
			heapifyBottomtoTop(sizeOfHeap);
		}
	}
	void extractMin()// extract 1st element in the heap and we can't extract random element(becz heap property)
	{
		if(sizeOfHeap==0)
		{
			System.out.println("Can't Extract");
		}
		else
		{
			System.out.println(ar[1]+" is Exracted");
			ar[1]=ar[sizeOfHeap];
			sizeOfHeap--;
			heapifyToptoBottom(1);	
		}
	}
	void heapifyBottomtoTop(int index)
	{
		while(index>0)
		{
			if(ar[index/2]>ar[index])
			{
				int temp=ar[index];
				ar[index]=ar[index/2];
				ar[index/2]=temp;
			}
			index=index/2;
		}		
	}
	
	void heapifyToptoBottom(int index)
	{
		while((index*2)+1<=sizeOfHeap)
		{
			if(ar[index]>ar[index*2] || ar[index]>ar[(index*2)+1])
			{
				
				if(ar[index*2]<ar[(index*2)+1])//****
				{
					int temp=ar[index];
					ar[index]=ar[index*2];
					ar[index*2]=temp;
					index=index*2;
				}
				else
				{
					int temp=ar[index];
					ar[index]=ar[(index*2)+1];
					ar[(index*2)+1]=temp;
					index=(index*2)+1;
				}
			}
			else//*
			{
			index=index*2;
			}
		}
	}
	void display()
	{
		if(sizeOfHeap==0)
		{
			System.out.println("Heap is Empty");
		}
		else
		{
			for(int i=1;i<=sizeOfHeap;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.println();
		}
	}
	
	void peek()//top of heap
	{
		if(sizeOfHeap==0)
		{
			System.out.println("Heap is empty...");
		}
		else
		{
			System.out.println("Peek element "+ar[1]);
		}
	}
	void deleteHeap()
	{
		ar=null;
		sizeOfHeap=0;
	}
}
