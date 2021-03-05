package day10stringmethods;

public class Method10 {

	public static void main(String[] args) {
		
		/*
		 * lastIndexOf(ch) ==> karakterin son index'i 
		 * lastIndexOf(str) ==> parantez icindeki son string'in ilk karakterinin index'i verecek
		 * lastIndexOf(ch, fromIndex)
		 */
		
	String s1 = "Tekrar et tekrar unutma";	
		
	// s1.lastIndexOf(ch)	
	
	System.out.println(s1.lastIndexOf('e')); // 11
	
	System.out.println(s1.lastIndexOf('u')); // 19	
		
   // s1.lastIndexOf(str)
	
	System.out.println(s1.lastIndexOf("rar")); //13
	
	// s1.lastIndexOf(ch, fromIndex)
	
	System.out.println(s1.lastIndexOf('r', 16)); // 15  ==>16'ya kadar sayar ilk 16 'yý dikdörtgene alýr. Ordaki son r yi verir.
	                                             // indexOf 'ýn tersi gibi calýþýr.
	System.out.println(s1.lastIndexOf('k', 14)); // 12
	
	

	
	
	
	
	
	
	}

}
