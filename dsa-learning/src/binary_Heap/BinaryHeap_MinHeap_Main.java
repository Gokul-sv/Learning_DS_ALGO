package binary_Heap;

public class BinaryHeap_MinHeap_Main {
	public static void main(String[] args)
	{
		BinaryHeap_MinHeap bh = new BinaryHeap_MinHeap(8);
		bh.insert(2);
		bh.insert(8);
		bh.insert(7);
		bh.insert(10);
		bh.insert(20);
		bh.insert(11);
		bh.insert(9);
		bh.insert(100);
		bh.display();
		bh.extractMin();
		bh.display();
		bh.peek();
	}

}
