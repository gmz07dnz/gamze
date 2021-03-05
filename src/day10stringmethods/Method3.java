package day10stringmethods;

public class Method3 {

	public static void main(String[] args) {
		
		/*
		 * s3.contains() ==> parantez içine yazdığımızı içerip içermediğine bakar . True / False ile cevap verir. Boolean return eder.
		 * char da , string de yazılabilir
	    */
		
		String s3 = "Java ogren zengin ol";

	s3.contains("J");
	
	System.out.println(s3.contains("J")); // true
		
	System.out.println(s3.contains("x")); // false
		
	System.out.println(s3.contains("ogren")); // true	 
	
	System.out.println(s3.contains("Zengin")); // false ==> buyuk harflisi yok
	
	System.out.println(s3.contains("")); // true ==> bu hiçbirsey demektir. mesela g ve r arasında hicbbirsey var ya da J'den önce
	
	System.out.println(s3.contains(" ")); // true ==> space karakterdir 
	

	
	
	
	}

}
