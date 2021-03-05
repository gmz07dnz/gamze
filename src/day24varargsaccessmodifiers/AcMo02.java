package day24varargsaccessmodifiers;


import day22listsforeachloop.AcMo;
public class AcMo02 {
	
/*
 * Access modifier class member'lara ulaþabilmeyi düzenler.
 * Public==> herkes ulaþýlabilir.
 * Default(Package Private ) ==> Sadece package içindekiler ulaþabilir.
 * Private ==> Sadece class içinden ulaþabilir.
 * Protected ==> package içindekiler ve child'ler ulaþabilir.
 
 1)Private class member'lar sadece içinde bulunduklarý class'lar içinde kullanýlabilirler.
   Baska class'lardan "private" class member'larý kullanmak mümkün degildir.
  2) baska package'lardan default (package private - pakete özel ) class member'lara ulasamazsýnýz.Default diðer package'lardan ulasmayý engelliyor.
  Ayný package'da iseniz ulasýrsýnýz.
  
  3) "protected" class member'lara ayný package'da iseniz ulaþabilirsiniz.Farklý package 'da iseniz: 
  Ýki durum var : a) Child class iseniz ulaþabilirsiniz.
                  b) Child class degilseniz ulaþamazsýnýz.
                  
  6) Class'larda da access modifier kullanýlýr. Sadece public ve default class olusturabilir.Private class yaparsak kullanýlamaz, 
  bu yuzden anlamsýz bulur. Birsey yazmýyorsa class onunde o zmn default'dýr.
                  
 */
	

	public static void main(String[] args) {
		
//*AcMo01 class içindeki intance variable'lara ulasmak için burda bir obje uretiyorum . Çunku intance variable'lara obje uzerinden
// ulasýlýr.

	AcMo01 obj1 = new AcMo01();  
		
	
	System.out.println(obj1.defaultAge);
	System.out.println(obj1.protectedAge);
	System.out.println(obj1.publicAge);
	
	AcMo obj = new AcMo(); // baska package'dan obje yazýnca sikayet ediyor.Import etmek gerekiyor.
	
	System.out.println(obj.publicName); // 
	
	
	
	
	}

}
