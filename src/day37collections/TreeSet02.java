package day37collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		
		/*
		 * Soru: Elemanlar� alfabetik s�rada d�zen ve tekrars�z bir collection elde etmek i�in ne kullan�rs�n�z?
		 * Cevap: TreeSet
		 * 
		 * SORU: Ama TreeSet cok yavast�r. Nas�l bir cozum bulabilirsin?
		 * Cevap: HashSet olustururum,elemanlar� HashSet'e eklerim.Sonra HashSet'i TreeSet'e ceviririm
		 * b�ylelikle tekrars�z ve alfabetik s�rada bir collection'a sahip olmus olurum. 
		 */
		
		long startingTime1 = System.currentTimeMillis();
		TreeSet<String> ts2 = new TreeSet<>();
		
		ts2.add("Ali");
		ts2.add("Veli");
		ts2.add("Canan");
		ts2.add("Beyhan");
		ts2.add("Ayhan");
		ts2.add("Seyhan");
		ts2.add("Ceyhan");
		ts2.add("Ramazan");
		ts2.add("Daghan");
		System.out.println(ts2); // [Ali, Ayhan, Beyhan, Canan, Ceyhan, Daghan, Ramazan, Seyhan, Veli]
		
		long endingTime1= System.currentTimeMillis();
		System.out.println("TreeSet S�resi: "+ (endingTime1 - startingTime1)); // 4 
		
		

		long startingTime = System.currentTimeMillis();
	
	HashSet<String> hs1 = new HashSet<>();
	hs1.add("Ali");
	hs1.add("Veli");
	hs1.add("Canan");
	hs1.add("Beyhan");
	hs1.add("Ayhan");
	hs1.add("Seyhan");
	hs1.add("Ceyhan");
	hs1.add("Ramazan");
	hs1.add("Daghan");
	System.out.println(hs1); // [Canan, Ayhan, Ceyhan, Veli, Seyhan, Ramazan, Beyhan, Daghan, Ali]
	
	TreeSet<String>  ts1 = new TreeSet<>(hs1);  // TreeSet'in bir constructor'� parametreli ve hashSet'i parametre olarak kabul ediyor.HashSet'i 
	                                            // parametre olarak verdi�inde HashSet'ten TreeSet uretmi� oluyor.Dolay�syla s�ral� yazm�s olacak
	
	System.out.println(ts1); // [Ali, Ayhan, Beyhan, Canan, Ceyhan, Daghan, Ramazan, Seyhan, Veli]
	long endingTime = System.currentTimeMillis();
	System.out.println("Hash + Tree S�resi: "+ (endingTime - startingTime)); // 1
	
	
	
	
	
	
	
	}

}
