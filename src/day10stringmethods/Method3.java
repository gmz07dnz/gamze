package day10stringmethods;

public class Method3 {

	public static void main(String[] args) {
		
		/*
		 * s3.contains() ==> parantez i�ine yazd���m�z� i�erip i�ermedi�ine bakar . True / False ile cevap verir. Boolean return eder.
		 * char da , string de yaz�labilir
	    */
		
		String s3 = "Java ogren zengin ol";

	s3.contains("J");
	
	System.out.println(s3.contains("J")); // true
		
	System.out.println(s3.contains("x")); // false
		
	System.out.println(s3.contains("ogren")); // true	 
	
	System.out.println(s3.contains("Zengin")); // false ==> buyuk harflisi yok
	
	System.out.println(s3.contains("")); // true ==> bu hi�birsey demektir. mesela g ve r aras�nda hicbbirsey var ya da J'den �nce
	
	System.out.println(s3.contains(" ")); // true ==> space karakterdir 
	

	
	
	
	}

}
