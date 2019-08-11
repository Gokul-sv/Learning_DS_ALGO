package doublyLinkedList;

public class CircularDoublyLinkedList {
	Node first=null;
	Node last=null;
	int size=0; 
	
	void add(int data)
	{
		if(first==null)
		{
			Node n = new Node();
			n.data=data;
			n.next=n;
			n.prev=n;
			first=n;
			last=n;
			size++;
		}
		else
		{
			Node n = new Node();
			n.data=data;
			n.next=first;
			n.prev=last;
			first.prev=n;
			first=n;
			last.next=first;
			size++;
		}
	}
	
	void addFront(int data)
	{
		add(data);
	}
	
	void addLast(int data)
	{
		Node n = new Node();
		n.data=data;
		n.next=first;
		n.prev=last;
		last.next=n;
		last=n;
		first.prev=n;
		size++;
	}
	
	void addAfter(int index,int data)
	{
		if(size==0 && index==0)
		{
			add(data);
			return;
		}		
		int indx=0;
		Node temp = first;
		while(true)
		{
			if(index==indx)
			{
				Node n = new Node();
				n.data=data;
				n.next=temp.next;
				n.prev=temp;
				if(index==size-1)// this logic included for if we need to add end of the list(last)
				{					
					last=n;
					first.prev=last;
				}
				else
				{
					temp.next.prev=n;
				}

				temp.next=n;
				size++;
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
	
	void addBefore(int index,int data)
	{
		if(size==0 && index==0)
		{
			add(data);
			return;
		}	
		if(index>size-1 || index <0)
		{
			return;
		}
		int indx=0;
		Node temp = first;
		while(true)
		{
			if(index == indx)
			{
				Node n = new Node();
				n.data=data;
				n.next=temp;
				n.prev=temp.prev;
				if(index==0)    //logic for adding as first
				{
					first=n;
					last.next=first;
				}
				else
				{
					temp.prev.next=n;  // in between two nodes				
				}

				temp.prev=n;
				size++;
				return;
			}
			indx++;
			temp=temp.next;
		}
		
	}
	
	void display()
	{
		if(size==0)
		{
			System.out.println("Can't Display The List is Empty");
		}
		else
		{
			Node temp=first;
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
	}
	void set(int index,int data)
	{
		if(size==0)
		{
			System.out.println("Can't set List is empty..");
		}
		else
		{
			int indx=0;
			Node temp=first;
			while(true)
			{
				if(index==indx)
				{
					temp.data=data;
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
	
	void size()
	{
		System.out.println(size);
	}
	
	void reverseDisplay()
	{
		if(size==0)
		{
			System.out.println("Can't Display The List is Empty");
		}
		else
		{
			Node temp=last;
			while(true)
			{
				System.out.print(temp.data+" ");
				if(temp==first)
				{
					System.out.println();
					return;
				}
				temp=temp.prev;
			}
		}
	}
	
	void deleteFront()
	{
		if(size==0)
		{
			System.out.println("Can't Delete The List is Empty");
		}
		else if(size==1)
		{
			first.next=null;
			first.prev=null;
			first=null;
			last=null;
			size--;
		}
		else
		{
			first.next.prev=null;
			first=first.next;
			last.next=first;
			first.prev=last;
			size--;
		}		
	}
	
	void deleteLast()
	{
		if(size==0)
		{
			System.out.println("Can't Delete The List is Empty");
		}
		else if(size==1)
		{
			first.next=null;
			first.prev=null;
			first=null;
			last=null;
			size--;
		}
		else
		{
			last.prev.next=null;
			last=last.prev;
			first.prev=last;
			last.next=first;
			size--;
		}
	}
	
	void delete(int index)
	{
		if(size==0)
		{
			System.out.println("Can't Delete The List is Empty");
		}
		else if(index>size-1 || index<0)
		{
			System.out.println("Invalid index..");
			return;
		}
		else if(index==0)
		{
			deleteFront();
			return;
		}
		else if(index==size-1)
		{
			deleteLast();
			return;
		}
		else
		{	
			int indx=0;
			Node temp=first;
			while(true)
			{
				if(index == indx+1)
				{
					temp.next.prev=null;
					temp.next=temp.next.next;
					temp.next.prev=temp;
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
	}
	
	void search(int data)
	{
		if(size==0)
		{
			System.out.println("Can't Delete The List is Empty");
		}
		else
		{
			int indx=0;
			Node temp = first;
			while(true)
			{
				if(temp.data == data)
				{
					System.out.println("Data found in the list at the index of "+indx);
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
	
	int get(int index)
	{
		if(size==0)
		{
			return -1;
		}
		else
		{
			int indx=0;
			Node temp=first;
			while(true)
			{
				if(index==indx)
				{
					return temp.data;
				}
				if(temp==last)
				{
					return -1;
				}
				indx++;
				temp=temp.next;
			}
		}
	}

}
