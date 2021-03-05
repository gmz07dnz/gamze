package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop04 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýya iki sayý girmesini söyleyin. Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn.
          Eþit deðilse tekrar iki sayý girmesini söyleyin.
		 */

	
		Scanner scan = new Scanner(System.in);
		
	   int num1 =0;
	   int num2 =0;
		
	do {
		System.out.println("1.sayýyý giriniz");
		 num1 = scan.nextInt();
		System.out.println("2. sayýyý giriniz");
		 num2 = scan.nextInt();
		
		
	}while(!(num1 == num2));
		System.out.println("kare olusturdunuz");
		
	
	
scan.close();

	}

}
