package day15variabletypesandmethodcreations;

public class VariableTypes {
	
	/*          INSTANCE VARIABLE
	 *  variable'larý main methodun dýsýna , class içine yazdýk.
	 1) Main methodun ve urettiðimiz diðer methodlarýn dýsýnda, class içinde oluþturulan variable'lara "instance variable" denir.
	 2) instance variable'lar obje olusturulurken olusturulur. Her obje'ye bu variable'lar monte edilir.
	 3) instance variable'lara deger atamasý yapsanýz da olur yapmasanýz da olur.
	    Asagýda goruldugu gibi "i" variable'ýna deger atadýk "k" variable'ýna deger atamadýk .
	    NOTE: Bir variable'a deger atamasý yapmaya "initialize " denir. 
	    "i" variable initialize edildi, digerleri edilmedi.
	  4) Inýtýalize edilmeyen instance variable'lar için java kendisi deger atar.
	  java'nýn kendisinin verdiði degerlere "default value" denir.
	  byte,short,long,int için default value 0'dýr
	  double , float için default value 0'dýr
	  Char java için bir sayýdýr ve default value 0'dýr
	  boolean için default value false'dur
	  string için default value null'dýr
	
	 */
	
	
	int i = 12;
	int k;
	String s;
	boolean b;
	double d;
	char c;
	
	
	/*
	 *         LOCAL VARIABLE
	 1) main methodun veya olusturdugumuz baska methodun içinde olusturulan methodlara "local variable" denir.
	 2) local variable'lara deger atamasý yapmalýyýz. yoksa hata verir.O variable'ý kullanamayýz.
	    Java local variable'lar için default value atamasý yapmaz        
	 */

	public static void main(String[] args) {
		
	// int a; ==> main methodun dýsýna cýkamaz bu variable
     // a++; ==> arttýrýnca hata veriyor . cunku java local olanlara deger atamaz.Olmayan degerý arttýramam o yuzden hata oluyor.
		
	//	int a =13;
           
	//	a++;
		
	}

}
