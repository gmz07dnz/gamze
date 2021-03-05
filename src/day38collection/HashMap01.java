package day38collection;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 * Key -Value yap�s�n� kullan�rlar.
	 * Key'ler unique'dir.
	 * Value'ler ayn� olabilir.
	 * 3 farkl� map vard�r.
	 * 1- HashMap ==> En cok kullan�l�r.
	 *                En h�zl�d�r.
	 *                H�zl� olabilmek i�in rastele s�ralama yapar.
	 *                key'lerde bir tane null olabilir, value'larda birden fazla null olabilir
	 *                h�zl� olabilmek i�in synchronize olmazlar ve thread -safe  degildirler.
	 *                
	 * 2-HashTable
	 * 3-TreeMap               
	 */

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(101, "Ali Han");
	    hm1.put(102, "Veli Han");
	    hm1.put(103, "Ayse Tan");
	    System.out.println(hm1); // {101=Ali Han, 102=Veli Han, 103=Ayse Tan} ==> az oldugu i�in s�ral� denk geldi.Normalde kafas�na gre davran�r
	    
	    // ayn� key kullan�ld�g�nda ustune yazar.
	    hm1.put(101, "Kemal y�ld�z");
	    System.out.println(hm1);// {101=Kemal y�ld�z, 102=Veli Han, 103=Ayse Tan}==> Ali han uzerine yazd�
	    
	    // Ayn� value Farkl� key ile yollayal�m
	    
	    hm1.put(104, "Veli Han");
	    System.out.println(hm1); // {101=Kemal y�ld�z, 102=Veli Han, 103=Ayse Tan, 104=Veli Han}
	    
	    hm1.put(null, "Ayse Ay");
	    System.out.println(hm1); // {null=Ayse Ay, 101=Kemal y�ld�z, 102=Veli Han, 103=Ayse Tan, 104=Veli Han}
	    
	    hm1.put(105, null);
	    hm1.put(106, null);
	    hm1.put(107, null);
	    System.out.println(hm1);// {null=Ayse Ay, 101=Kemal y�ld�z, 102=Veli Han, 103=Ayse Tan, 104=Veli Han, 105=null, 106=null, 107=null}

	    System.out.println(hm1.get(102)); // key ver degeri vereyim ==> "Veli Han"
	    
	    System.out.println(hm1.values()); // [Ayse Ay, Kemal y�ld�z, Veli Han, Ayse Tan, Veli Han, null, null, null]
	    
	    System.out.println(hm1.keySet()); // [null, 101, 102, 103, 104, 105, 106, 107]
	    
	   System.out.println( hm1.getOrDefault(101, "uzgunum bu key i�in bir deger yok"));// Kemal Y�ld�z
	   System.out.println(hm1.getOrDefault(111, "uzgunum bu key i�in bir deger yok")); // uzgunum bu key i�in bir deger yok
	   
	   hm1.putIfAbsent(108, "Merve Tahsin"); // deger yoksa koy
	   System.out.println(hm1);// {null=Ayse Ay, 101=Kemal y�ld�z, 102=Veli Han, 103=Ayse Tan, 104=Veli Han, 105=null, 106=null, 107=null, 108=Merve Tahsin}
	   
	   hm1.putIfAbsent(103, "y�ld�z Y�l");
	   System.out.println(hm1);// eklemez cunku 103'de bir deger var zaten
	   
	   hm1.putIfAbsent(105, "y�ld�z Y�l"); // ekler cunku 105 --> null
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal y�ld�z, 102=Veli Han, 103=Ayse Tan, 104=Veli Han, 105=y�ld�z Y�l, 106=null, 107=null, 108=Merve Tahsin}
	    
	   // hm1.remove(key); ==> key ver sileyim
	   
	   hm1.remove(106);
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal y�ld�z, 102=Veli Han, 103=Ayse Tan, 104=Veli Han, 105=y�ld�z Y�l, 107=null, 108=Merve Tahsin}
	   
	   
	 //  hm1.remove(key, value);  == > iki sart� da kontrol eder . Dogruysa siler . Daha garantidir.silinmesi i�in key -value ortusmeli
	   
	   hm1.remove(102, "Veli Han");
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal y�ld�z, 104=Veli Han, 103=Ayse Tan, 105=y�ld�z Y�l, 107=null, 108=Merve Tahsin}

	   hm1.replace(104, "Asiye Can"); //val�e update etmek i�in kullan�l�r
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal y�ld�z, 103=Ayse Tan, 104=Asiye Can, 105=y�ld�z Y�l, 107=null, 108=Merve Tahsin}
	   
	   hm1.replace(111, "AAABBB"); // olmayan bir key ile kullan�rsak java hi�birsey yapmaz
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal y�ld�z, 103=Ayse Tan, 104=Asiye Can, 105=y�ld�z Y�l, 107=null, 108=Merve Tahsin}
	   
	   hm1.replace(104, "Asiye Can", "Ramazan Meydan");
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal y�ld�z, 103=Ayse Tan, 104=Ramazan Meydan, 105=y�ld�z Y�l, 107=null, 108=Merve Tahsin}
	   
	//   hm1.putAll(m); ==> bir map'e baska bir map ekler. Her iki map 'in data type ortusmeli
	   
	   HashMap<Integer,String> hm2 = new HashMap<>();
	   hm2.put(201, "Cat");
	   hm2.put(202, "Dog");
	   
	   hm1.putAll(hm2);//
	   System.out.println(hm1); //{null=Ayse Ay, 101=Kemal y�ld�z, 103=Ayse Tan, 104=Ramazan Meydan, 105=y�ld�z Y�l, 201=Cat, 202=Dog, 107=null, 108=Merve Tahsin}
	   

	
	
	
	}

}
