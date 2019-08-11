package linkedList;

public class Circular_SinglyLinkedList {
	Node first=null;
	Node last=null;
	int size=0;
	
	void add(int data) 
	{
		Node n = new Node();
		n.data = data;
		n.next = first;
		first=n;
		if(last==null)
		{
			last=n;
		}
		last.next=first;
		size++;
	}
	void addFirst(int data)
	{
		add(data);
	}
	
	void addLast(int data)
	{
		Node n = new Node();
		n.data = data;
		n.next = null;
		if(last!=null)
		{ 
			last.next=n;
		}
		if(first== null)
		{
			first=n;
		}
			
		last=n;
		last.next=first;
		size++;
	}
	
	void addAfter(int index,int value)
	{
		if(index > size-1 || index < 0)
		{
			return;
		}		
		int indx = 0;
		Node temp = first;
		while(temp!=null)
		{
			if(index == indx)
			{
				Node n = new Node();
				n.data =value;
				n.next =temp.next;
				temp.next=n;
				if(index == size-1)
				{
					last=n;
				}
				size++;
				return;
			}
			indx++;
			temp=temp.next;
		}
	}
	
	void addBefore(int index,int data) 
	{
		if(index < 0 || index > size-1)
		{
			return;
		}
		if(index==0)
		{
			add(data);
		}
		int indx=0;
		Node temp = first;
		while(temp!=null)
		{
			if(index == indx+1)
			{
				Node n = new Node();
				n.data=data;
				n.next=temp.next;
				temp.next=n;
				size++;
				return;
			}
			indx++;
			temp=temp.next;
		}
	}
	
	void size()
	{
		System.out.println(size);
	}
	
	void display()
	{
		if(size==0)
		{
			return;
		}
		Node temp = first;
		while(true)
		{
			System.out.print(temp.data+" ");
			if(temp==last)
			{
				System.out.println();
				return;
			}
			temp=temp.next;
		}
	}
	
	int indexOf(int data)
	{
		int index=-1;
		if(first!=null)
		{
			Node temp=first;
			while(true)
			{
				index++;
				if(temp.data == data) 
				{
					return index;
				}
				if(temp==last)
				{
					return -1;
				}
				temp=temp.next;
			}
		}
		return -1;
	}
	
	int get(int index)
	{
		if(index > size-1)
		{
			return -1;
		}
		int indx=-1;
		Node temp=first;
		while(true)
		{
			indx++;
			if(indx == index)
			{
				return temp.data;
			}
			if(temp==last)
			{
				return-1;
			}
			temp=temp.next;
		}
	}
	
	void deleteFront()
	{
		if(size==0)
		{
			return;
		}
		else if(size==1)
		{	
			first.next=null;//because here it's pointing to itself (then only it will eligible for GC)
			first=null;
			last=null;
			size--;
			return;
		}
		first=first.next;
		last.next=first;
		size--;
	}
	
	void deleteLast()
	{
		if(size==0)
		{
			return;
		}
		else if(size==1)
		{
			first.next=null;
			first=null;
			last=null;
			size--;
			return;
		}
		Node temp=first;
		while(temp!=null)
		{
			if(temp.next.next==first)
			{	
				temp.next=null;
				last=temp;
				last.next=first;
				size--;
				return;
			}
			temp=temp.next;
		}
	}
	
	void delete(int index)
	{
		if(index > size-1 || index < 0)
		{
			return;
		}
		if(index==0)
		{
			deleteFront();
			return;
		}
		if(index==size-1)
		{
			deleteLast();
			return;
		}
		int indx=0;
		Node temp = first;
		while(true)
		{
			if(index == indx+1)
			{
				temp.next=temp.next.next;
				size--;
				return;
			}
			if(temp==last)
			{
				return;
			}
			indx++;
			temp=temp.next;
		}
	}
	
	void set(int index,int value)
	{
		if(index > size-1 || index < 0)
		{
			System.out.println("Invalid index");
			return;
		}
		int indx=0;
		Node temp = first;
		while(true)
		{
			if(index == indx)
			{
				temp.data=value;
				return;
			}
			
			if(temp==last)
			{
				return;
			}
			indx++;
			temp=temp.next;
		}
	}

}
