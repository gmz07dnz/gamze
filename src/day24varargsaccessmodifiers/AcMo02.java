package day24varargsaccessmodifiers;


import day22listsforeachloop.AcMo;
public class AcMo02 {
	
/*
 * Access modifier class member'lara ula�abilmeyi d�zenler.
 * Public==> herkes ula��labilir.
 * Default(Package Private ) ==> Sadece package i�indekiler ula�abilir.
 * Private ==> Sadece class i�inden ula�abilir.
 * Protected ==> package i�indekiler ve child'ler ula�abilir.
 
 1)Private class member'lar sadece i�inde bulunduklar� class'lar i�inde kullan�labilirler.
   Baska class'lardan "private" class member'lar� kullanmak m�mk�n degildir.
  2) baska package'lardan default (package private - pakete �zel ) class member'lara ulasamazs�n�z.Default di�er package'lardan ulasmay� engelliyor.
  Ayn� package'da iseniz ulas�rs�n�z.
  
  3) "protected" class member'lara ayn� package'da iseniz ula�abilirsiniz.Farkl� package 'da iseniz: 
  �ki durum var : a) Child class iseniz ula�abilirsiniz.
                  b) Child class degilseniz ula�amazs�n�z.
                  
  6) Class'larda da access modifier kullan�l�r. Sadece public ve default class olusturabilir.Private class yaparsak kullan�lamaz, 
  bu yuzden anlams�z bulur. Birsey yazm�yorsa class onunde o zmn default'd�r.
                  
 */
	

	public static void main(String[] args) {
		
//*AcMo01 class i�indeki intance variable'lara ulasmak i�in burda bir obje uretiyorum . �unku intance variable'lara obje uzerinden
// ulas�l�r.

	AcMo01 obj1 = new AcMo01();  
		
	
	System.out.println(obj1.defaultAge);
	System.out.println(obj1.protectedAge);
	System.out.println(obj1.publicAge);
	
	AcMo obj = new AcMo(); // baska package'dan obje yaz�nca sikayet ediyor.Import etmek gerekiyor.
	
	System.out.println(obj.publicName); // 
	
	
	
	
	}

}
