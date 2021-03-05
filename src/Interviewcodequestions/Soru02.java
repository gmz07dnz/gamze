package Interviewcodequestions;

import java.util.Arrays;
import java.util.HashMap;

public class Soru02 {

	public static void main(String[] args) {
		
		/*
		 Size verilen bir String'de tekrarli character'leri ve kac kere tekrar ettigini ekrana yazdiriniz
		 Ornegin; String "Ali baba" ==> a=2, b=2
		 */


		
		String str = "Ali baba";
		
		String harf[] = str.split("");
		System.out.println(Arrays.toString(harf));
		
		HashMap<String,Integer> hm1 = new HashMap<>();
		
		for (int i = 0; i<harf.length;i++) {
			if(hm1.containsKey(harf[i])) {
				int sayi = hm1.get(harf[i]);
				hm1.put(harf[i], sayi+=1);
			}else {
				hm1.put(harf[i], 1);
			}
		}
		
		System.out.println(hm1);
		
		
		
	}

}
