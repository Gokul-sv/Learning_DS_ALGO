package avl_tree;

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
		int balance=height(curnode.left)-height(curnode.right);// calculating the height
 		if(balance>=2)
		{
			if(height(curnode.left.left)>=height(curnode.left.right))
			{
				curnode=rightRotation(curnode);//LL
			}
			else
			{
				curnode.left=leftRotation(curnode.left);//LR
				curnode=rightRotation(curnode);
			}
		}
		else if(balance<=-2)
		{
			if(height(curnode.right.right)>=height(curnode.right.left))
			{
				curnode=leftRotation(curnode);//RR
			}
			else
			{
				curnode.right=rightRotation(curnode.right);//RL
				curnode=leftRotation(curnode);
			}
		}
		return curnode;
	}
	
	Node rightRotation(Node curnode)
	{
		Node newRoot=curnode.left;
		curnode.left=curnode.left.right;
		newRoot.right=curnode;
		return newRoot;
	}
	Node leftRotation(Node curnode)
	{
		Node newRoot = curnode.right;
		curnode.right=curnode.right.left;
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
	
	void delete(int data)
	{
		if(root==null)
		{
			System.out.println("Can't delete tree is empty");
		}
		else
		{
			root=delete(root,data);
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
			if(nroot.left==null && nroot.right==null)//case:1
			{
				nroot=null;
				size--;
			}
			else if(nroot.left!=null && nroot.right==null)//case:2 left
			{
				nroot=nroot.left;
				size--;
			}
			else if(nroot.right!=null && nroot.left==null)//case:2 Right
			{
				nroot=nroot.right;
				size--;
			}
			else if(nroot.left!=null && nroot.right!=null)//case:3
			{
				Node temp=min_of_rit_subTree(nroot.right);//***
				nroot=delete(nroot,temp.data);//******
				nroot.data=temp.data;//***
			}
		}
		if(nroot!=null)
		{
			int balance=height(nroot.left)-height(nroot.right);
	 		if(balance>=2)
			{
				if(height(nroot.left.left)>=height(nroot.left.right))
				{
					nroot=rightRotation(nroot);//LL
				}
				else
				{
					nroot.left=leftRotation(nroot.left);//LR
					nroot=rightRotation(nroot);
				}
			}
			else if(balance<=-2)
			{
				if(height(nroot.left.left)>=height(nroot.left.right))
				{
					nroot=leftRotation(nroot);//RR
				}
				else
				{
					nroot.right=rightRotation(nroot.right);//RL
					nroot=leftRotation(nroot);
				}
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
	void delete_AVL()
	{
		root=null;
		size=0;
	}
}
