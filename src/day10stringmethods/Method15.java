package day10stringmethods;

public class Method15 {

	public static void main(String[] args) {
		
	/*
	 * s1.substring(beginIndex); ==> adýnda olduðu gibi parantez içine yazýlan sayýyý baþlangýç index'i olarak kabul eder.
	 * O index'teki karakterden itibaren var gibi düþünüp gerisini alýr.Bir string'in istediðimiz yerini alýrýz.
	 * 
	 * s1.substring(beginIndex, endIndex) ==> baslangýç ve bitiþ index'ini belirler arasýný alýrýz.
	 * Beginindex dahil, EndIndex hariç
	 */
		
		
		
		
		
		String s1 = "Java OOP languagedir";
		
	//	s1.substring(beginIndex)
		s1.substring(3);
		
		System.out.println(s1.substring(3)); // a OOP languagedir
		
	//  OOP languagedir
		
		System.out.println(s1.substring(5));	
		
	// 	System.out.println(s1.substring(0)); ==> tamamýný böyle alabiliriz ama gerek yok bu belli bir bölüm almak için kullanýlýr.
	// tamamýný almak için s1'i yazdýrmamýz yeterli
		
	
	// son harfi ekrana yazdýrýn (dinamik olsun yani string deðisse de kod deðiþmesin)
		
	s1.charAt(s1.length()-1);
		
	System.out.println(s1.substring(s1.length()-1)); // r
		
		
	//s1.substring(beginIndex, endIndex)	
	s1.substring(9, 17);
	System.out.println(	s1.substring(9, 17)); // language --> 9 dahil , 17 dahil deðil
	System.out.println(	s1.substring(0, 1)); // J  --> ilk harfi böyle de bulabiriz .
	
	// charAt(0) de ilk harfi verir
	// s1.substring(0, 1) = charAt(0) ==> eþit diyemeyiz 
	// çünkü s1.substring(0, 1) --> String return eder.
	// charAt(0) --> char return eder
	
	System.out.println(s1.substring(5,5)); // hiçbirsey 
	
	//s1.substring(5, 2); // run time error verir . en kötü esit olabilir. baslangýç index'i bitiþ index'inden büyük olamaz
	
	
	
	
	
	
	
	
	
	}

}
