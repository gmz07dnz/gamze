package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by = 101;
		int sayi = by;  // k���k data type'� b�y�k data type'a cevirmek i�in extra bir kod yazmaya gerek yok.
		               // Java bunu oto olarak yapar.(Auto Widening)
		System.out.println(sayi);
		
		
		short sh = 1500;
		long sayi2 = sh;
		System.out.println(sayi2);
		
		
		int say� = 53;
		byte by2 = (byte)say�; // b�y�k data tipini k���k data tipine cevirmek java tarafindan yap�lmaz.
		                       // �rnekteki gibi sag tarafa d�n��t�rmek i�in istedi�imiz data tipini parantez
		                       // i�ine yazmal�y�z.
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
 System.out.println(sonuc3);// normalde 5/3 = 1,66666... ama data type int olursa sadece tam k�sm� g�r�rs�n�z.
 
 
 int sayi9 = 255;
 byte by5 = (byte) sayi9;
 System.out.println(by5); //255 ��kmas�n� beklerim.ama ekranda -1 c�kar. 255 byte s�n�rlar� i�inde yok.
                          // normalde byte da 256 say� var .255 koyunca 1 eksik bu yuzden -1 yaz�yor.
                          // 255i 256 ya b�ler kalan� yazar.
 
 
		
 int sayi10 = 556;
 byte by6 = (byte) sayi10;
 System.out.println(by6);	
		
		
		
		
		
	}

}
