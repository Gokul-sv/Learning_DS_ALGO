package AVL_Tree;

public class AVLtree_Main {

	public static void main(String[] args) {
		AVLTree avl = new AVLTree();
		avl.insert(30);
		avl.insert(25);
		avl.insert(35);
		avl.insert(20);
		avl.insert(15);
		avl.levelOrder();
		avl.insert(10);
		avl.levelOrder();
		System.out.println(avl.height(avl.root));
	}
}
