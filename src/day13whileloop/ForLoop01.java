package day13whileloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ  harflerini alýn 
		 * ve baþlangýç harfinden baþlayýp bitiþ harfinde biten tüm harfleri büyük harf olarak ekrana yazdýrýn.	
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangýç harfi giriniz");
		char bas = scan.next().toUpperCase().charAt(0);
		
		System.out.println("bitis harfi giriniz");
		char bit = scan.next().toUpperCase().charAt(0);
		
		
		
if (!(bas>='A' && bas<='Z' && bit>='A' && bit<='Z')) {
			
			System.out.println("Lütfen harf giriniz");
			
		}else if (bas<=bit) {
		
			for(char i = bas ; i<=bit ; i++) {
			System.out.print(i + " ");
		}
		} else {
			
			for(char i = bas ; i>=bit ; i--) {
				System.out.print(i + " ");
			
		}
		
		}
			
			
			scan.close();	
		
		}
		
		
			
	}


