package sorting_Algorithms;

public class Sorting_Main {

	public static void main(String[] args) {
		int ar[] = new int[] {30,20,40,10,80,50,15};
		Sorting s = new Sorting();
		s.quickSort(ar,0,ar.length-1);
		s.display(ar);
		
	}

}
