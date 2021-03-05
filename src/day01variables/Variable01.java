package day01variables;

public class Variable01 {
	public static void main(String[] args) {
	
		// variable olu�turmak i�in;
		
     // int maas;
	//	char harf;   // herhangi bir deger olmad�g� icin variable bo� ve belirsiz o yuzden java default value 
		             // koyar. int i�in ==>0 , char i�in ==>\0000
		
		
		
		// variable'a deger atarsan�z ;
		
		int maas1 = 3000;
		char harf1 = 'S';   // deger atand�g�nda variable containera bu degerleri yazar. Default value silinir.
		                   // char degeri tek t�rnak i�ine yaz�l�r.
		
		System.out.println(maas1); // 3000
		System.out.println(harf1); // S
		
		int say� = 123;  // esittirden oncesi variable olusturma , sonras� deger atamad�r.
		System.out.println(say�); // 123
		
		boolean isOld = true;   // boolean'lar i�in sadece true yada false degerlerini yazd�rabilirsiniz.
		System.out.println(isOld); // true
		
		boolean isNew = false;
		System.out.println(isNew); // false
		
		boolean isClever = true; 
		System.out.println(isClever); // true
		
		boolean isStupid = false;
		System.out.println(isStupid); // false
		
		byte derinlik = -123;
		System.out.println(derinlik); // -123
		
		byte thePopulationOfMyVillage = 127;
		System.out.println(thePopulationOfMyVillage); //127
		
		short �irnakN�fus = 28000;
		System.out.println(�irnakN�fus); // 28000
		
		short numberRoomsOfHotel= 155;
		System.out.println(numberRoomsOfHotel); // 155
		
		long hucreSayisi = 123456789088l; // integer sinirini asan long variable'larda en sona "l" veya "L"
		                                  // koymal�y�z. �nteger s�n�r�n� ge�miyorsa hata vermez."l" veya "L" 
		                                  // koymaya gerek kalmaz.
		                                 // Default value = 0
		System.out.println(hucreSayisi); // 123456789088
		
		
		double pi = 3.145678899064;    // Java b�t�n ondal�k kesirleri otomatik olarak double kabul eder. 
		                               // Default value = 0.0
		System.out.println(pi); // 3.145678899064
		
		
		float para = 5.25f;  // Bir ondal�k kesri float yapmak isterseniz sonuna "f" veya "F" koymal�y�z.
		                     // Default value = 0.0f
		System.out.println(para); // 5.25
		
		
		String ogrenciIsmi = "Ali Can";
		System.out.println(ogrenciIsmi); // Ali Can
		
		
		String aptAdi = "manolya";
		System.out.println(aptAdi); // manolya
				
	// 1.yol
		int age = 35;
		System.out.println(age);
		
	// 2.yol 
	int age1;
	age1 = 35;
	System.out.println(age1);
	
	// 3.yol
	
	/*
	char ch = '2';
	char ch1 = '3';
	char ch2 = '4';
	 */
	
	char ch = '2', ch1 = '3', ch2 = '4';
	System.out.println(ch + ch1 +ch2);  // karakter degerlerini toplad�
	
	// mesela '2' nin degerini bulal�m.	
	
	int deger2 = '2';
	
System.out.println(deger2); // 50
		
		
	}
	
	
	
	
	
	
	
	
	

}
