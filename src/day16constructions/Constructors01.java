package day16constructions;



public class Constructors01 {
 
	public Constructors01() {  // bunu biz urettik
		
	}
	
	
	public static void main(String[] args) {
	
		/*
		 1) Constructor'�n ismi class'�n ismi ile ayn� olmal�d�r,
		 2) Constructor olusturuken class ismi yaz�ld�ktan sonra () konulmal�d�r.
		 3) Class olusturuldugunda java bu class'tan obje olusturulacag�n� dusunerek 
		 "constructor" olusturur. Bu constructor'a "default constructor" denir.
		 4) Siz kendiniz constructor uretti�inizde ,java default constructor'i iptal eder.
		 5) Constructor ureterek bir class'tan cok farkl� objeler uretebiriz.
		 6) Constructor'larda return type yoktur. Bu yuzden Constructor'lar method degildirler.
		 costructor'lar sadece constructor'd�rlar.  methodlarda return type olmal�d�r.
		 7)  Constructor'larda sadece class ismi isim olarak kullanilabilir, fakat methodlarda isim olarak hersey
	  kullanilabilir
		 */
		
		
 // Class ismi        object ismi       new keyboard        constructor
//	  Scanner             scan        =      new           Scanner(System.in);   
	
//  new yaz�nca java anlar ve obje uretmek i�in bekler.obje class'tan uretilir.Bunun i�in de costructor gereklidir.
// olusan obje scan i�ine konur.
		
  
// kendi class'�m�zdan obje olusurabiliriz.Obje i�in constructor sart.Java class olusturunca b�y�k ihtimalle 
//obje uretilecegini bilir.Cunku class kal�pt�r bosuna olusturacak degiliz.	O yuzden java class arkas�nda haz�r tutar.
// bu yuzden biz g�r�nmese de kulland�g�m�z halde hata vermez 				

//   Class ismi          object ismi       new keyboard          constructor
//  Constructors01		    obj1         =      new          Constructors01(); 
		
		
	/*
	 *  constructor uretmek i�in	
	  public (access modifier) Constructors01(class�n ismi) {
	      }    bunu uretince java kend�s�n�nk�n� s�ler. java da haz�rlasa biz de haz�rlasak class ismi ile ayn� olur.
	 */
		
		
	}

}
