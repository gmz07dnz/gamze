package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {
	public static void main(String[] args) {
		
		// kullan�c�dan integer ald�ktan sonra string alam�yoruz.
			
Scanner scan = new Scanner(System.in);
		
//System.out.println("Ya��n�z� giriniz.");
//int yas = scan.nextInt();
//System.out.println(yas);

/* kullan�c� yas�n� 33 giriyor..nextInt() methodu bu say�y� yas container'�na 
 at�yor.Esas�nda bu 33 iki tane karakterden olu�an bir say�. 
Bu 33, String olarak da yazabilirim."33"(�ift t�rnak i�ine koyunca)string rakamlar�da
karakter olarak kabul eder.illa harf olmas�na gerek yok.rakam,harf,sembol ne varsa kabul eder.                      
yeter ki �ift t�rnak i�inde olsun."A","5","%" burda java sadece �ekil olarak kabul eder.Bu sebeple                            
prob halletmek i�in ya�� int olarak de�il integer olarak almak lzm. */



//System.out.println("Ad�n�z� ve soyad�n�z� giriniz");
//String name = scan.nextLine();
//System.out.println(name);

/* isim yazmad� ekrana .. bunu ��zmek i�in integer almayacag�z.
  eger integer ald�ktan sonra string almam�z gerekiyorsa o zmn �nteger 
   almayacag�z. Ama �nce ya� sormak gerekirse nas�l olacak */
		
		
		
System.out.println("Ya��n�z� giriniz.");		
String age = scan.next();
System.out.println(age);

System.out.println("ad�n�z� soyad�n�z� giriniz");
String adSoyad = scan.nextLine();
System.out.println(adSoyad);
		
scan.close();


	}

}
