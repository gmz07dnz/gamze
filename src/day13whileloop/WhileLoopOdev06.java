package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev06 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden
		 * baþlayýp bitiþ harfinde biten tüm harfleri büyük harf olarak ekrana yazdýrýn.
		 * Kullanýcýnýn hata yapmadýðýný farz edin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("baslangýc degeri için harf giriniz");
		char bas = scan.next().toUpperCase().charAt(0);
		System.out.println("bitis degeri icin harf giriniz");
		char bit = scan.next().toUpperCase().charAt(0);
		
		
		char ch = bas;
		if(bas<=bit) { 
			if(bas>='A' && bas<='Z' && bit>='A' && bit<='Z') {
			while (ch<=bit) {
				System.out.println(ch);
				ch++;
			}}
		}else {
			if(bas>='A' && bas<='Z' && bit>='A' && bit<='Z') {
			while(ch>=bit) {
				System.out.println(ch);
				ch--;
			}}
		}
	
		scan.close();
		
		
		
		
		
		
		
	}

}
