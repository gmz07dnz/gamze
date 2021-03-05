package day10stringmethods;

public class Method8 {

	public static void main(String[] args) {
		
		/*
		 * indexOf(ch, fromIndex) ==> ... no'lu indexden ... olan char'ý arýyoruz.
		 * index of ilkini veriyordu ama bazen daha sonrasý gerekebiliyor.
		 * 
		 */
		
		
	String s2 = "Cabuk ogrenilen cabuk unutur.";
	
	// s2.indexOf(ch, fromIndex)
		
	//s2.indexOf('a', 6)	
		
	System.out.println(s2.indexOf('a', 6));	//17
	
	// s2.indexOf('r', 8)
	
	System.out.println(s2.indexOf('r', 8)); // 8
	

	// s2.indexOf(str, fromIndex)
	
	
	s2.indexOf("buk", 5);
	
	System.out.println(s2.indexOf("buk", 5));//18 ==> birden fazla karakterde ilk harfin index'ini alýyoruz
	
	
	
	
	
	
	
  
	}

}
