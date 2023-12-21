package binary_Tree_in_LL;

public class BinaryTreeLLMain {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.insertNodeInBT(20);
		bt.insertNodeInBT(100);
		bt.insertNodeInBT(3);
		bt.insertNodeInBT(50);
		bt.insertNodeInBT(15);
		bt.insertNodeInBT(250);
		bt.insertNodeInBT(35);
		bt.insertNodeInBT(222);
		System.out.println(bt.size);
		System.out.println(bt.deepestNode());
		bt.levelOrder();
		bt.deleteFromTree(20);
		bt.levelOrder();
		System.out.println(bt.size);
		bt.levelOrder();
		System.out.println(bt.deepestNode());	
	}
}
