package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop02 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
         biten 4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini yazýnýz");
		int bit = scan.nextInt();
		
		int i = bas;
		if(bas<=bit) {
		
		do {
			if(i%4 == 0 && i%6 == 0) {
			System.out.println(i);
			}
		i++;
		} while(i<=bit);
		}else {
			do {if(i%4 == 0 && i%6 == 0) {
				System.out.println(i);	
		}
		i--;
		} while (i>=bit);
		}
		
	scan.close();	
		
		}

}
