package doublyLinkedList;

public class CircularDoublyLinkedListMain {

	public static void main(String[] args) {
		
		CircularDoublyLinkedList cdl=new CircularDoublyLinkedList();
		cdl.add(30);
		cdl.add(20);
		cdl.add(10);
		cdl.addBefore(2,40);
		cdl.set(0, 100);
		cdl.size();
		cdl.display();
		cdl.delete(1);
		cdl.display();
		System.out.println("First Prev="+cdl.first.prev.data);
		System.out.println("First Next="+cdl.first.next.data);
		System.out.println("last Prev="+cdl.last.prev.data);
		System.out.println("last Next="+cdl.last.next.data);
		

	}

}
