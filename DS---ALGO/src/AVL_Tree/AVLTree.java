package AVL_Tree;

import java.util.LinkedList;
import java.util.Queue;


public class AVLTree {
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
			root=insert_avl(root,data);
		}
	}
	
	Node insert_avl(Node curnode,int data)
	{
		if(curnode==null)
		{
			Node n = new Node();
			n.data=data;
			curnode=n;
			size++;
		}
		else if(data<curnode.data)
		{
			curnode.left=insert_avl(curnode.left,data);
		}
		else if(data>curnode.data)
		{
			curnode.right=insert_avl(curnode.right,data);
		}
		int balance=height(curnode.left)-height(curnode.right);
		if(balance>1)
		{
			if(height(curnode.left.left)>=height(curnode.left.right))
			{
				curnode=rightRotation(curnode);
			}
			else
			{
				curnode=leftRotation(curnode);
				curnode=rightRotation(curnode);
			}
		}
		else if(balance<-1)
		{
			if(height(curnode.left.left)>=height(curnode.left.right))
			{
				curnode=leftRotation(curnode);
			}
			else
			{
				curnode=rightRotation(curnode);
				curnode=leftRotation(curnode);
			}
		}
		return curnode;
	}
	
	Node rightRotation(Node curnode)
	{
		Node newRoot=curnode.left;
		curnode.left=newRoot.right;
		newRoot.right=curnode;
		return newRoot;
	}
	Node leftRotation(Node curnode)
	{
		Node newRoot = curnode.right;
		curnode.right=newRoot.left;
		newRoot.left=curnode;
		return newRoot;
	}
	int height(Node n)
	{
		if(n==null)
			return 0;
		else
		{
			int leftDepth=height(n.left);
			int rightDepth=height(n.right);	
			if(leftDepth>rightDepth)
			{
				return leftDepth+1;
			}
			else
			{
				return rightDepth+1;
			}
		}
	}
	
	void levelOrder()//level order traversal
	{
		if(root==null)
		{
			System.out.println("Tree is Empty can't Traverse");
			return;
		}
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
