package day10stringmethods;

public class Method5 {

	public static void main(String[] args) {
		/*
		 * equals(anObject) methodu boolean return eder.String'lerde "==" kullanýlmaz .equals(anObject)  methodu kullanýlýr.
		 * Mesela password equals methoduyla çalýsýr
		 */

	String s1 = "Testi al kendini gor";	
	
	//	s1.equals(anObject);
		
	System.out.println("Ali".equals("Ali")); // true
	System.out.println("Ali".equals("ALI")); // false  ==> case sensitive
	System.out.println("Ali"== ("Ali")); // "==" iþareti bazen true bazen false verir. Riske girmemek için equals() methodunu kullanýlmalý.
		                                 // "==" deger ve adres karþýlaþtýrýr. ikisi de aynýysa true verir.
	                                     // equals() methodu sadece degere bakar. 
		
		
	System.out.println(s1.equals("Ali"));// false
		
		
		
		
	}

}
