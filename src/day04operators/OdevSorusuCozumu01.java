package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {
	public static void main(String[] args) {
		
		// kullanýcýdan integer aldýktan sonra string alamýyoruz.
			
Scanner scan = new Scanner(System.in);
		
//System.out.println("Yaþýnýzý giriniz.");
//int yas = scan.nextInt();
//System.out.println(yas);

/* kullanýcý yasýný 33 giriyor..nextInt() methodu bu sayýyý yas container'ýna 
 atýyor.Esasýnda bu 33 iki tane karakterden oluþan bir sayý. 
Bu 33, String olarak da yazabilirim."33"(çift týrnak içine koyunca)string rakamlarýda
karakter olarak kabul eder.illa harf olmasýna gerek yok.rakam,harf,sembol ne varsa kabul eder.                      
yeter ki çift týrnak içinde olsun."A","5","%" burda java sadece þekil olarak kabul eder.Bu sebeple                            
prob halletmek için yaþý int olarak deðil integer olarak almak lzm. */



//System.out.println("Adýnýzý ve soyadýnýzý giriniz");
//String name = scan.nextLine();
//System.out.println(name);

/* isim yazmadý ekrana .. bunu çözmek için integer almayacagýz.
  eger integer aldýktan sonra string almamýz gerekiyorsa o zmn ýnteger 
   almayacagýz. Ama önce yaþ sormak gerekirse nasýl olacak */
		
		
		
System.out.println("Yaþýnýzý giriniz.");		
String age = scan.next();
System.out.println(age);

System.out.println("adýnýzý soyadýnýzý giriniz");
String adSoyad = scan.nextLine();
System.out.println(adSoyad);
		
scan.close();


	}

}
