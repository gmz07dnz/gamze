package day14whiledowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan sayi aliniz.
		 * sayi 10'dan küçükse ekrana "kazandýnýz!" yazdýrýn.
		 * sayý 10 veya 10'dan büyükse ekrana "sayý giriniz" yazdýrýn
		 */
		
	Scanner scan = new Scanner(System.in);
	int s= 0;
	
	do {
		System.out.println("sayi giriniz ");
		s= scan.nextInt();
	}while(s>=10);
		
	System.out.println("Kazandýnýz!");

	
	
scan.close();
	}

}
