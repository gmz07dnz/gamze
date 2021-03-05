package day11stringmethods;

import java.util.Scanner;

public class StringOdev04 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan ilk ve soy ismini alýn ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdýrýn.
		 */

	Scanner scan = new Scanner(System.in);	
	System.out.println("Ýsminizi giriniz ");
	String isim = scan.nextLine().toUpperCase();
	
	System.out.println("Soyisminizi giriniz");
	String soyIsim = scan.nextLine().toUpperCase();
	
	System.out.println("Ýsminizin ilk harfi: " + isim.charAt(0) + "\n" + "Soyisminizin ilk harfi: "+ soyIsim.charAt(0));
	
	scan.close();
		
		
		
	}

}
