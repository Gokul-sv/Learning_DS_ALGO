package stack_in_LinkedList;

public class StackLL {
	Node first;
	int size=0;
	
	void push(int data)
	{
		Node n = new Node();
		n.data=data;
		n.next=first;
		first=n;
		size++;
	}
	
	void pop()
	{
		if(size==0)
		{
			System.out.println("Stack is empty Nothing to pop");
		}
		else
		{
			System.out.println("poped element is "+first.data);
			first=first.next;
			size--;
		}
	}
	
	void peek()
	{
		if(size==0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(first.data);
		}
	}
	
	boolean isEmpty()
	{
		return (first==null);
	}
	
	void deleteStack()
	{
		size=0;
		first=null;
	}
	void display()
	{
		if(size==0)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			Node temp= first;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	void size()
	{
		System.out.println(size);
	}
}
