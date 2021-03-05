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
		
		
		// Listenin tamamýný for each - loop ile  büyük harf yapýn.
		
		for( String w: list2) {
		  w.toUpperCase();
			
		}
        System.out.println(list2); // kalýcý olamýyor .Loop içinde atama yapabilirsek kalýcý olabilir.Mesela set() methodu ile atama yapabiliriz.
                                   // ama index istiyor.

        
        // for loop ile listenin tamamýný büyük harf yapýn.
        
       for (int i = 0; i<list2.size(); i++) {
       	list2.set(i, list2.get(i).toUpperCase());
         }
        System.out.println("For Loop Sonrasý:" + list2);
        
        
        // iterator ile listenin tamamýný küçük harf yapýn.
        
        ListIterator<String> it1 =list2.listIterator();
        
        while (it1.hasNext()){
        	   String gecici =it1.next();  // gecici ==> tek iþi iterator'un getirdiðini almak
        	   it1.set(gecici.toLowerCase());          // String ile ilgili herseyi yapabiliriz
           }
        
        System.out.println("Iterator sonrasý" + list2);
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
