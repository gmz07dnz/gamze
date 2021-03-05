package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev04 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden
		 * baþlayýp bitiþ deðerinde biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangýc degeri için tamsayý giriniz");
		int bas = scan.nextInt();
		System.out.println("bitis degeri icin tamsayý giriniz");
		int bit = scan.nextInt();
		
		int top = 0;
		int i = bas;
		 if (bas<= bit) {
			 while(i<=bit) {
				 top+=i;
				 i++;
			 }System.out.println("Girilen degerler arasýndaki tamsayýlarýn toplamý: "+ top);
		 }else {
			 while(i>=bit) {
				 top+=i;
				 i--;
			 }System.out.println("Girilen degerler arasýndaki tamsayýlarýn toplamý: "+ top);
		 }
	
	scan.close();
	
	
	
	}

}
