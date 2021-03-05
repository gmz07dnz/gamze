package day10stringmethods;

public class Method7 {

	public static void main(String[] args) {
		/*
		 * indexOf(int ch) yaz�yor tabloda t�klay�nca indexOf(ch) seklinde c�k�yor. ch diyor yani char o zmn ' ' aras�na yazar�z
		 * indexOf('i') ==> i'nin index'ine bak demek 
		 * indexOf(ch) methodu yazd�g�m�z String i�indeki arad���m�z karakterin ilkini yollar.
		 * String ve char ile calisir. birden fazla karakter sorulursa ilk characterin index'ini verir.
		 * indexOf(ch) methodu olmayan karakterler i�in -1 return eder.
		 */
	
	
	String s1 = "Testi al kendini gor";
	
	// s1.indexOf(ch);
	
	s1.indexOf('i'); 
	System.out.println(s1.indexOf('i'));//  4  ==> ilk 'i' 'ye bakar . String' e bakar�z.
	
	System.out.println(s1.indexOf('T')); // 0
	System.out.println(s1.indexOf(' ')); // 5
	System.out.println(s1.indexOf("al")); // 6   string yaz�nca hata vermedi . Gider bakar "al" � bulur . 
	                          // Bu method ilk g�r�neni verdi�inden a'n�n index'ini verir.
	
	
	// indexOf(ch) methodu olmayan karakterler i�in -1 return eder.
	
	s1.indexOf('x');
	System.out.println(s1.indexOf('x')); // -1
	
	System.out.println(s1.indexOf("")); // 0 ilk harf T ama, Tden �nce hi�birsey var. e den �nce hi�birsey var.
	                               // T karakterlerin 1. ci , "" de hi�birseylerin birincisi java soldan saga cal��t�g� i�in ilkini yazar.
	
	
	
	
	
	}

}
