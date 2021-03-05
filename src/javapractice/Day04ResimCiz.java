package javapractice;

import java.util.Scanner;

public class Day04ResimCiz {

	public static void main(String[] args) {
		
		
		/*
		 * SORU 1) Kullanicidan bir sayi isteyin, Girilen sayiya gore asagidaki sekli
		 * cizdiren bir method olusturun ORNEK: INPUT : satir sayisi: 10 OUTPUT : 
		 * 1 
		 * 12
		 * 123 
		 * 1234 
		 * 12345 
		 * 123456 
		 * 1234567 
		 * 12345678 
		 * 123456789 
		 * 12345678910
		 */

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		
		resimciz(num);
		
		
		
	} // main method

	public static void resimciz(int num) {
	
	
	for(int i =1 ; i<=num ; i++) {
	
		for(int k= 1; k<=i ; k++) {
		System.out.print(k);
		
	}
		System.out.println();
	}
	
	
	
	
	}
	
	
} // class
