package binary_Tree_in_Array;

/*
insert
preOrder
inOrder
postOrder
levelOrder
delete
deleteBinaryTree
search
display
*/
public class BinaryTree {
	int ar[];
	int lastupdateindex=0;//In Binary tree iterative method we are leaving first (0th) index as empty to help insertion [O(1)]
	int size=0;
	BinaryTree(int length)
	{
		ar=new int[length+1];
	}
	
	void insert(int data)
	{
		if(size==ar.length)
		{
			System.out.println("Can't insert Array is full");
			return;
		}
		else
		{
			lastupdateindex++;
			ar[lastupdateindex]=data;
			size++;
		}
	}
	
	void preOrder(int index)//rLR-->  root(print),Left,Right
	{
		if(size==0)
		{
			System.out.println("can't do preOrder tree is empty");
			return;
		}
		else
		{
			if(index>lastupdateindex)
			{
				return;
			}
			else
			{
				System.out.print(ar[index]+" ");
				preOrder(index*2);
				preOrder((index*2)+1);	
			}
		}
	}
	
	void inOrder(int index)// LrR-->  Left,root(print),Right
	{
		if(size==0)
		{
			System.out.println("can't do inOrder tree is empty");
			return;
		}
		else
		{
			if(index>lastupdateindex)
			{
				return;
			}
			else
			{
				inOrder(index*2);
				System.out.print(ar[index]+" ");
				inOrder((index*2)+1);	
			}
		}
	}
	
	void postOrder(int index)// LRr-->  Left,Right,root(print)
	{
		if(size==0)
		{
			System.out.println("can't do postOrder tree is empty");
			return;
		}
		else
		{
			if(index>lastupdateindex)
			{
				return;
			}
			else
			{
				postOrder(index*2);
				postOrder((index*2)+1);	
				System.out.print(ar[index]+" ");
			}
		}
	}
	
	void levelOrder()
	{
		if(size==0)
		{
			System.out.println("can't do levelOrder tree is empty");
			return;
		}
		else
		{
			for(int i=1;i<=lastupdateindex;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.println();			
		}
	}
	
	void delete(int data)
	{
		if(size==0)
		{
			System.out.println("Can't delete tree is Empty");
			return;
		}
		else
		{
			for(int i=1;i<=lastupdateindex;i++)
			{
				if(ar[i]==data)
				{
					ar[i]=ar[lastupdateindex];
					lastupdateindex--;
					size--;
					return;
				}
			}
			System.out.println("Sorry data is not found in the tree, can't DELETE");
		}
	}
	
	void deleteBinaryTree()
	{
		ar=null;
		size=0;
		lastupdateindex=0;
	}
	
	void search(int data)
	{
		if(size==0)
		{
			System.out.println("Can't search tree is Empty");
			return;
		}
		else
		{
			for(int i=0;i<=lastupdateindex;i++)
			{
				if(ar[i]==data)
				{
					System.out.println("Value found in the tree index= "+i);
					return;
				}
			}
			System.out.println("Value not found in the tree");
		}
	}
	
	void display() // same logic as Level order 
	{
		if(size==0)
		{
			System.out.println("Can't Display tree is Empty");
			return;
		}
		else
		{
			for(int i=1;i<=lastupdateindex;i++)
			{
				System.out.print(ar[i]+" ");
			}
			System.out.println();
		}
	}
}
