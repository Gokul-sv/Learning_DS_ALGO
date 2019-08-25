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
		bt.display();
		//bt .delete(20);
		bt.levelOrder();
		bt.display();
		System.out.println(bt.size);
	}

}
