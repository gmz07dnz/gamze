package day10stringmethods;

public class Method1 {

	public static void main(String[] args) {
		
		
		String s1 = "Study hard stay humble";
		
		// charAt(index) methodu ==> index 0'dan baþlar. index'deki karakteri bulur.
		
		// s1.charAt(index)

		s1.charAt(0);
		System.out.println(s1.charAt(0)); // S
		
		// 6. harfi ekrana yazdýr.
		// 6. karakter index = 5 'tir
		
		s1.charAt(5);
		System.out.println(s1.charAt(5)); // boþluk oluyor o da bir karakterdir.
		
		// 7. harfi ekrana yazdýr.
        // 7.karakter index = 6
		
		s1.charAt(6);
		
		System.out.println(s1.charAt(6)); // h
		
		
		// Son karakteri ekrana yazdýrýn.
		// son karakterin index = 21
		
		s1.charAt(21);
		System.out.println(s1.charAt(21)); // e 
		
		/* Burda sonuna kadar saydýk kýsaydý ama bir kitap olsa saymak mümkün deðil 
		 * Son index her zaman karakter sayýsýndan 1 eksik oluyor. 
	     * Dolayýsýyla biz toplam karakter sayýsýný veren bir methodla iþimiz kolaylaþtýrabiliriz.
	     * son index = karakter sayýsý - 1 
	     * karakter sayýsý length() methoduyla bulunuyor.
	     */
		
		s1.length(); // String'deki top karakteri veriyor
		System.out.println(s1.length()); // 22 , o halde son index 22-1 = 21 ==>son index için s1.length() -1 seklinde yazabilirim.
		
		// son index
		System.out.println((s1.length() -1)); // 21
		
		// son index'deki karakteri bul
		s1.charAt((s1.length() -1));
		System.out.println(s1.charAt((s1.length() -1))); // e
		
		 
		
		String s2 = "isleyen demir pas tutmaz.";
		
		// karakter sayýsýný bulalým
		
		s2.length();
		System.out.println(s2.length()); // 25
		
		// son index = karakter -1
		
		System.out.println((s2.length() -1)); // 24
		
		// son index'deki karakteri bulalým.
		
		s2.charAt((s2.length() -1));
		System.out.println(s2.charAt((s2.length() -1))); // .
		
		// 15.karakteri yazdýr.
		
		// index = 14 olmalý
		
		s2.charAt(14);
		System.out.println(s2.charAt(14));// p
		
		
	  // ortadaki karakteri bulalým .
	  // son index'i  2 'ye bölersek ortayý buluruz.
		
	  //  ((s2.length() -1) / 2 ); // orta karakterin index numarasýný verir
	    System.out.println((s2.length()-1)/2); // 12
	    
		s2.charAt((s2.length()-1)/2); // orta karakteri verir
		System.out.println(s2.charAt((s2.length()-1)/2)); // r
		
		
	// toplam karakter sayýsý çift ise orta karakter yoktur.Þu þekilde yazdýrabiliriz
		
	String s3 = "Isleyen demir pas tutmaz";
	
   System.out.println(s3.length()); // 24 == > orta karakter yok
   
   if ((s3.length() %2 !=0 )) {
	   System.out.println(s3.charAt((s3.length()-1)/2));
   } else {
	   System.out.println("Orta karakter yoktur");
		
		
	// charAt() methodunda olmayan bir index kullandýðýnýzda , prog çalýstýrdýktan sonra ekranda (konsolda) kýrmýzý hata mesajý verir.
	// buna "run time error" caliþma zamaný hatasý yani ancak calýþtýktan sonra anlýyor
	// kod yazarken altý çizili hata verince " compile time error " denir
	   System.out.println(s1.charAt(38)); // error verir konsolda out of range yazar cünkü o kadar karakter yok
		
		
	}
	}
}
