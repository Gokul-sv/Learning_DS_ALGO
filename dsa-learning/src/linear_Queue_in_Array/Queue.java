package linear_Queue_in_Array;
/*FIFO- First in First Out
1.enQueue
2.deQueue
3.peekInQueue
4.display
5.isEmpty
6.isFull
7.deleteQueue*/
public class Queue {
	int ar[];
	int first=0;
	int last=-1;
	
	Queue(int size)
	{
		ar=new int[size];
	}
	
	void enQueue(int data)
	{
		if(last==ar.length-1)
		{
			System.out.println("Queue is Full Can't Insert");
		}
		else
		{
			last++;
			ar[last]=data;
		}
	}
	
	void deQueue()
	{
		if(last==-1)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println(ar[first]+" is deleted from the Queue");
			first++;//*
			if(first>last)
			{
				last=-1;
				first=0;
			}
		}
	}
	
	void peekInQueue()
	{
		if(last==-1)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println(ar[first]);
		}
	}
	
	void display()
	{
		if(last==-1)
		{
			System.out.println("Queue is Empty Nothing to dispaly");
		}
		else
		{
			for(int i=first;i<=last;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.println();
		}
	}
	
	boolean isEmpty()
	{
		return (last==-1);
	}
	
	boolean isFull()
	{
		return (last==ar.length-1);
	}
	
	void deleteQueue()
	{
		ar=null;
		last=-1;
		first=0;
	}

}
