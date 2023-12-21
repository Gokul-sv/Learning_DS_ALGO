package stack_in_Array;

public class Stack_Main {

	public static void main(String[] args) {
		
		Stack s = new Stack(3);
		s.push(11);
		s.push(12);
		s.push(13);
		s.display();
		s.peek();
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
	}

}
