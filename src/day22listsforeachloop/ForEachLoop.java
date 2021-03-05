package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		
		/*
		 1) For-Loop'un geliþtirilmiþ halidir.
		 2) yazmasý kolay
		 3) Okumasý kolay
		 4) Hata ihtimali daha az
		 */

		// ýnteger list olusturun, elemanlarý birer birer ayný satýra aralarýna bosluk býrakarak yazdýrýn.
		
		List<Integer> list = new ArrayList<>();
		
	list.add(3);
	list.add(2);
	list.add(1);
	list.add(5);
	list.add(4);
	
	for ( int i = 0; i<list.size(); i++) {
		System.out.print(list.get(i) + " ");
		}
	
	System.out.println();
	
	
	// for each loop ile
	
	for (Integer w: list) {
	
	System.out.print(w + " ");
	
	}
	
	System.out.println();
	
   // 	for-each loop kullanarak ls listindeki tüm elemanlarýn toplamýný bulunuz
	
	
	int sum = 0;
	
	for (Integer w: list) {
		sum = sum+w;
	}
	System.out.println(sum);
	
	//  ilk iki eleman haric diger elemanlarý ekrana yazýnýz
	
	for ( Integer w: list.subList(2, list.size())){
		System.out.print(w + " ");
	}
	
	System.out.println();
	// index'i 1 olan elemandan index'i 3 olan  elemana kadar tum elemanlarý ekrana yazýnýz
	
	
	for( Integer w: list.subList(1, 4)) {
		System.out.print(w + " ");
	}
	
	System.out.println();
	
	// ls listindeki elemanlardan tek sayý olanlarý yazdýrmayýn
	
		// 1.yol
	
	for (Integer w: list ) {
		if (w%2== 0) {
			System.out.print( w + " ");
		}
	}
	
	System.out.println();
	
	// 2.yol
	
	for (Integer w: list) {
		
		if ( w%2 != 0) {
			continue;    // tek sayýyý atlayacak
		}else {
			System.out.print(w + " ");
		}
	}
	
	System.out.println();
	
	// ls listindeki 5'e kadar elemanlarý 5 görünceye kadar yazdýr.( 5 yazýlmasýn)
	
	
	for ( Integer w: list) {
		if (w==5) {
			break;
		}System.out.print(w + " ");
	}
	
	
	
	
	
	//Not: continue; belli sartlara gore bazi elemanlari islem disi tutmak icin kullanilir.
	//     break; ise belli sartlara gore loop'u kirmak icin kullanilir.

	System.out.println();
	
	// for loop ile elemanlarýn toplamýný yaz
	
	int top = 0 ;
	for( int i = 0 ; i<list.size(); i++) {
		
		top = top + list.get(i);
	}
	System.out.println(top);
	
	
	
	
	}
}
