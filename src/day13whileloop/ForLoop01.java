package day13whileloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan ba�lang�� ve biti�  harflerini al�n 
		 * ve ba�lang�� harfinden ba�lay�p biti� harfinde biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n.	
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baslang�� harfi giriniz");
		char bas = scan.next().toUpperCase().charAt(0);
		
		System.out.println("bitis harfi giriniz");
		char bit = scan.next().toUpperCase().charAt(0);
		
		
		
if (!(bas>='A' && bas<='Z' && bit>='A' && bit<='Z')) {
			
			System.out.println("L�tfen harf giriniz");
			
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


