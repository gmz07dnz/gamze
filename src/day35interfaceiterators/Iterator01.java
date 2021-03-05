package day35interfaceiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list ); //  [B, C, D, E]
		
		// List elemanlarýný for loop ve for each ile yazdýrýn
		
		for (int i = 0; i<list.size() ;i++) {
			System.out.print(list.get(i) + " ");   // B C D E
		}
		
		System.out.println();
		
		for (String w: list) {
			
			System.out.print(w + " ");  // B C D E
		}
		
		
		System.out.println();
		
		// list 1'i for loop kullanarak sonuna "!" iþareti ekleyerek list'i yazdýrýn
		
		for (int i = 0; i<list.size(); i++) {
			list.set(i, list.get(i)+"!");
		}
		System.out.println(list);
		
		
		// for -each loop'da index yok o yuzden yukardaki iþlemi bu yöntemle yapamýyoruz.set() methodu için index gerekli.
		
		/*
		 * For Loop kullanarak list'leri update etmek istemiyorum, for each listleri update edemiyor.Bu durumda For Loop kullanmadan listleri 
		 * update edebilmek için "iterator"larý kullanýrýz.
		 */
		
		
		List<String> list2 = new ArrayList<>();
		list2.add("U");
		list2.add("V");
		list2.add("Y");
		list2.add("Z");
		System.out.println(list2); // [U, V, Y, Z]
		
		
		Iterator<String> it2 = list2.iterator();   // list2 den iterator urettim.
		
		
//		while (it2.hasNext()) {
//			
//			String el = it2.next();
//			System.out.print(el + " "); // U V Y Z 
//		}
		
		System.out.println();
		
          while (it2.hasNext()) {
			
			it2.next();   // loop'un içine ceker
			it2.remove();  // imha eder.
		}
		 System.out.println(list2); //  []
		
		 List<String> list3 = new ArrayList<>();
			list3.add("K");
			list3.add("L");
			list3.add("M");
			System.out.println(list3);  // [K, L, M]
		
		ListIterator<String> it3 = list3.listIterator();
		
		while(it3.hasNext()) {
			String el =it3.next();    
			
			it3.set(el+"!");         // el'yi updete ediyoruz
			it3.add(el);             // list'e eleman ekler
			
		}
		System.out.println(list3);  // [K!, K, L!, L, M!, M]
		
		
		
		 List<String> list4 = new ArrayList<>();
			list4.add("e");
			list4.add("f");
			list4.add("g");
			System.out.println(list4);  // [e, f, g]
		
		ListIterator<String> it4 = list4.listIterator();
		
//		while (it4.hasPrevious()) {  // senden önce eleman var mý deyýnce önce olmadýgý için loop kýrýlýr body calýþmaz
//			
//			String el = it4.previous();
//			System.out.println(el);  // [] == > hiç bir sey yazmaz
//			
//			}
		
	
		while (it4.hasNext()) {
			it4.next();   // pointer'ý sona atýyoruz
		}
		
		while (it4.hasPrevious()) {
			
			String el = it4.previous();
			System.out.print(el); // g f e 
		}
		
		 /*
		  * Sadece son elemanýn basýna "*" kounuz ve list elemanlarýný sondan basa yazdýrýnýz
		 */
			System.out.println();
			
			
			int counter = 0;
			
			while (it4.hasNext()) {
				String el =it4.next();   // pointer'ý sona atýyoruz
				
				if (counter == 2) {
					it4.set("*" + el);
				}
				counter++;
				
			}
			
			while (it4.hasPrevious()) {
				
				String el = it4.previous();
				System.out.print(el +" "); // *g f e 
			}
	
         System.out.println();
         System.out.println(list4); // [e,f,*g]
	
	/*
	 * Iterator() ile ListIterator() farklarý nelerdir?
	 1) "Iterator()" sadece hasNext(),next() ve remove() methodlarýný içerir.
	  "ListIterator" ise hasNext(),next(),remove().add(),set(),hasPrevious(),previous() methodlarý vardýr.
	  
	 2) "ListIterator" adýndan da anlaþýlacagý uzere sadece list'ler için kullanýlýr.
	 "Iterator()" ise list,map,set gibi diðer colection'lar için de kullanýlýr.
	 
	 3) "Iterator()" kullanarak sadece bastan sona doðru seyahat edebilirsiniz. 
	 Ama "ListIterator" kullanýrsanýz cift yonlu seyahat edebilirsiniz.
	  
	 */
	
	
	
	
	List<String> list5 = new ArrayList<>();
 
	list5.add("g");
	list5.add("a");
	list5.add("m");
	list5.add("z");
	list5.add("e");
	System.out.println(list5); //  [g, a, m, z, e]
	
	
	Iterator<String> it5 = list5.iterator();
//	
//	while(it5.hasNext()) {
//		String el = it5.next();
//		
//		System.out.print(el+ " ");
//		
//	}
//	System.out.println();
//	System.out.println(list5); // [g, a, m, z, e]
	
	while(it5.hasNext()) {
		 it5.next();
		it5.remove();
		
	}
	
	System.out.println(list5); // []
	
	
	
	
	List<String> list6 = new ArrayList<>();
	 
	list6.add("d");
	list6.add("e");
	list6.add("n");
	list6.add("i");
	list6.add("z");
	System.out.println(list6); //  [d, e, n, i, z]
	
	ListIterator<String> it6 = list6.listIterator();
	
	int count =0;
	while (it6.hasNext()) {
		String el = it6.next();
		it6.set(el + "*");
		count++;
		if (count==5) {
			it6.add("* mavi");
		}
	}
	System.out.println(list6); // [d*, e*, n*, i*, z*, * mavi]
	
	// tersten yazdýralým
	
	while (it6.hasNext()) {
		it6.next();
	}   // pointer'ý sona getirdik 
	
	
	int counter1= 0;
	
	while (it6.hasPrevious()) {
		String el = it6.previous();
		System.out.print(el + " " ); // * mavi z* i* n* e* d*
		counter1++;
		if (counter1 == 2) {
			it6.set("g");            // * mavi g i* n* e* d*
		}
		
		if (counter1==4) {
			it6.add("!!");          //  * mavi g i* n* !! e* d*
		}
		
		
	}
	
	System.out.println();
	
	System.out.println(list6); // [d*, e*, !!, n*, i*, g, * mavi]
	
	
	
	List<Integer> list7 = new ArrayList<>();
	list7.add(1);
	list7.add(2);
	list7.add(3);
	list7.add(4);
	
	System.out.println(list7); // [1, 2, 3, 4]
	
	
	// ýterator olusturup tüm elemanlarý silelim
	
	Iterator<Integer> it7 = list7.iterator();
	
	while (it7.hasNext()) {
		Integer el = it7.next();
		
	  it7.remove();
	}
	
	System.out.println(list7); // []
	
	
	// list'e "*" ekleyelim
	
	
	List<String> list8 = new ArrayList<>();
	list8.add("elif");
	list8.add("jale");
	list8.add("burcu");
	list8.add("gamze");
	
	
	ListIterator<String> lsI2 = list8.listIterator();
	
//	while (lsI2.hasNext()) {
//		String el = lsI2.next();
//		el = el + "*"+ " ";
//		System.out.print(el); //  elif* jale* burcu* gamze* 
//	}
//	
//	System.out.println();
//	System.out.println(list8); // [elif, jale, burcu, gamze] // set methodu kalýcý degiþiklik yapar. Kullanmadýgýmýz için ayný kaldý
//	                           // degiþiklik gecici oldu.
	
	
//	while (lsI2.hasNext()) {
//		String el = lsI2.next();
//		lsI2.set(el+"*"+" ");
//		
//	}
//	
//	System.out.println(list8);// [elif* , jale* , burcu* , gamze* ] ==> set() methodu kullanarak list'i update etmiþ oldum
//	
	

	
	}
	
	
	
}
