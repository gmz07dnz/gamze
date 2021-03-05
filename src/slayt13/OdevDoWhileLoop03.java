package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop03 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya sayý girmesini söyleyin. Kullanýcý sýfýr girdiðinde, ekrana o ana kadar girmiþ olduðu
           tüm sayýlarýn toplamýný yazdýrýnýz.
           Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdýrýn

		 */

	
		Scanner scan = new Scanner(System.in);
		
		int top = 0;
		int i = 1;
		
		do {
			System.out.println("bir sayý giriniz");
			i = scan.nextInt();
			top+=i;
			
		}while(i !=0 );
	      System.out.println("Girmiþ oldugunuz sayýlaruýn toplamý: "+ top);
	
	
	      
	      scan.close();
	}

}
