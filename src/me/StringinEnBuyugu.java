package me;

import java.util.Scanner;

public class StringinEnBuyugu {

	public static void main(String[] args) {
		
		/*
		 * Ekrandan okunan 3 karakter verinin (String) en b�y���n� bularak ekrana yazd�ran bilgisayar program�n� 
		 * Java programlama dilinde yaz�n�z.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("3 String'den en b�y�g�n� bulmak i�in 1.String'i giriniz");
		String str1 = scan.nextLine().toLowerCase().trim();
		System.out.println("3 String'den en b�y�g�n� bulmak i�in 1.String'i giriniz");
		String str2 = scan.nextLine().toLowerCase().trim();
		System.out.println("3 String'den en b�y�g�n� bulmak i�in 1.String'i giriniz");
		String str3 = scan.nextLine().toLowerCase().trim();
		
	
		int str1Length = str1.length();
		int str2Length = str2.length();
		int str3Length = str3.length();
		
		if(str1Length>str2Length && str1Length>str3Length ) {
			System.out.println("1.kelime en uzundur, kelime uzunlu�u : "+ str1Length);
		}else if(str2Length>str3Length && str2Length>str1Length) {
			System.out.println("2.kelime en uzundur, kelime uzunlu�u : " + str2Length);
		}else if(str3Length>str1Length && str3Length>str1Length) {
			System.out.println("3.kelime en uzundur, kelime uzunlu�u : " + str3Length);
		}else if (str1Length == str2Length && str1Length>str3Length ) {
			System.out.println("1. ve 2. kelime uzunluklar� e�ittir ve en uzundur : " + str1Length );
		}else if (str2Length == str3Length && str2Length>str1Length ) {
			System.out.println("2. ve 3. kelime uzunluklar� e�ittir ve en uzundur : " +str2Length);
		}else if (str1Length == str3Length && str3Length>str1Length ) {
			System.out.println("2. ve 3. kelime uzunluklar� e�ittir ve en uzundur : "+ str3Length);
		}else if (str1Length == str3Length && str3Length==str1Length ) {
			System.out.println("T�m kelime uzunluk say�lar� e�ittir : " + str1Length );
		}
		
		
		
		
		
		
		scan.close();
	}

}
