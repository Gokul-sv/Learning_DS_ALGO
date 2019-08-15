package circular_Queue_in_Array;

public class Queue {
	int ar[];
	int size=0;
	int first=0;
	int last=-1;
	
	Queue(int length)
	{
		ar=new int[length];
	}
	
	void enQueue(int data)
	{
		if(size==ar.length)
		{
			System.out.println("Queue is Full");
		}
		else
		{
			if(last==ar.length-1)
			{
				last=0;
			}
			else
			{
				last++;
			}
			ar[last]=data;
			size++;
		}
	}
	
	void deQueue()
	{
		if(last==-1)
		{
			System.out.println("Queue is Empty Can't dequeue");
		}
		else
		{
			if(first==ar.length-1)
			{
				System.out.println(ar[first]+" is deleted from the Queue");
				size--;
				if(first==last)
				{
					last=-1;
					first=0;
				}
				else
				{
					first=0;
				}
			}
			else
			{
				System.out.println(ar[first]+" is deleted from the Queue");
				size--;
				if(first==last)
				{
					last=-1;
					first=0;
				}
				else
				{
					first++;					
				}
			}
		}
	}
	
	void display()
	{
		if(last==-1)
		{
			System.out.println("Queue is Empty nothing to display");
		}
		else
		{
			if(first<=last)
			{
				for(int i=first;i<=last;i++)
				{
					System.out.print(ar[i]+" ");
				}
			}
			if(first > last)
			{
				for(int i=first;i<=ar.length-1;i++)
				{
					System.out.print(ar[i]+" ");
				}
				for(int i=0;i<=last;i++)
				{
					System.out.print(ar[i]+" ");
				}
			}
			System.out.println();
		}
	}
	
	int size() 
	{
		return size;
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

	boolean isEmpty()
	{
		return (last==-1);
	}
	
	boolean isFull()
	{
		return (size ==ar.length );
	}
	
	void deleteQueue()
	{
		ar=null;
		last=-1;
		first=0;
	}

}
