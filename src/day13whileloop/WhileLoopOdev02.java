package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev02 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn  
		 * baþlangýç deðerinden baþlayýp bitiþ deðerinde biten tüm tamsayýlarý 
		 * while loop kullanarak ekrana yazdýrýnýz.
		 * 
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("baslangýc degeri için tamsayý giriniz");
	int bas = scan.nextInt();
	System.out.println("bitis degeri icin tamsayý giriniz");
	int bit = scan.nextInt();
	
	int i = bas;
	
	if (bas<=bit) {
	while(i<=bit) {
		System.out.println(i);
	i++;
	}
	}else {
		while (i>=bit) {
		System.out.println(i);
		i--;}
	}
		
scan.close();	
	
	
	
	
	
	
	
	
	
	}

}
