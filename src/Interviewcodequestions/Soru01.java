package Interviewcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Soru01 {

	public static void main(String[] args) {

		/*
		 * Sure: 10 dakika
		 * 
		 * Verilen bir String'de hangi kelimenin kac kere kullanildigini gosteren bir program yaziniz 
		 * Ornegin; "This is a string. This program? is !counting words in a string." 
		 * String'inde output asagidaki gibi olmalidir. 
		 * {counting=1, a=2, in=1, words=1, This=2, is=2, string.=2, program=1}
		 */

		
		
		String str ="This is a string. This program? is !counting words in a string.";
		
		String kelime[] = str.split(" ");
		
		System.out.println(Arrays.toString(kelime));
		
		List<String> kelimeler = new ArrayList<>();
		
		for(String w: kelime) {
			w= w.replaceAll("\\W", "");
			kelimeler.add(w);
		}
		
		System.out.println(kelimeler);
		
		HashMap<String,Integer> kelimeSayilari = new HashMap<>();
		
		for (int i = 0; i<kelimeler.size();i++) {
			
			if(kelimeSayilari.containsKey(kelimeler.get(i))) {
				int sayi = kelimeSayilari.get(kelimeler.get(i));
				kelimeSayilari.put(kelimeler.get(i), sayi+1);
				}else {
					kelimeSayilari.put(kelimeler.get(i), 1);	
				}
		}
		
		System.out.println(kelimeSayilari);
		
		
		
		
		
		
		
		
	}

}
