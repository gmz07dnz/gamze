package slayt12;

import java.util.Scanner;

public class OdevForVeWhileLoop02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve 
		 * baþlangýç deðerinden baþlayýp bitiþ deðerinde biten 3 ve 5 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini yazýnýz");
		int bit = scan.nextInt();	
	
	// for loop
	
	if (bas<=bit) {
	for (int i = bas; i<= bit; i++ ) {
		if( i%3 == 0 && i%5 == 0 ) {
			System.out.println(i);
		}
	}
	}else {
	for (int i = bas ; i>=bit; i--) {
		if (i%5 == 0 && i%3 == 0) {
			System.out.println(i);
		}
		
	}
	
	}
	
	
	// while loop 
	
		int i = bas;
	if (bas<=bit) {
		
	while (i<=bit) {
		if (i%3 == 0 && i%5 ==0) {
			System.out.println(i);
		}
		i++;
	}
	}else {
		
		while(i>=bit) {
			if(i%5 == 0 && i%3 == 0) {
				System.out.println(i);
			}
			i--;} 
	}
	
	scan.close();
	
	}

}
