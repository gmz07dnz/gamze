package day12forloop;

import java.util.Scanner;

public class ForLoopOdev04 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn. 
		 * Baþlangýç deðerinden baþlayýp bitiþ deðerinde biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.

		 */

		
	Scanner scan = new Scanner(System.in);
	System.out.println("baslangýc degeri için tamsayý giriniz");
		int bas = scan.nextInt();
		System.out.println("bitis degeri için tam sayý giriniz ");
		int bit = scan.nextInt();
		int top = 0;
		
		if (bas<=bit) {
			for(int i = bas ; i <= bit; i++) {
				top+=i;
			}System.out.println(bas + " ile " + bit + " degerleri arasýndaký tam sayýlarýn toplamý: " + top);
		}else {
			for (int i = bas; i >=bit; i--) {
				top+=i;
			}System.out.println(bas + " ile " + bit + " degerleri arasýndaký tam sayýlarýn toplamý: " + top);
			
		}
			
		
	scan.close();	
		
		
		
		
		
		
		
		
	}

}
