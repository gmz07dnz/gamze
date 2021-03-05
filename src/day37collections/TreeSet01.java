package
day37collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet01 {

	/*
	 * TreeSet ==> set--> tekrarlý eleman kabul etmez.
	 * 2) Elemanlarý natural order'a göre sýralar . String -->alfabetik sýra
	 *                                              int --> küçükten büyüge
	 * 
	 * 3) TreeSet, set'lerin en yavasýdýr.Bu yüzden TreeSet kullanýrken dikkatli olun                                             
	 * 
	 */
	
	public static void main(String[] args) {
		
	long startingTime = System.currentTimeMillis();  //  currentTime--> anlýk zaman   Millis --> saniye
	
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Ali");
		ts1.add("Zehra");
		ts1.add("Metin");
		ts1.add("Bedia");
		ts1.add("Cemil");
		System.out.println(ts1); // [Ali, Bedia, Cemil, Metin, Zehra]
		
		
	long endingTime = System.currentTimeMillis(); 	
	
	System.out.println("Treeset Süresi: "+ (endingTime - startingTime)); // 2 ms
	
	// HashSet ile yapalým
	
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
	
	
	
	// LinkedHashSet ile yapalým
	
	long startingTime2 = System.currentTimeMillis();
	LinkedHashSet<String> lhs = new LinkedHashSet<>();
	lhs.add("Ali");
	lhs.add("Zehra");
	lhs.add("Metin");
	lhs.add("Bedia");
	lhs.add("Cemil");
	System.out.println(lhs); // [Ali, Zehra, Metin, Bedia, Cemil]
	
	long endingTime2 = System.currentTimeMillis();
	
	System.out.println("LinkedHasSet süresi: " + (endingTime2 - startingTime2)); // 1 ms
	}

}
