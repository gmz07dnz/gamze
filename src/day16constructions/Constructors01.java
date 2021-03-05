package day16constructions;



public class Constructors01 {
 
	public Constructors01() {  // bunu biz urettik
		
	}
	
	
	public static void main(String[] args) {
	
		/*
		 1) Constructor'ýn ismi class'ýn ismi ile ayný olmalýdýr,
		 2) Constructor olusturuken class ismi yazýldýktan sonra () konulmalýdýr.
		 3) Class olusturuldugunda java bu class'tan obje olusturulacagýný dusunerek 
		 "constructor" olusturur. Bu constructor'a "default constructor" denir.
		 4) Siz kendiniz constructor urettiðinizde ,java default constructor'i iptal eder.
		 5) Constructor ureterek bir class'tan cok farklý objeler uretebiriz.
		 6) Constructor'larda return type yoktur. Bu yuzden Constructor'lar method degildirler.
		 costructor'lar sadece constructor'dýrlar.  methodlarda return type olmalýdýr.
		 7)  Constructor'larda sadece class ismi isim olarak kullanilabilir, fakat methodlarda isim olarak hersey
	  kullanilabilir
		 */
		
		
 // Class ismi        object ismi       new keyboard        constructor
//	  Scanner             scan        =      new           Scanner(System.in);   
	
//  new yazýnca java anlar ve obje uretmek için bekler.obje class'tan uretilir.Bunun için de costructor gereklidir.
// olusan obje scan içine konur.
		
  
// kendi class'ýmýzdan obje olusurabiliriz.Obje için constructor sart.Java class olusturunca büyük ihtimalle 
//obje uretilecegini bilir.Cunku class kalýptýr bosuna olusturacak degiliz.	O yuzden java class arkasýnda hazýr tutar.
// bu yuzden biz görünmese de kullandýgýmýz halde hata vermez 				

//   Class ismi          object ismi       new keyboard          constructor
//  Constructors01		    obj1         =      new          Constructors01(); 
		
		
	/*
	 *  constructor uretmek için	
	  public (access modifier) Constructors01(classýn ismi) {
	      }    bunu uretince java kendýsýnýnkýný sýler. java da hazýrlasa biz de hazýrlasak class ismi ile ayný olur.
	 */
		
		
	}

}
