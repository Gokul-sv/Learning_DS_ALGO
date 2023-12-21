package doublyLinkedList;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.set(6,100);
		dl.add(30);
		dl.add(20);
		dl.add(10);
		dl.addBefore(2,40);
		dl.display();
		dl.reverseDisplay();
		dl.size();
		System.out.println(dl.get(2));
		System.out.println("First Prev="+dl.first.prev);
		System.out.println("First Next="+dl.first.next);
		System.out.println("last Prev="+dl.last.prev);
		System.out.println("last Next="+dl.last.next);
		
	}

}
