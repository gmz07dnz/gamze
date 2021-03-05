package day25stringbuilder;

public class Sb02 {

	public static void main(String[] args) {
		
		/*
		 * StringBuilder class kullanarak String uretmek ( bir k�sm� defterde)
		 */

		
		// 1.yol 
		
		StringBuilder sb1 = new StringBuilder(); // bo� bir string urettik.biz bir variable uretince java heap memeory'de yer ay�r�r.
			
	
		System.out.println(sb1.capacity()); // 16  ; bo� bir string olusturunca java 16 karakterlik yer ay�r�yor.
		System.out.println(sb1.length()); // 0  i�inin bos oldugunun ispat�. bu method karakter say�s�n� veriyor.
		
		sb1.append("java");
		System.out.println(sb1); // java == > atama yapmadan degi�tirdi methodla
		
		sb1.append(" g�zeldir");
		System.out.println(sb1); // java g�zeldir
		
		sb1.append(". Ama ").append("�al��mak gerekir.");
		System.out.println(sb1); // java g�zeldir. Ama �al��mak gerekir.
		
		System.out.println(sb1.capacity()); // 70 ==> 16'yi asinca +16 yapiyor. 32'yi asinca 2*32+2 ekliyor.
                                            //   ==> 32'yi astik b u yuzden 32 + 32 + 2 + 4(3. 16 dan sonraki 4) = 70
		
		
		// 2.yol
		
		StringBuilder sb2 = new StringBuilder(11); // kapasitesi net olan , bildgimiz bir string yapacaksak bu sekilde fazla yer kaplamamas� 
		                                           // i�in kapasiteyi s�n�rland�rabiliriz.
		System.out.println(sb2.capacity()); // 11
		System.out.println(sb2.length()); // 0
		
		
		sb2.append("AliAliAli");
		System.out.println(sb2.capacity());// 20
		
		
		
		// 3.yol 
		
		StringBuilder sb3 = new StringBuilder("Java");
		
		// eger String'den eminsek direk yazabiliriz. gerek yok bo� �retip sonra eklemeye, boyutunu s�yleyip eklemeye
		// �nce yer ay�rmya , eminsen yaz gitsin. Belli bir string uretmek i�in kullan�r�z.
		
		System.out.println(sb3.capacity()); // 4 + 16 = 20 ==> java diyor ki bo� yapsayd�n ben sana 16 'l�k yer verecektim ama 4 ekledin
		                                    // ben senin yerini koruyorum diyor yazd�g�m�z� onun uzerine ekliyor.
		
		System.out.println(sb3.length()); // 4 ==> karakterin say�s�
		
		StringBuilder sb4 = new StringBuilder("JavaJavaJavaJavaJava");
		 
		System.out.println(sb4.capacity()); // 16 + 16 + 4 = 36 
		
		// fazladan ayr�lan capacity'i azaltmak
		
		sb4.trimToSize(); // sb4 'un size'na kadar k�rp .Javan�n kafas�na gre kapasite artt�rmas�n� engelliyor
		
		// istenen bir krarkteri index'ine g�re bulmak
		
		sb4.charAt(4);
		System.out.println(sb4.charAt(4)); // j
		
		
		// Belli aral�klardaki characterleri almak
		
		sb4.substring(4, 11);
		System.out.println(sb4.substring(4, 11)); // JavaJav
		
		// 6 characterden sonraki t�m characterleri
		
		sb4.substring(5);
		
		System.out.println(sb4.substring(5)); // avaJavaJavaJava
		
		
		// belli bir index'deki karakteri silmek
		
		sb4.deleteCharAt(5);
		System.out.println(sb4);// JavaJvaJavaJavaJava
		
		
		// index 4 (dahil) index 6 (dahil) t�m characterleri siliniz
		
		sb4.delete(4,7);
		
		System.out.println(sb4); // JavaJavaJavaJava
		
		
		// istenen index'e istenen character veya character'leri eklemek
		
		sb4.insert(4, "X"); // karakter silmez , araya sokar
		
		System.out.println(sb4); // JavaXJavaJavaJava
		
		
		
		//  istenen index'deki 1 character' degi�tirmek
		
		sb4.setCharAt(4, ' '); // index'dekini siler yerine koyar. sadce char ile cal���r
		
		System.out.println(sb4); // Java JavaJavaJava
		
		
		// istenen index'deki character'in yerine birden fazla character eklemek
		
		sb4.replace(9, 13, " ");
		
		System.out.println(sb4);// Java Java    Java
		
		
		// bir tane string' string class'�ndan olusturun loop kullanarak tersten yazd�r�n
		
		// 1.yol
		
		String s = "Hastane";
		
		for (int i = s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
	
		// 2.yol
		
		StringBuilder sb5 = new StringBuilder("Hastane");
		
	sb5.reverse();
	
	System.out.println(sb5);
	
	
  // String ile StringBuilder kars�last�rmas�
	
	String s01 = "Java";
	
	StringBuilder sb01 = new StringBuilder("Java");
  //System.out.println(s01 == sb01);  // sikayet ediyor cunku farkl� objeler biri string class'�ndan di�eri Stringbuilder class'�nda CTE verir
  
//	System.out.println(s01.equals(sb01)); // false ==> deger ayn� ama adres farkl�
	System.out.println(s01.equals(sb01.toString())); // true 
	
	// toString() methodu StringBuilder'� String'e cevirir gecici bir degi�imdir
	
	

	}

}
