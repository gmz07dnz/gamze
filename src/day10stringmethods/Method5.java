package day10stringmethods;

public class Method5 {

	public static void main(String[] args) {
		/*
		 * equals(anObject) methodu boolean return eder.String'lerde "==" kullan�lmaz .equals(anObject)  methodu kullan�l�r.
		 * Mesela password equals methoduyla �al�s�r
		 */

	String s1 = "Testi al kendini gor";	
	
	//	s1.equals(anObject);
		
	System.out.println("Ali".equals("Ali")); // true
	System.out.println("Ali".equals("ALI")); // false  ==> case sensitive
	System.out.println("Ali"== ("Ali")); // "==" i�areti bazen true bazen false verir. Riske girmemek i�in equals() methodunu kullan�lmal�.
		                                 // "==" deger ve adres kar��la�t�r�r. ikisi de ayn�ysa true verir.
	                                     // equals() methodu sadece degere bakar. 
		
		
	System.out.println(s1.equals("Ali"));// false
		
		
		
		
	}

}
