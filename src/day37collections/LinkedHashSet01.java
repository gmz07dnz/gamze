package day37collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	
	/*
	 * LinkedHashSet ==> Linked --> Her eklediği elemanı en sona ekler
	 *                   Hash --> Hashing tekniği kullarak her elemana kod uretir
	 *                   Set --> Tekrarlı elemana müsaade etmez  
	 *  
	 *   ==> elemanları ekleme sırasına göre dizer.
	 *   ==> LinkedHasSet, HashSet'den daha yavastır.                
	 */

	public static void main(String[] args) {
		
	LinkedHashSet<String>  lhs1 = new LinkedHashSet<>();
	
	lhs1.add("Ali");
	lhs1.add("Canan");
	lhs1.add("Veli");
	lhs1.add("Remziye");
	System.out.println(lhs1);//[Ali, Canan, Veli, Remziye]

	}

}
