package day11stringmethods;

import java.util.Scanner;

public class StringOdev04 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan ilk ve soy ismini al�n ilk ve soy isminin ilk harflerini b�y�k harf olarak ekrana yazd�r�n.
		 */

	Scanner scan = new Scanner(System.in);	
	System.out.println("�sminizi giriniz ");
	String isim = scan.nextLine().toUpperCase();
	
	System.out.println("Soyisminizi giriniz");
	String soyIsim = scan.nextLine().toUpperCase();
	
	System.out.println("�sminizin ilk harfi: " + isim.charAt(0) + "\n" + "Soyisminizin ilk harfi: "+ soyIsim.charAt(0));
	
	scan.close();
		
		
		
	}

}
