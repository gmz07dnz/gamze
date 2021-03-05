package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop06 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdýrýn.
          “a” harfi yoksa tekrar bir String girmesini isteyin.
		 */

	
	
		Scanner scan = new Scanner(System.in);
		String s = "";
	
		do {
			
			System.out.println("bir string giriniz");
			s= scan.nextLine();
			
		}while(!(s.contains("a")));
		
		System.out.println("Girdiðiniz String'de 'a' harfi vardýr.");
		
	scan.close();
		
		
	}

}
