import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateOfArray dup = new DuplicateOfArray();
		RemoveDuplicatesOfArray removeDup = new RemoveDuplicatesOfArray();
		
		//dup.duplicateOfArray1();
		//dup.duplicateOfArray2();
		//dup.duplicateOfArrayUsingCollections();
		
		removeDup.removeDuplicates();
		
		//Stack implementation : 
		/*
		 * StackImpl stc = new StackImpl(10);
		 * System.out.println("Is stack empty : "+stc.isEmpty());
		 * System.out.println("Is stack full : "+stc.isFull());
		 * System.out.println("Peek : "+stc.peek()); stc.push(10); stc.push(1);
		 * stc.push(20); stc.push(50); stc.displayArray(); stc.pop();
		 * stc.displayArray();
		 */
		//System.out.println("elemetns "+stc.arr);
		
		LinkedListStack lls = new LinkedListStack();
		//System.out.println(lls.pop());
		lls.push(10);
		lls.push(20);
		lls.push(60);
		System.out.println("poped:"+lls.pop());
		lls.push(50);
		System.out.println("poped:"+lls.pop());
		lls.printList(lls.head);
		
		
	}

}
