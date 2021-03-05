package day39collectionsmaps;

import java.util.TreeMap;

public class TreeMap01 {

	/*
	 1)TreeMap elemanlarý natural order'a göre sýralar.
	 2)Map oldugu için key-value yapýsý vardýr
	 3)Map'lerin en yavasýdýr.
	 4)Sýralama yaptýgý için key'lerde sýralama yapamaz.Value'larda null istenildiðikadar kullanabilirler.
	 5) Syncronized ve thread-safe degillerdir
	 
	 
	 * 
	 */
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		
		tm1.put(101, "Ali");
		tm1.put(105, "Bahadýr");
		tm1.put(104, "Ceylan");
		tm1.put(102, "Ayhan");
		tm1.put(103, "Seyhan");
		
		System.out.println(tm1); // {101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahadýr} --> key'lere göre artan sýralama yapar
		
		tm1.put(106, null);
		tm1.put(107, null);
		tm1.put(108, null);
		System.out.println(tm1); //{101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahadýr, 106=null, 107=null, 108=null}
		
	//	tm1.put(null, "Ceylan"); // Run TE ==>NullPointerException
		
		System.out.println(tm1.ceilingEntry(95)); // 101 == Ali ==>95 olmadýgý için kendsinden büyük en küçük key verdi
		System.out.println(tm1.ceilingEntry(109)); // 109'da buyuk buyugu de yok null return eder
		
		
		System.out.println(tm1.descendingKeySet()); // Key'leri buyukten kucuge sýralar
		System.out.println(tm1.keySet()); // zaten natural order yaptýgý için kücükten buyuge sýralar.
		
	}

}
