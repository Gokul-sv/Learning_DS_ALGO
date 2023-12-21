package linkedList;

public class SinglyLinkedListMain {

	public static void main(String[] args) 
	{
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.deleteLast();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.display();
		sl.addLast(12);
		sl.size();
		sl.display();
		System.out.println(sl.first.data);
		System.out.println(sl.last.next);
	}
}
