package day12forloop;

import java.util.Scanner;

public class ForLoopOdev05 {

	public static void main(String[] args) {
		
		
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn 
		 * Baþlangýç deðerinden baþlayýp bitiþ deðerinde biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("baslangýc degerini tam sayý olarak giriniz");
	int bas = scan.nextInt();
	System.out.println("bitis degerini tam sayý olarak giriniz");
	int bit = scan.nextInt();
	int carpim = 1;
	
	if (bas <=bit) {
   for(int i = bas; i<=bit ; i++) {
	   carpim*=i;
   }System.out.println(bas + " ile " + bit + " degerleri arasýndaký tam sayýlarýn carpýmý: " + carpim);
	
	}else {
		for (int i = bas ; i>=bit ; i--) {
			carpim*=i;
		}System.out.println(bas + " ile " + bit + " degerleri arasýndaký tam sayýlarýn carpýmý: " + carpim);
		
	}
	
scan.close();	
	}

}
