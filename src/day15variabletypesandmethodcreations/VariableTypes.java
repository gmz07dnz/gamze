package day15variabletypesandmethodcreations;

public class VariableTypes {
	
	/*          INSTANCE VARIABLE
	 *  variable'lar� main methodun d�s�na , class i�ine yazd�k.
	 1) Main methodun ve uretti�imiz di�er methodlar�n d�s�nda, class i�inde olu�turulan variable'lara "instance variable" denir.
	 2) instance variable'lar obje olusturulurken olusturulur. Her obje'ye bu variable'lar monte edilir.
	 3) instance variable'lara deger atamas� yapsan�z da olur yapmasan�z da olur.
	    Asag�da goruldugu gibi "i" variable'�na deger atad�k "k" variable'�na deger atamad�k .
	    NOTE: Bir variable'a deger atamas� yapmaya "initialize " denir. 
	    "i" variable initialize edildi, digerleri edilmedi.
	  4) In�t�alize edilmeyen instance variable'lar i�in java kendisi deger atar.
	  java'n�n kendisinin verdi�i degerlere "default value" denir.
	  byte,short,long,int i�in default value 0'd�r
	  double , float i�in default value 0'd�r
	  Char java i�in bir say�d�r ve default value 0'd�r
	  boolean i�in default value false'dur
	  string i�in default value null'd�r
	
	 */
	
	
	int i = 12;
	int k;
	String s;
	boolean b;
	double d;
	char c;
	
	
	/*
	 *         LOCAL VARIABLE
	 1) main methodun veya olusturdugumuz baska methodun i�inde olusturulan methodlara "local variable" denir.
	 2) local variable'lara deger atamas� yapmal�y�z. yoksa hata verir.O variable'� kullanamay�z.
	    Java local variable'lar i�in default value atamas� yapmaz        
	 */

	public static void main(String[] args) {
		
	// int a; ==> main methodun d�s�na c�kamaz bu variable
     // a++; ==> artt�r�nca hata veriyor . cunku java local olanlara deger atamaz.Olmayan deger� artt�ramam o yuzden hata oluyor.
		
	//	int a =13;
           
	//	a++;
		
	}

}
