package slayt12;

import java.util.Scanner;

public class OdevStringMethod02 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir String al�n ve bu String�in ilk harfi ile son harfinin yerlerini de�i�tirerek
          ekrana yazd�r�n.
          Ornegin; Kullan�c� �Java� girerse ekrana �aavJ� yazd�racaks�n�z.
		 */

	
		Scanner scan = new Scanner(System.in);
		System.out.println("bir string giriniz");
	    String s = scan.nextLine();
	
	
	s =  s.charAt(s.length()-1) + s.substring(1, s.length()-1) + s.charAt(0);
	
	System.out.println(s);
	
	scan.close();
	}

}
