package day37collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	
	/*
	 * LinkedHashSet ==> Linked --> Her ekledi�i eleman� en sona ekler
	 *                   Hash --> Hashing tekni�i kullarak her elemana kod uretir
	 *                   Set --> Tekrarl� elemana m�saade etmez  
	 *  
	 *   ==> elemanlar� ekleme s�ras�na g�re dizer.
	 *   ==> LinkedHasSet, HashSet'den daha yavast�r.                
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
