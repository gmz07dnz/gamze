package slayt12;

import java.util.Scanner;

public class OdevStringMethod03 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan bir String al�n ve bu String�in icinde �a� harfi varsa �a� harfinin ilk g�r�n�m�n�n
           indexini ekrana yazd�r�n. �a� harfi yoksa ekrana �a harfi yok� yazd�r�n.
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
