package day11stringmethods;

import java.util.Scanner;

public class StringOdev03 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan ilk ve soy ismini alýn ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn.
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("isminizi giriniz");
	String isim = scan.nextLine();
	System.out.println("soyisminizi giriniz");
	String soyIsim = scan.nextLine();
	
    isim = isim.trim();
    soyIsim = soyIsim.trim();
	System.out.println("Ýsminiz, " + isim.length() + " harflidir.");
	
	System.out.println("Soyisminiz, " + soyIsim.length() + " harflidir.");
	
//System.out.println("Ýsminiz, " + isim.length() + " harflidir."+ "\n"+ "Soyisminiz, " + soyIsim.length() + " harflidir." );
	
	
scan.close();	
	
	
	}

}
