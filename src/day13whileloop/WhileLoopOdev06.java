package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev06 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden
		 * ba�lay�p biti� harfinde biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n.
		 * Kullan�c�n�n hata yapmad���n� farz edin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("baslang�c degeri i�in harf giriniz");
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
