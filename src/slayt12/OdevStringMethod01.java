package slayt12;

import java.util.Scanner;

public class OdevStringMethod01 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan uzunlu�u �ift say� olan bir String al�n ve bu String�in ilk yar�s�n� ekrana yazd�r�n.
           Ornegin; Kullan�c� �Hollanda� girerse ekrana �Holl� yazd�racaks�n�z.
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Karakter say�s� cift say� olan bir string giriniz");
	    String s = scan.nextLine();
	    
	    if (s.length()%2==0) {
	    	s = s.substring(0, s.length()/2);
	    	System.out.println(s);
	    	
	    }
	    	
	scan.close();
	
	
	}

}
