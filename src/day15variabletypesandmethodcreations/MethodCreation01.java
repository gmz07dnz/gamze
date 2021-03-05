package day15variabletypesandmethodcreations;

public class MethodCreation01 {

	// kodlar� main method d�s�na yazacag�z . Main methoddan cag�racag�z.
	// Static method'un i�indeki hersey static olmal�d�r
	//  main methoda yazmad�g�m�z seyler cal�smaz. Baslang�c noktas�d�r.
	
	/* method ismi ve parametre say�s� ayn� ise compile time error verir.Ayn� isim kullan�labilir ama parametre farkl� olmal�
	 1)parametre say�s� farkl� olabilir.(parametre ismini degistirmek c�z�m degil onunla ilgilenmiyor)
	 2)parametre say�s� ayn� olursa ama variable cinsini degistirirsek error vermez
	 3) data type farkl� ise parametrelerin yerini degistirmek de c�zum olabilir
	  public static void carpma( double a, int b)
	   public static void carpma( int b , double a) gibi
	 */
	
	// ayn� method ismi varsa java en az i� yapacag� methodu secer. Kendisine uygun method bulamazsa compile time error verir
	
public static void main(String[] args) {
		
		toplama(3,5);
		toplama(5.3 , 1.2);    // degerin al�n�p toplama methodunun i�indeki paranteze konmas�na pass denir.
		
		 carpma(2 , 3);  
		 carpma(2.3,3.4);
		 carpma(2,3.5);
        carpma(4, 5, 6);     // burdaki say�lara "argument" denir
	

}

 public static void toplama(double a, double b) {   // methodun cal��mas� i�in gerekli olan seyler parantez i�ine yaz�l�r
	System.out.println(a+b); 
 }


    // Iki double '� carpan carpma methodu create edin.Bu methodu main method i�inden carparak cag�r�n
 
 public static void carpma( double a, double b) {  // method i�indeki parantezlerdeki variable'lara "parametre" deniliyor.
	                                               // bunlar�n g�revi degeri depolamak degil gecirmek
	 System.out.println(a*b);
 }
 

  
 // Uc double '� carpan carpma methodu create edin.Bu methodu main method i�inden carparak cag�r�n
 
 public static void carpma( double a, double b , double c) {    
         System.out.println(a*b*c);
}
 
 
 public static void carpma( int a, double b) {
 
	 System.out.println(a*b);
	 }
 
 public static void carpma( int b, int a) {
	 
	 System.out.println(a*b);
	 }
 
 
 
 
 
}
