package slayt13;

import java.util.Scanner;

public class OdevSoru01 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan isim ve soyismini alýn. Kullanýcýnýn isim ve soyisminin ilk
		 * harflerini büyük diðer harflerini küçük harf olarak ekrana yazdýran programý
		 * yazýnýz.
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("Ýsminizi giriniz");
	String isim = scan.nextLine();
	System.out.println("Soyisminizi giriniz");
	String SoyIsim = scan.nextLine();
	
	isim = isim.substring(0, 1).toUpperCase()+ isim.substring(1).toLowerCase();
	SoyIsim = SoyIsim.substring(0, 1).toUpperCase()+ SoyIsim.substring(1).toLowerCase();
	
	System.out.println(isim);
	System.out.println(SoyIsim);
	
	
	scan.close();
	
	
	
	}

}
