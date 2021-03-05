package javapractice;

import java.util.Scanner;

public class Day06Soru {

	public static void main(String[] args) {
		
		/*
		 * Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
		 * variable’lara atama yapin
		 *  IsimDegistir adinda bir method olusturun, parameter olarak ogrenci
		 * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
		 * yazdirsin.
		 * 
		 * Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
		 * sonrasinda yeniden ogrenci bilgilerini yazdirin.
		 * 
		 * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
		 * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve 
		 * eski soyismi (Yani can'i) degistirsin.

		 */
		
		
		String isim="Ali";
		String soyIsim="Can";
		String tel="5301234567";
		
	    isimDegistir(isim, soyIsim, tel);
	    System.out.println(isim +" "+soyIsim+" "+ tel );
		
	    soyIsim = soyIsimDegistir(soyIsim);
		System.out.println(isim +" "+soyIsim+" "+ tel );

	}
	
	public static void isimDegistir(String name,String surName, String telNo) {
		
		name = "Ahmet";
		surName = "Yilmaz";
		telNo = "5311234567";
		System.out.println(name +" "+surName+" "+ telNo );
		
		
	}
	
	public static String soyIsimDegistir(String surName) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yeni soyismi giriniz");
	    String soyIsimYeni = scan.nextLine();
	    scan.close();
		return soyIsimYeni;
	    
	

	
	}
	
	
}
