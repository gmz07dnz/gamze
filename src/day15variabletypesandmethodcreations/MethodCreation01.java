package day15variabletypesandmethodcreations;

public class MethodCreation01 {

	// kodlarý main method dýsýna yazacagýz . Main methoddan cagýracagýz.
	// Static method'un içindeki hersey static olmalýdýr
	//  main methoda yazmadýgýmýz seyler calýsmaz. Baslangýc noktasýdýr.
	
	/* method ismi ve parametre sayýsý ayný ise compile time error verir.Ayný isim kullanýlabilir ama parametre farklý olmalý
	 1)parametre sayýsý farklý olabilir.(parametre ismini degistirmek cözüm degil onunla ilgilenmiyor)
	 2)parametre sayýsý ayný olursa ama variable cinsini degistirirsek error vermez
	 3) data type farklý ise parametrelerin yerini degistirmek de cözum olabilir
	  public static void carpma( double a, int b)
	   public static void carpma( int b , double a) gibi
	 */
	
	// ayný method ismi varsa java en az iþ yapacagý methodu secer. Kendisine uygun method bulamazsa compile time error verir
	
public static void main(String[] args) {
		
		toplama(3,5);
		toplama(5.3 , 1.2);    // degerin alýnýp toplama methodunun içindeki paranteze konmasýna pass denir.
		
		 carpma(2 , 3);  
		 carpma(2.3,3.4);
		 carpma(2,3.5);
        carpma(4, 5, 6);     // burdaki sayýlara "argument" denir
	

}

 public static void toplama(double a, double b) {   // methodun calýþmasý için gerekli olan seyler parantez içine yazýlýr
	System.out.println(a+b); 
 }


    // Iki double 'ý carpan carpma methodu create edin.Bu methodu main method içinden carparak cagýrýn
 
 public static void carpma( double a, double b) {  // method içindeki parantezlerdeki variable'lara "parametre" deniliyor.
	                                               // bunlarýn görevi degeri depolamak degil gecirmek
	 System.out.println(a*b);
 }
 

  
 // Uc double 'ý carpan carpma methodu create edin.Bu methodu main method içinden carparak cagýrýn
 
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
