package javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Day08ListIterator {

	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<>();
		list2.add("ALI");
		list2.add("veli");
		list2.add("Ayse");
		list2.add("fatma");
		System.out.println(list2); // [ALI, veli, Ayse, fatma]
		
		
		// Listenin tamam�n� for each - loop ile  b�y�k harf yap�n.
		
		for( String w: list2) {
		  w.toUpperCase();
			
		}
        System.out.println(list2); // kal�c� olam�yor .Loop i�inde atama yapabilirsek kal�c� olabilir.Mesela set() methodu ile atama yapabiliriz.
                                   // ama index istiyor.

        
        // for loop ile listenin tamam�n� b�y�k harf yap�n.
        
       for (int i = 0; i<list2.size(); i++) {
       	list2.set(i, list2.get(i).toUpperCase());
         }
        System.out.println("For Loop Sonras�:" + list2);
        
        
        // iterator ile listenin tamam�n� k���k harf yap�n.
        
        ListIterator<String> it1 =list2.listIterator();
        
        while (it1.hasNext()){
        	   String gecici =it1.next();  // gecici ==> tek i�i iterator'un getirdi�ini almak
        	   it1.set(gecici.toLowerCase());          // String ile ilgili herseyi yapabiliriz
           }
        
        System.out.println("Iterator sonras�" + list2);
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
