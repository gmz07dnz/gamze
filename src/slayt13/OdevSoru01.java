package slayt13;

import java.util.Scanner;

public class OdevSoru01 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan isim ve soyismini al�n. Kullan�c�n�n isim ve soyisminin ilk
		 * harflerini b�y�k di�er harflerini k���k harf olarak ekrana yazd�ran program�
		 * yaz�n�z.
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("�sminizi giriniz");
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
