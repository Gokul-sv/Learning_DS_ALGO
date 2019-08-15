package linear_Queue_in_Array;

public class QueueMain {
	
	public static void main(String[] args)
	{
		Queue q = new Queue(3);
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		q.peekInQueue();
		System.out.println("first="+q.first+" last="+q.last);
		q.display();
		q.deQueue();
		q.peekInQueue();
		q.deQueue();
		q.peekInQueue();
		q.display();		
		q.deQueue();
		q.display();
		System.out.println("first="+q.first+" last="+q.last);
	}

}
