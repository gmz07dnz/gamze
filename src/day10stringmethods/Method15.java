package day10stringmethods;

public class Method15 {

	public static void main(String[] args) {
		
	/*
	 * s1.substring(beginIndex); ==> ad�nda oldu�u gibi parantez i�ine yaz�lan say�y� ba�lang�� index'i olarak kabul eder.
	 * O index'teki karakterden itibaren var gibi d���n�p gerisini al�r.Bir string'in istedi�imiz yerini al�r�z.
	 * 
	 * s1.substring(beginIndex, endIndex) ==> baslang�� ve biti� index'ini belirler aras�n� al�r�z.
	 * Beginindex dahil, EndIndex hari�
	 */
		
		
		
		
		
		String s1 = "Java OOP languagedir";
		
	//	s1.substring(beginIndex)
		s1.substring(3);
		
		System.out.println(s1.substring(3)); // a OOP languagedir
		
	//  OOP languagedir
		
		System.out.println(s1.substring(5));	
		
	// 	System.out.println(s1.substring(0)); ==> tamam�n� b�yle alabiliriz ama gerek yok bu belli bir b�l�m almak i�in kullan�l�r.
	// tamam�n� almak i�in s1'i yazd�rmam�z yeterli
		
	
	// son harfi ekrana yazd�r�n (dinamik olsun yani string de�isse de kod de�i�mesin)
		
	s1.charAt(s1.length()-1);
		
	System.out.println(s1.substring(s1.length()-1)); // r
		
		
	//s1.substring(beginIndex, endIndex)	
	s1.substring(9, 17);
	System.out.println(	s1.substring(9, 17)); // language --> 9 dahil , 17 dahil de�il
	System.out.println(	s1.substring(0, 1)); // J  --> ilk harfi b�yle de bulabiriz .
	
	// charAt(0) de ilk harfi verir
	// s1.substring(0, 1) = charAt(0) ==> e�it diyemeyiz 
	// ��nk� s1.substring(0, 1) --> String return eder.
	// charAt(0) --> char return eder
	
	System.out.println(s1.substring(5,5)); // hi�birsey 
	
	//s1.substring(5, 2); // run time error verir . en k�t� esit olabilir. baslang�� index'i biti� index'inden b�y�k olamaz
	
	
	
	
	
	
	
	
	
	}

}
