package binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	Node root;
	int size;
	
	void insertNodeInBT(int data)
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
			Queue<Node> q = new LinkedList();
			q.add(root);
			while(q.size()!=0)
			{
				Node temp=q.remove();
				if(temp.left==null)
				{	
					Node n = new Node();
					n.data=data;
					temp.left=n;
					size++;
					return;
				}
				else if(temp.right==null)
				{
					Node n = new Node();
					n.data=data;
					temp.right=n;
					size++;
					return;
				}
				else
				{
					q.add(temp.left);
					q.add(temp.right);
				}
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
		while(q.size()!=0)
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
	void preOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	void postOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		else
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	void search(int value)
	{
		if(root==null)
		{
			System.out.println("Can't search Tree is Empty");
			return;
		}
		else
		{
			Queue<Node> q = new LinkedList();
			q.add(root);
			while(!q.isEmpty())
			{
				Node temp=q.remove();
				if(temp.data==value)
				{
					System.out.println("Find the value "+value+" in the Tree");
					return;
				}
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
			}
			System.out.println("value is not present in the tree");
		}
	}

	int deepestNode()
	{
		int res=-1;
		if(root==null)
		{
			System.out.println("tree is empty");
			return res;
		}
		else
		{
			Queue<Node> q = new LinkedList();
			q.add(root);
			Node temp=null;
			while(!q.isEmpty())
			{
				temp=q.remove();
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
			}
			return temp.data;
		}
			
	}
	
	void deleteFromTree(int value) 
	{
		if(root==null)
		{
			System.out.println("Tree empty");
			return;
		}
		else
		{
			Queue<Node> q = new LinkedList();
			q.add(root);
			while(!q.isEmpty())
			{
				Node temp=q.remove();
				if(temp.data==value)
				{
					temp.data=deepestNode();
					deleteDeepestNode();
					return;
				}
				else
				{
					if(temp.left!=null)
					{
						q.add(temp.left);
					}
					if(temp.right!=null)
					{
						q.add(temp.right);
					}
				}
			}
		}
	}
	
	void deleteDeepestNode()
	{
		if(root==null)
		{
			System.out.println("Tree is Empty");
			return;
		}
		else
		{
			Queue<Node> q= new LinkedList();
			q.add(root);
			Node prev=null;
			Node temp=null;
			while(!q.isEmpty())
			{
				prev=temp;
				temp=q.remove();
				if(temp.left==null)
				{
					prev.right=null;//*****
					size--;
					return;
					
				}
				else if(temp.right==null)
				{
					temp.left=null;//*****
					size--;
					return;
				}
				else
				{
					q.add(temp.left);
					q.add(temp.right);
				}
			}
		}
	}
	
	void deleteBinaryTree()
	{
		root=null;
		System.out.println("Tree has been deleted sucessfully");
	}
}
