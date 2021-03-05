package me;

import java.util.Scanner;

public class IntegerTersten {

	public static void main(String[] args) {
		
		/*
		 * Klavyeden okunan bir integer sayýyý basamak basamak ve tersten ekrana yazdýran bilgisayar programýný yazýnýz.

		 */

//	Scanner scan = new Scanner(System.in);
//	System.out.println("Bir sayi giriniz");
//	String sayi =scan.next();
//	String arr[] = sayi.split("");
//	
//	System.out.println("Girilen sayi: "+ sayi);
//	System.out.print("Girilen sayinin tersi: ");
//	for (int i = arr.length-1; i>=0; i--) {
//		System.out.print(arr[i]);
//	}
	
	
	// 2.yol
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir sayi giriniz");
	int sayi =scan.nextInt();
	System.out.println("Girilen sayi: "+ sayi);
	
	int temp =0;
	int result = 0;
	
	
	while (sayi>0) {
		
		temp =sayi%10;  // birler basamagý
		sayi/=10;       // diyelim ki sayi 123 => sayi/=10;
		result = result*10 + temp ;
  }
	System.out.println("Girilen sayinin tersi: "+ result);
	
	
	scan.close();
	}

}
