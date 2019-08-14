package stack_in_Array;

public class Stack {
	int ar[];
	int topOfstack=-1; //*
	Stack(int size)
	{
		ar=new int[size];
	}
	void push(int data)
	{
		if(topOfstack+1>= ar.length)//*
		{
			System.out.println("Can't insert Stack is Full...");
		}
		else
		{
			topOfstack++;
			ar[topOfstack]=data;
		}
	}
	
	void pop()
	{
		if(topOfstack==-1)
		{
			System.out.println("Nothing to pop Stack is empty");
		}
		else
		{
			System.out.println("Poped element is "+ar[topOfstack]);
			topOfstack--;
		}
	}
	
	void peek()
	{
		if(topOfstack==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(ar[topOfstack]);
		}
	}
	
	boolean isEmpty()
	{
		return (topOfstack==-1);
	}
	
	boolean isFull()
	{
		return (topOfstack+1==ar.length);
	}
	
	void DeleteStack()
	{
		topOfstack=-1; //*
		ar=null;
	}
	
	
	void display()
	{
		if(topOfstack==-1)
		{
			System.out.println("Nothing to display Stack is empty");
		}
		else
		{
			for(int i=0;i<=topOfstack;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.println();
		}
	}
	
	

}
