package day10stringmethods;

public class Method1 {

	public static void main(String[] args) {
		
		
		String s1 = "Study hard stay humble";
		
		// charAt(index) methodu ==> index 0'dan ba�lar. index'deki karakteri bulur.
		
		// s1.charAt(index)

		s1.charAt(0);
		System.out.println(s1.charAt(0)); // S
		
		// 6. harfi ekrana yazd�r.
		// 6. karakter index = 5 'tir
		
		s1.charAt(5);
		System.out.println(s1.charAt(5)); // bo�luk oluyor o da bir karakterdir.
		
		// 7. harfi ekrana yazd�r.
        // 7.karakter index = 6
		
		s1.charAt(6);
		
		System.out.println(s1.charAt(6)); // h
		
		
		// Son karakteri ekrana yazd�r�n.
		// son karakterin index = 21
		
		s1.charAt(21);
		System.out.println(s1.charAt(21)); // e 
		
		/* Burda sonuna kadar sayd�k k�sayd� ama bir kitap olsa saymak m�mk�n de�il 
		 * Son index her zaman karakter say�s�ndan 1 eksik oluyor. 
	     * Dolay�s�yla biz toplam karakter say�s�n� veren bir methodla i�imiz kolayla�t�rabiliriz.
	     * son index = karakter say�s� - 1 
	     * karakter say�s� length() methoduyla bulunuyor.
	     */
		
		s1.length(); // String'deki top karakteri veriyor
		System.out.println(s1.length()); // 22 , o halde son index 22-1 = 21 ==>son index i�in s1.length() -1 seklinde yazabilirim.
		
		// son index
		System.out.println((s1.length() -1)); // 21
		
		// son index'deki karakteri bul
		s1.charAt((s1.length() -1));
		System.out.println(s1.charAt((s1.length() -1))); // e
		
		 
		
		String s2 = "isleyen demir pas tutmaz.";
		
		// karakter say�s�n� bulal�m
		
		s2.length();
		System.out.println(s2.length()); // 25
		
		// son index = karakter -1
		
		System.out.println((s2.length() -1)); // 24
		
		// son index'deki karakteri bulal�m.
		
		s2.charAt((s2.length() -1));
		System.out.println(s2.charAt((s2.length() -1))); // .
		
		// 15.karakteri yazd�r.
		
		// index = 14 olmal�
		
		s2.charAt(14);
		System.out.println(s2.charAt(14));// p
		
		
	  // ortadaki karakteri bulal�m .
	  // son index'i  2 'ye b�lersek ortay� buluruz.
		
	  //  ((s2.length() -1) / 2 ); // orta karakterin index numaras�n� verir
	    System.out.println((s2.length()-1)/2); // 12
	    
		s2.charAt((s2.length()-1)/2); // orta karakteri verir
		System.out.println(s2.charAt((s2.length()-1)/2)); // r
		
		
	// toplam karakter say�s� �ift ise orta karakter yoktur.�u �ekilde yazd�rabiliriz
		
	String s3 = "Isleyen demir pas tutmaz";
	
   System.out.println(s3.length()); // 24 == > orta karakter yok
   
   if ((s3.length() %2 !=0 )) {
	   System.out.println(s3.charAt((s3.length()-1)/2));
   } else {
	   System.out.println("Orta karakter yoktur");
		
		
	// charAt() methodunda olmayan bir index kulland���n�zda , prog �al�st�rd�ktan sonra ekranda (konsolda) k�rm�z� hata mesaj� verir.
	// buna "run time error" cali�ma zaman� hatas� yani ancak cal��t�ktan sonra anl�yor
	// kod yazarken alt� �izili hata verince " compile time error " denir
	   System.out.println(s1.charAt(38)); // error verir konsolda out of range yazar c�nk� o kadar karakter yok
		
		
	}
	}
}
