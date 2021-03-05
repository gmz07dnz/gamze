package day37collections;

import java.util.LinkedList;

public class LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(3);
		ll1.add(4);
		ll1.add(5);
		ll1.add(6);
		ll1.add(33);
		System.out.println(ll1); // [3, 4, 5, 6]
		
		ll1.remove(3);  // remove içine int koyarsak java bunu index kabul eder.
		System.out.println(ll1);// [3, 4, 5]

	//	ll1.remove(33); // Olmayan bir index yazýlýrsa IndexOutOfBoundsException atar
	}

}
