package javapractice;

public class Day04Hm {

	
		 /*
	      * HM(Hesap makinasi) isimli bir class olusturun
	        Icine 2 sayiyi carpan , 2 sayiyi toplayan ve sonucunu donduren 2 method
	        3 sayiyi carpan, 3 sayiyi toplayan ve sonucu yazdiran 2 method olusturun
	        
	        HMC (Hesap makinasi calýstýr ) isimli bir class olusturun .
	        HM class'ýndan obje olusturarak oradaki methodlarý kullanýn.
	      */

	
   // main method yok yani birsey calýstýrmayacagýz. Ama method olusturabiliriz.
  // method olustururken amacýmýz sadece yazdýrmak ise return type'ý void secip method içinde yazdýrma iþlemini yaptýrabilirsiniz
   // method olustururkensonucu farklý bir sekilde kullanmak istiyorsanýz return type'ý ona göre yazýp kendimize dön
	
	
	public  int carpim2(int a, int b) {  // sayýyý donduren dediði için return type ==> int yazdýk. yazdýrmayý buraya yapmadýk
		int carpim = a*b;
		return carpim;
		
	}
	
	public  int toplama2(int a, int b) {
		int toplama = a*b;
		return toplama;
	}
	

	

	public  void carpim3(int a, int b,int c) {  // sayý yazdýr demiþ soruda o yuzden return type ==> void dedik
		int carpim = a*b*c;
		System.out.println(carpim);
	}
	
	public  void toplama3(int a, int b, int c) {
		int toplama = a+b+c;
		System.out.println(toplama);
	}
	
}
