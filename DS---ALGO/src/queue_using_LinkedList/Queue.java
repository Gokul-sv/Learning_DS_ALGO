package queue_using_LinkedList;

public class Queue {
	Node first;
	Node last;
	int size;
	
	void enQueue(int data)
	{
		Node n =new Node();
		n.data=data;
		if(size==0 && first==null)
		{
			first=last=n;
		}
		else
		{
			n.next=last.next;
			last.next=n;
			last=n;
		}
		size++;
	}
	
	void deQueue()
	{
		if(size==0 && last==null)
		{
			System.out.println("Nothig to display Queue is Empty");
		}
		else
		{
			if(size==1)
			{
				first=last=null;
				size--;
				return;
			}
			first=first.next;
			size--; 
		}
	}
	
	void display()
	{
		if(size==0)
		{
			System.out.println("Queue is empty Can't Display");
			return;
		}
		Node temp = first;
		{
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}

}
