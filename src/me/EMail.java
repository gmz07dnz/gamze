package me;

import java.util.Scanner;

public class EMail {

	public static void main(String[] args) {

		/*
		 * Klavyeden okunacak bir e-mail adresindeki kullan�c� ad�n� ve sunucu ad�n� ekrana yazd�ran 
		 * bilgisayar program�n� Java dilinde yaz�n�z. 
		 * 
		 * e-mail adresi �rne�i: turkaslan@gmail.com 
		 * ekrana: kullaniciadi: turkaslan 
		 * sunucu: gmail yazacak
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Email adreinizi giriniz");
		String eMail = scan.nextLine();
		
		eMail.indexOf('@');  // "@" i�aretini g�rd��� index
		
		String kullaniciAdi = eMail.substring(0, eMail.indexOf('@')); // bastan "@" a kadar olan k�sm�
		
		eMail.indexOf('.'); // "." y� gordugu index
		
		String sunucu = eMail.substring((eMail.indexOf('@') +1), eMail.indexOf('.')); // "@" dan sonuna kadar k�sm� verir
		
		System.out.println("Kullanici adi: "+ kullaniciAdi );
		System.out.println("Sunucu: "+ sunucu);
		
		
		scan.close();
		
		
	}

}



