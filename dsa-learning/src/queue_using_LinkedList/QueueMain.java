package queue_using_LinkedList;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.display();
		q.display();
		q.peek();
		q.deleteQueue();
		System.out.println(q.size);
		System.out.println(q.isEmpty());
		System.out.println(q.last);
	}
}
