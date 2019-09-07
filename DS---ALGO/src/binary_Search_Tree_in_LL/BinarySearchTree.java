package binary_Search_Tree_in_LL;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	int size;
	
	
	void insert(int data)
	{
		if(root==null)
		{
			Node n = new Node();
			n.data=data;
			root=n;
			size++;
		}
		else
		{
			bst_insert(root,data);
		}
	}
	Node bst_insert(Node curNode,int data)
	{
		if(curNode==null)
		{
			Node n = new Node();
			n.data=data;
			curNode=n;
			size++;
		}
		else
		{
			if(data<curNode.data)
			{
				curNode.left=bst_insert(curNode.left,data);
			}
			else if(data>curNode.data)
			{
				curNode.right=bst_insert(curNode.right,data);
			}
		}
		return curNode;
	}
	
	void levOrder()
	{
		if(root==null)
		{
			System.out.println("Can't do level order traversal");
		}
		else
		{
			Queue<Node> q = new LinkedList();
			q.add(root);
			while(!q.isEmpty())
			{
				Node temp=q.remove();
				System.out.print(temp.data+" ");
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
			}
			System.out.println();			
		}
	}
	
	void preOrder(Node n)
	{
		if(n==null)
		{
			return;
		}
		else
		{
			System.out.print(n.data+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	void inOrder(Node n)
	{
		if(n==null)
		{
			return;
		}
		else
		{
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
		}
	}
	void postOrder(Node n)
	{
		if(n==null)
		{
			return;
		}
		else
		{
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.data+" ");
		}
	}
	void delete(int data)
	{
		if(root==null)
		{
			System.out.println("Can't delete tree is empty");
		}
		else
		{
			delete(root,data);
		}
	}
	
	Node delete(Node nroot,int data)
	{
		if(nroot==null)
		{
			return null;
		}
		if(data<nroot.data)
		{
			nroot.left=delete(nroot.left,data);
		}
		else if(data>nroot.data)
		{
			nroot.right=delete(nroot.right,data);
		}
		else if(nroot.data==data)
		{
			if(nroot.left==null && nroot.right==null)
			{
				nroot=null;
				size--;
			}
			else if(nroot.left!=null && nroot.right==null)
			{
				nroot=nroot.left;
				size--;
			}
			else if(nroot.right!=null && nroot.left==null)
			{
				nroot=nroot.right;
				size--;
			}
			else if(nroot.left!=null && nroot.right!=null)
			{
				Node temp=min_of_rit_subTree(nroot);//***
				nroot=delete(nroot,temp.data);//******
				nroot.data=temp.data;//***
			}
		}
		return nroot;
	}
	Node min_of_rit_subTree(Node curroot)
	{
		if(curroot.left!=null)
		{
			curroot=min_of_rit_subTree(curroot.left);
		}
		return curroot;
	}
	void delete_BST()
	{
		root=null;
		size=0;
	}
}
