package circular_Queue_in_Array;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue q = new Queue(4);
		q.enQueue(10);
		q.enQueue(20);
		q.display();
		q.deQueue();
		q.enQueue(30);
		q.deQueue();
		q.enQueue(40);
		q.deQueue();
		q.display();
		q.enQueue(70);
		q.enQueue(80);
		q.enQueue(90);
		q.deQueue();
		q.deQueue();
		q.display();
		System.out.println(q.size());
		System.out.println("first="+q.first+" last="+q.last);

	}

}
