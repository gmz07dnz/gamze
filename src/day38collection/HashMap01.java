package day38collection;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 * Key -Value yapýsýný kullanýrlar.
	 * Key'ler unique'dir.
	 * Value'ler ayný olabilir.
	 * 3 farklý map vardýr.
	 * 1- HashMap ==> En cok kullanýlýr.
	 *                En hýzlýdýr.
	 *                Hýzlý olabilmek için rastele sýralama yapar.
	 *                key'lerde bir tane null olabilir, value'larda birden fazla null olabilir
	 *                hýzlý olabilmek için synchronize olmazlar ve thread -safe  degildirler.
	 *                
	 * 2-HashTable
	 * 3-TreeMap               
	 */

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(101, "Ali Han");
	    hm1.put(102, "Veli Han");
	    hm1.put(103, "Ayse Tan");
	    System.out.println(hm1); // {101=Ali Han, 102=Veli Han, 103=Ayse Tan} ==> az oldugu için sýralý denk geldi.Normalde kafasýna gre davranýr
	    
	    // ayný key kullanýldýgýnda ustune yazar.
	    hm1.put(101, "Kemal yýldýz");
	    System.out.println(hm1);// {101=Kemal yýldýz, 102=Veli Han, 103=Ayse Tan}==> Ali han uzerine yazdý
	    
	    // Ayný value Farklý key ile yollayalým
	    
	    hm1.put(104, "Veli Han");
	    System.out.println(hm1); // {101=Kemal yýldýz, 102=Veli Han, 103=Ayse Tan, 104=Veli Han}
	    
	    hm1.put(null, "Ayse Ay");
	    System.out.println(hm1); // {null=Ayse Ay, 101=Kemal yýldýz, 102=Veli Han, 103=Ayse Tan, 104=Veli Han}
	    
	    hm1.put(105, null);
	    hm1.put(106, null);
	    hm1.put(107, null);
	    System.out.println(hm1);// {null=Ayse Ay, 101=Kemal yýldýz, 102=Veli Han, 103=Ayse Tan, 104=Veli Han, 105=null, 106=null, 107=null}

	    System.out.println(hm1.get(102)); // key ver degeri vereyim ==> "Veli Han"
	    
	    System.out.println(hm1.values()); // [Ayse Ay, Kemal yýldýz, Veli Han, Ayse Tan, Veli Han, null, null, null]
	    
	    System.out.println(hm1.keySet()); // [null, 101, 102, 103, 104, 105, 106, 107]
	    
	   System.out.println( hm1.getOrDefault(101, "uzgunum bu key için bir deger yok"));// Kemal Yýldýz
	   System.out.println(hm1.getOrDefault(111, "uzgunum bu key için bir deger yok")); // uzgunum bu key için bir deger yok
	   
	   hm1.putIfAbsent(108, "Merve Tahsin"); // deger yoksa koy
	   System.out.println(hm1);// {null=Ayse Ay, 101=Kemal yýldýz, 102=Veli Han, 103=Ayse Tan, 104=Veli Han, 105=null, 106=null, 107=null, 108=Merve Tahsin}
	   
	   hm1.putIfAbsent(103, "yýldýz Yýl");
	   System.out.println(hm1);// eklemez cunku 103'de bir deger var zaten
	   
	   hm1.putIfAbsent(105, "yýldýz Yýl"); // ekler cunku 105 --> null
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal yýldýz, 102=Veli Han, 103=Ayse Tan, 104=Veli Han, 105=yýldýz Yýl, 106=null, 107=null, 108=Merve Tahsin}
	    
	   // hm1.remove(key); ==> key ver sileyim
	   
	   hm1.remove(106);
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal yýldýz, 102=Veli Han, 103=Ayse Tan, 104=Veli Han, 105=yýldýz Yýl, 107=null, 108=Merve Tahsin}
	   
	   
	 //  hm1.remove(key, value);  == > iki sartý da kontrol eder . Dogruysa siler . Daha garantidir.silinmesi için key -value ortusmeli
	   
	   hm1.remove(102, "Veli Han");
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal yýldýz, 104=Veli Han, 103=Ayse Tan, 105=yýldýz Yýl, 107=null, 108=Merve Tahsin}

	   hm1.replace(104, "Asiye Can"); //valýe update etmek için kullanýlýr
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal yýldýz, 103=Ayse Tan, 104=Asiye Can, 105=yýldýz Yýl, 107=null, 108=Merve Tahsin}
	   
	   hm1.replace(111, "AAABBB"); // olmayan bir key ile kullanýrsak java hiçbirsey yapmaz
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal yýldýz, 103=Ayse Tan, 104=Asiye Can, 105=yýldýz Yýl, 107=null, 108=Merve Tahsin}
	   
	   hm1.replace(104, "Asiye Can", "Ramazan Meydan");
	   System.out.println(hm1); // {null=Ayse Ay, 101=Kemal yýldýz, 103=Ayse Tan, 104=Ramazan Meydan, 105=yýldýz Yýl, 107=null, 108=Merve Tahsin}
	   
	//   hm1.putAll(m); ==> bir map'e baska bir map ekler. Her iki map 'in data type ortusmeli
	   
	   HashMap<Integer,String> hm2 = new HashMap<>();
	   hm2.put(201, "Cat");
	   hm2.put(202, "Dog");
	   
	   hm1.putAll(hm2);//
	   System.out.println(hm1); //{null=Ayse Ay, 101=Kemal yýldýz, 103=Ayse Tan, 104=Ramazan Meydan, 105=yýldýz Yýl, 201=Cat, 202=Dog, 107=null, 108=Merve Tahsin}
	   

	
	
	
	}

}
