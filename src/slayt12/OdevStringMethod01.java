package slayt12;

import java.util.Scanner;

public class OdevStringMethod01 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan uzunluðu çift sayý olan bir String alýn ve bu String’in ilk yarýsýný ekrana yazdýrýn.
           Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Karakter sayýsý cift sayý olan bir string giriniz");
	    String s = scan.nextLine();
	    
	    if (s.length()%2==0) {
	    	s = s.substring(0, s.length()/2);
	    	System.out.println(s);
	    	
	    }
	    	
	scan.close();
	
	
	}

}
