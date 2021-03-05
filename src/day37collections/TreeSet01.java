package
day37collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet01 {

	/*
	 * TreeSet ==> set--> tekrarl� eleman kabul etmez.
	 * 2) Elemanlar� natural order'a g�re s�ralar . String -->alfabetik s�ra
	 *                                              int --> k���kten b�y�ge
	 * 
	 * 3) TreeSet, set'lerin en yavas�d�r.Bu y�zden TreeSet kullan�rken dikkatli olun                                             
	 * 
	 */
	
	public static void main(String[] args) {
		
	long startingTime = System.currentTimeMillis();  //  currentTime--> anl�k zaman   Millis --> saniye
	
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Ali");
		ts1.add("Zehra");
		ts1.add("Metin");
		ts1.add("Bedia");
		ts1.add("Cemil");
		System.out.println(ts1); // [Ali, Bedia, Cemil, Metin, Zehra]
		
		
	long endingTime = System.currentTimeMillis(); 	
	
	System.out.println("Treeset S�resi: "+ (endingTime - startingTime)); // 2 ms
	
	// HashSet ile yapal�m
	
	long  startingTime1 = System.currentTimeMillis();
	
	HashSet<String> hs1 = new HashSet<>();
	
	hs1.add("Ali");
	hs1.add("Zehra");
	hs1.add("Metin");
	hs1.add("Bedia");
	hs1.add("Cemil");
	System.out.println(hs1); // [Cemil, Bedia, Metin, Ali, Zehra]
	
	long endingTime1 = System.currentTimeMillis();
	System.out.println("HashSet Suresi: "+ (endingTime1-startingTime1)); // 0 ms
	
	
	
	// LinkedHashSet ile yapal�m
	
	long startingTime2 = System.currentTimeMillis();
	LinkedHashSet<String> lhs = new LinkedHashSet<>();
	lhs.add("Ali");
	lhs.add("Zehra");
	lhs.add("Metin");
	lhs.add("Bedia");
	lhs.add("Cemil");
	System.out.println(lhs); // [Ali, Zehra, Metin, Bedia, Cemil]
	
	long endingTime2 = System.currentTimeMillis();
	
	System.out.println("LinkedHasSet s�resi: " + (endingTime2 - startingTime2)); // 1 ms
	}

}
