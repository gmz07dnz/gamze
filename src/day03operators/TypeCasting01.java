package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by = 101;
		int sayi = by;  // küçük data type'ý büyük data type'a cevirmek için extra bir kod yazmaya gerek yok.
		               // Java bunu oto olarak yapar.(Auto Widening)
		System.out.println(sayi);
		
		
		short sh = 1500;
		long sayi2 = sh;
		System.out.println(sayi2);
		
		
		int sayý = 53;
		byte by2 = (byte)sayý; // büyük data tipini küçük data tipine cevirmek java tarafindan yapýlmaz.
		                       // örnekteki gibi sag tarafa dönüþtürmek için istediðimiz data tipini parantez
		                       // içine yazmalýyýz.
		System.out.println(by2);
		
		
		double sayi3 = 23.5;
		int by3 =(int)sayi3;
		System.out.println(by3); // 23 
		
		
		float sayi4 = -23.9f;
		short by4 =(short)sayi4;
		System.out.println(by4);
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc1 = sayi5/sayi6;
		System.out.println(sonuc1); // 3.428571428571429
			
	int sonuc2 =(int)(sayi5/sayi6);
	System.out.println(sonuc2);// 3
	
	
   int sayi7 = 5;
   int sayi8 = 3;
   int sonuc3 = sayi7/sayi8;
 System.out.println(sonuc3);// normalde 5/3 = 1,66666... ama data type int olursa sadece tam kýsmý görürsünüz.
 
 
 int sayi9 = 255;
 byte by5 = (byte) sayi9;
 System.out.println(by5); //255 çýkmasýný beklerim.ama ekranda -1 cýkar. 255 byte sýnýrlarý içinde yok.
                          // normalde byte da 256 sayý var .255 koyunca 1 eksik bu yuzden -1 yazýyor.
                          // 255i 256 ya böler kalaný yazar.
 
 
		
 int sayi10 = 556;
 byte by6 = (byte) sayi10;
 System.out.println(by6);	
		
		
		
		
		
	}

}
