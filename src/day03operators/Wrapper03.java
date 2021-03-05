package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
 // kullanýcýdan ad ve soyadýný alalým ekrana yazdýralým
 // kullanýcýdan adresini alalým ekrana yazdýralým.(2.cadde Bakýrköy Istanbul Türkiye)
 // kullanýcýdan yaþýný alalým ekrana yazdýralým.
 //kullanýcýya "Türkiye'de yaþýyorum diye soralým cevabýný ekrana yazdýralým.true veya false olarak
		
		
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen ad ve soyadýnýzý giriniz.");
	String adSoyad = scan.nextLine();
	System.out.println(adSoyad); // gamze deniz
	
	System.out.println("lütfen adresinizi yazýnýz.");
	String adres = scan.nextLine();
	System.out.println(adres);
		
	System.out.println("Lütfen yaþýnýzý giriniz");	
	int yas = scan.nextInt();
	System.out.println(yas);
	
	System.out.println("türkiye'de yasýyorum.true/false");
	boolean blTr = scan.nextBoolean();
	System.out.println(blTr);
		
	scan.close();	
		
		
	}

}
