package AVL_Tree;

public class AVLtree_Main {

	public static void main(String[] args) {
		AVLTree avl = new AVLTree();
		avl.insert(30);
		avl.insert(25);
		avl.insert(40);
		avl.insert(20);
		avl.levelOrder();
		avl.delete(40);
		avl.delete(25);
		avl.levelOrder();
		System.out.println(avl.height(avl.root));
	}
}
