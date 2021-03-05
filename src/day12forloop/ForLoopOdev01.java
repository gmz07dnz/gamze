package day12forloop;

import java.util.Scanner;

public class ForLoopOdev01 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn . 
		 * Baþlangýç deðerinden baþlayýp bitiþ deðerinde biten tüm tamsayýlarý ekrana yazdýrýn.
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Baslangic degerini giriniz");
	int bas = scan.nextInt();
	System.out.println("Bitis degerini yazýnýz");
	int bit = scan.nextInt();
	
	if (bas<=bit) {
	for (int i = bas ; i<=bit; i++) {
		System.out.println(i);
	}
	}else {
		for (int i = bas ; i>=bit; i-- ) {
			System.out.println(i);
		}
	}
	
	scan.close();
	
	}

}
