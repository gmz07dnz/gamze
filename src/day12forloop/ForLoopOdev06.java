package day12forloop;

import java.util.Scanner;

public class ForLoopOdev06 {

	public static void main(String[] args) {
		
		/*
		 *Kullan�c�dan ba�lang�� ve biti� harflerini al�n.
		 *Ba�lang�� harfinden ba�lay�p biti� harfinde biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("baslang�c degeri i�in harf giriniz");
	    char bas = scan.next().toUpperCase().charAt(0);
	    System.out.println("bitis degeri i�in harf giriniz ");
		char bit =  scan.next().toUpperCase().charAt(0);
		
		
		if(bas <='Z' && bas>='A' && bit <='Z' && bit>='A') {
		if (bas<=bit) {
			for(char ch = bas ; ch<=bit; ch++) {
				System.out.println(ch);
			}
		} else {
			for (char ch = bas ; ch>=bit ; ch--)
			{
				System.out.println(ch);
			}
		}
		}else {
			System.out.println("l�tfen harf giriniz");
		}
		
		
		
	scan.close();	
		
		
		
		
		
		
		
		
		
		
	}

}
