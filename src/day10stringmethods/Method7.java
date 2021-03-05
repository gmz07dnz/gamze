package day10stringmethods;

public class Method7 {

	public static void main(String[] args) {
		/*
		 * indexOf(int ch) yazýyor tabloda týklayýnca indexOf(ch) seklinde cýkýyor. ch diyor yani char o zmn ' ' arasýna yazarýz
		 * indexOf('i') ==> i'nin index'ine bak demek 
		 * indexOf(ch) methodu yazdýgýmýz String içindeki aradýðýmýz karakterin ilkini yollar.
		 * String ve char ile calisir. birden fazla karakter sorulursa ilk characterin index'ini verir.
		 * indexOf(ch) methodu olmayan karakterler için -1 return eder.
		 */
	
	
	String s1 = "Testi al kendini gor";
	
	// s1.indexOf(ch);
	
	s1.indexOf('i'); 
	System.out.println(s1.indexOf('i'));//  4  ==> ilk 'i' 'ye bakar . String' e bakarýz.
	
	System.out.println(s1.indexOf('T')); // 0
	System.out.println(s1.indexOf(' ')); // 5
	System.out.println(s1.indexOf("al")); // 6   string yazýnca hata vermedi . Gider bakar "al" ý bulur . 
	                          // Bu method ilk görüneni verdiðinden a'nýn index'ini verir.
	
	
	// indexOf(ch) methodu olmayan karakterler için -1 return eder.
	
	s1.indexOf('x');
	System.out.println(s1.indexOf('x')); // -1
	
	System.out.println(s1.indexOf("")); // 0 ilk harf T ama, Tden önce hiçbirsey var. e den önce hiçbirsey var.
	                               // T karakterlerin 1. ci , "" de hiçbirseylerin birincisi java soldan saga calýþtýgý için ilkini yazar.
	
	
	
	
	
	}

}
