package day12forloop;

import java.util.Scanner;

public class ForLoopOdev06 {

	public static void main(String[] args) {
		
		/*
		 *Kullanýcýdan baþlangýç ve bitiþ harflerini alýn.
		 *Baþlangýç harfinden baþlayýp bitiþ harfinde biten tüm harfleri büyük harf olarak ekrana yazdýrýn.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangýc degeri için harf giriniz");
	    char bas = scan.next().toUpperCase().charAt(0);
	    System.out.println("bitis degeri için harf giriniz ");
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
			System.out.println("lütfen harf giriniz");
		}
		
		
		
	scan.close();	
		
		
		
		
		
		
		
		
		
		
	}

}
