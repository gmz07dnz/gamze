package javapractice;

public class Day04Hm {

	
		 /*
	      * HM(Hesap makinasi) isimli bir class olusturun
	        Icine 2 sayiyi carpan , 2 sayiyi toplayan ve sonucunu donduren 2 method
	        3 sayiyi carpan, 3 sayiyi toplayan ve sonucu yazdiran 2 method olusturun
	        
	        HMC (Hesap makinasi cal�st�r ) isimli bir class olusturun .
	        HM class'�ndan obje olusturarak oradaki methodlar� kullan�n.
	      */

	
   // main method yok yani birsey cal�st�rmayacag�z. Ama method olusturabiliriz.
  // method olustururken amac�m�z sadece yazd�rmak ise return type'� void secip method i�inde yazd�rma i�lemini yapt�rabilirsiniz
   // method olustururkensonucu farkl� bir sekilde kullanmak istiyorsan�z return type'� ona g�re yaz�p kendimize d�n
	
	
	public  int carpim2(int a, int b) {  // say�y� donduren dedi�i i�in return type ==> int yazd�k. yazd�rmay� buraya yapmad�k
		int carpim = a*b;
		return carpim;
		
	}
	
	public  int toplama2(int a, int b) {
		int toplama = a*b;
		return toplama;
	}
	

	

	public  void carpim3(int a, int b,int c) {  // say� yazd�r demi� soruda o yuzden return type ==> void dedik
		int carpim = a*b*c;
		System.out.println(carpim);
	}
	
	public  void toplama3(int a, int b, int c) {
		int toplama = a+b+c;
		System.out.println(toplama);
	}
	
}
