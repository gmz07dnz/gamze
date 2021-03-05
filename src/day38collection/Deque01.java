package day38collection;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

	/*
	 1) Double Ended Queue(deque) : Queue'lerde FIFO gecerli,Deque'lerde hem FIFO hem de LIFO(Last in First Out) gecerlidir.
	 */
	public static void main(String[] args) {
		
		Deque <String> dq1 = new LinkedList<>();
		dq1.add("Ali");
		dq1.add("Veli");
		dq1.add("Aydýn");
		dq1.add("Merve");
		dq1.add("Kadriye");

		System.out.println(dq1);// [Ali, Veli, Aydýn, Merve, Kadriye] ==> LinkedList , sýrayla yerleþtirir
		
		
		System.out.println(dq1.getFirst()); // Ali (copy-paste)
		System.out.println(dq1); //[Ali, Veli, Aydýn, Merve, Kadriye] ==> slinmedi
		
		
		System.out.println(dq1.getLast()); // Kadriye (copy-paste)
		System.out.println(dq1); //[Ali, Veli, Aydýn, Merve, Kadriye] ==> slinmedi
		
		
		System.out.println(dq1.peekFirst()); // Ali (copy-paste)
		System.out.println(dq1);//[Ali, Veli, Aydýn, Merve, Kadriye] ==> slinmedi
		
		/*
		 * Note: getFirst() ve peekFirst() methodlarý silmeden ilk elemaný return eder. 
		 * Fakat getFirst() --> bos deque'lerde exception atar.
		 *       peekFirst() --> bos deque'lerde null verir.
		 *       
		 * Yukarýdaký kural getLast() ve peekLast() için de gecerlidir.  
		 */
		
	//	dq1.clear();
	//	System.out.println(dq1.peekFirst()); // exception
		//System.out.println(dq1.getFirst()); // null
		
		System.out.println(dq1.pollFirst()); // Ali (cut paste)
		System.out.println(dq1); // [Veli, Aydýn, Merve, Kadriye]
		System.out.println(dq1.pollLast()); // Kadriye  (cut paste)
		System.out.println(dq1); // [Veli, Aydýn, Merve, ]
		
		
		
		
		
		
		
		
	}

}
