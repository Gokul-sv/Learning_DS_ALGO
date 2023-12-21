package stack_in_LinkedList;

public class StackLLMain {
	public static void main(String[] args)
	{
		StackLL s = new StackLL();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.deleteStack();
		s.size();
		s.pop();
		s.peek();
		System.out.println(s.isEmpty());
		s.display();
	}

}
