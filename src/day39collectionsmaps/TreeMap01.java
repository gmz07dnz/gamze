package day39collectionsmaps;

import java.util.TreeMap;

public class TreeMap01 {

	/*
	 1)TreeMap elemanlar� natural order'a g�re s�ralar.
	 2)Map oldugu i�in key-value yap�s� vard�r
	 3)Map'lerin en yavas�d�r.
	 4)S�ralama yapt�g� i�in key'lerde s�ralama yapamaz.Value'larda null istenildi�ikadar kullanabilirler.
	 5) Syncronized ve thread-safe degillerdir
	 
	 
	 * 
	 */
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		
		tm1.put(101, "Ali");
		tm1.put(105, "Bahad�r");
		tm1.put(104, "Ceylan");
		tm1.put(102, "Ayhan");
		tm1.put(103, "Seyhan");
		
		System.out.println(tm1); // {101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahad�r} --> key'lere g�re artan s�ralama yapar
		
		tm1.put(106, null);
		tm1.put(107, null);
		tm1.put(108, null);
		System.out.println(tm1); //{101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahad�r, 106=null, 107=null, 108=null}
		
	//	tm1.put(null, "Ceylan"); // Run TE ==>NullPointerException
		
		System.out.println(tm1.ceilingEntry(95)); // 101 == Ali ==>95 olmad�g� i�in kendsinden b�y�k en k���k key verdi
		System.out.println(tm1.ceilingEntry(109)); // 109'da buyuk buyugu de yok null return eder
		
		
		System.out.println(tm1.descendingKeySet()); // Key'leri buyukten kucuge s�ralar
		System.out.println(tm1.keySet()); // zaten natural order yapt�g� i�in k�c�kten buyuge s�ralar.
		
	}

}
