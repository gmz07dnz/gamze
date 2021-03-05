package slayt12;

import java.util.Scanner;

public class OdevStringMethod03 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün
           indexini ekrana yazdýrýn. “a” harfi yoksa ekrana “a harfi yok” yazdýrýn.
		 */

	
		Scanner scan = new Scanner(System.in);
		System.out.println("bir string giriniz");
	    String s = scan.nextLine().toLowerCase();
	 
	    
	   
	   
	    
	    
	    
	    if (s.contains("a")) {
	    	 
	    	System.out.println(s.indexOf('a',0));
	}else {
		System.out.println("a harfi yoktur");
	}
	
	
	
	
	scan.close();
	
	
	}

}
