package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		
		/*
		 1) For-Loop'un geli�tirilmi� halidir.
		 2) yazmas� kolay
		 3) Okumas� kolay
		 4) Hata ihtimali daha az
		 */

		// �nteger list olusturun, elemanlar� birer birer ayn� sat�ra aralar�na bosluk b�rakarak yazd�r�n.
		
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
	
   // 	for-each loop kullanarak ls listindeki t�m elemanlar�n toplam�n� bulunuz
	
	
	int sum = 0;
	
	for (Integer w: list) {
		sum = sum+w;
	}
	System.out.println(sum);
	
	//  ilk iki eleman haric diger elemanlar� ekrana yaz�n�z
	
	for ( Integer w: list.subList(2, list.size())){
		System.out.print(w + " ");
	}
	
	System.out.println();
	// index'i 1 olan elemandan index'i 3 olan  elemana kadar tum elemanlar� ekrana yaz�n�z
	
	
	for( Integer w: list.subList(1, 4)) {
		System.out.print(w + " ");
	}
	
	System.out.println();
	
	// ls listindeki elemanlardan tek say� olanlar� yazd�rmay�n
	
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
			continue;    // tek say�y� atlayacak
		}else {
			System.out.print(w + " ");
		}
	}
	
	System.out.println();
	
	// ls listindeki 5'e kadar elemanlar� 5 g�r�nceye kadar yazd�r.( 5 yaz�lmas�n)
	
	
	for ( Integer w: list) {
		if (w==5) {
			break;
		}System.out.print(w + " ");
	}
	
	
	
	
	
	//Not: continue; belli sartlara gore bazi elemanlari islem disi tutmak icin kullanilir.
	//     break; ise belli sartlara gore loop'u kirmak icin kullanilir.

	System.out.println();
	
	// for loop ile elemanlar�n toplam�n� yaz
	
	int top = 0 ;
	for( int i = 0 ; i<list.size(); i++) {
		
		top = top + list.get(i);
	}
	System.out.println(top);
	
	
	
	
	}
}
