package me;

import java.util.Scanner;

public class EMail {

	public static void main(String[] args) {

		/*
		 * Klavyeden okunacak bir e-mail adresindeki kullanýcý adýný ve sunucu adýný ekrana yazdýran 
		 * bilgisayar programýný Java dilinde yazýnýz. 
		 * 
		 * e-mail adresi örneði: turkaslan@gmail.com 
		 * ekrana: kullaniciadi: turkaslan 
		 * sunucu: gmail yazacak
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Email adreinizi giriniz");
		String eMail = scan.nextLine();
		
		eMail.indexOf('@');  // "@" iþaretini gördüðü index
		
		String kullaniciAdi = eMail.substring(0, eMail.indexOf('@')); // bastan "@" a kadar olan kýsmý
		
		eMail.indexOf('.'); // "." yý gordugu index
		
		String sunucu = eMail.substring((eMail.indexOf('@') +1), eMail.indexOf('.')); // "@" dan sonuna kadar kýsmý verir
		
		System.out.println("Kullanici adi: "+ kullaniciAdi );
		System.out.println("Sunucu: "+ sunucu);
		
		
		scan.close();
		
		
	}

}



