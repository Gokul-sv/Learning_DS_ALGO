package linkedList;

public class Circular_SinglyLinkedListMain {
	public static void main(String [] args)
	{
		Circular_SinglyLinkedList csl = new Circular_SinglyLinkedList();
		csl.add(30);
		csl.add(20);
		csl.add(10);
		csl.addLast(40);
		csl.size();
		csl.display();
		csl.set(3,111);
		csl.display();
		//System.out.println(csl.get(4));
		System.out.println(csl.last.next.data);
		System.out.println("--------");
	}

}
