package binary_Tree_in_Array;

public class BinaryTreeMainArray {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(8);
		bt.insert(20);
		bt.insert(100);
		bt.insert(3);
		bt.insert(50);
		bt.insert(15);
		bt.insert(250);
		bt.insert(35);
		bt.insert(222);
		bt.preOrder(1);
		System.out.println();
		bt.inOrder(1);
		System.out.println();
		bt.postOrder(1);
		System.out.println();
		bt.display();
		bt .delete(20);
		bt.levelOrder();
		System.out.println(bt.size);
	}
}
