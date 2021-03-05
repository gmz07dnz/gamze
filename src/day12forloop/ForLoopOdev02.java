package day12forloop;

import java.util.Scanner;

public class ForLoopOdev02 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn. 
		 * Baþlangýç deðerinden veya sonrasýnda baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý ekrana yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini yazýnýz");
		int bit = scan.nextInt();
		

		if (bas<=bit) {
		for (int i = bas ; i<=bit; i++) {
			if(i%2==0) {
			System.out.println(i);}
		}
		}else{
			for (int i =bit ; i<=bas ; i++ ) {
				if(i%2 == 0) {
				System.out.println(i);}
			}
		} 
	
	
	scan.close();
	
	
	}

}
