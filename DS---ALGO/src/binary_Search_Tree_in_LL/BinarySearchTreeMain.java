package binary_Search_Tree_in_LL;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(30);
		bst.insert(40);
		bst.insert(20);
		bst.insert(50);
		bst.insert(25);
		bst.insert(45);
		bst.insert(15);
		bst.insert(35);
		bst.insert(38);
		bst.insert(37);
		bst.insert(47);
		System.out.println(bst.size);
		bst.levOrder();
		bst.delete(45);
		System.out.println(bst.size);
		bst.levOrder();
	}

}
