package day11stringmethods;

import java.util.Scanner;

public class StringOdev03 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan ilk ve soy ismini al�n ilk ve soy isminin ka� harften olu�tu�unu ekrana yazd�r�n.
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("isminizi giriniz");
	String isim = scan.nextLine();
	System.out.println("soyisminizi giriniz");
	String soyIsim = scan.nextLine();
	
    isim = isim.trim();
    soyIsim = soyIsim.trim();
	System.out.println("�sminiz, " + isim.length() + " harflidir.");
	
	System.out.println("Soyisminiz, " + soyIsim.length() + " harflidir.");
	
//System.out.println("�sminiz, " + isim.length() + " harflidir."+ "\n"+ "Soyisminiz, " + soyIsim.length() + " harflidir." );
	
	
scan.close();	
	
	
	}

}
