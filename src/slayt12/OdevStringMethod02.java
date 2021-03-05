package slayt12;

import java.util.Scanner;

public class OdevStringMethod02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir String alýn ve bu String’in ilk harfi ile son harfinin yerlerini deðiþtirerek
          ekrana yazdýrýn.
          Ornegin; Kullanýcý “Java” girerse ekrana “aavJ” yazdýracaksýnýz.
		 */

	
		Scanner scan = new Scanner(System.in);
		System.out.println("bir string giriniz");
	    String s = scan.nextLine();
	
	
	s =  s.charAt(s.length()-1) + s.substring(1, s.length()-1) + s.charAt(0);
	
	System.out.println(s);
	
	scan.close();
	}

}
