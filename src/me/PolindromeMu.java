package me;

import java.util.Scanner;

public class PolindromeMu {

	public static void main(String[] args) {

		/*
		 * Klavyeden okunan bir string ifadenin palindrome(tersten okununca da ayn�)
		 * olup olmad���n� kontrol eden bilgisayar program�n� Java dilinde yaz�n�z.
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("Polindrome olup olmad�g�n� kontrol etmek i�in bir String giriniz");
	    String polindromeMu = scan.nextLine().toLowerCase();
	    
//	    StringBuilder sb = new StringBuilder(polindromeMu);
//	    
//	    sb.reverse();
//	   
//	    if(sb.toString().equals(polindromeMu)) {
//	    	System.out.println("Girilen String'in tersi: "+ sb+ "'dir ve polindrome'd�r");
//	    }else {
//	    	System.out.println("Girilen String'in tersi: "+ sb+ "'dir ve polindrome degildir");
//	    }
	  
	   
	   String ters="";
	    for(int i =polindromeMu.length()-1; i>=0; i-- ) {
	    	 ters= ters+polindromeMu.charAt(i);
	    }
	    
	    
	    if(ters.equals(polindromeMu)) {
    	System.out.println("Girilen String'in tersi: "+ ters+ "'dir ve polindrome'd�r");	    
    	}else {
    	System.out.println("Girilen String'in tersi: "+ ters+ "'dir ve polindrome degildir");
	    }
	
	scan.close();
	
	}

}
