package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop06 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan bir String al�n ve bu String�in icinde �a� harfi varsa ekrana �a harfi var� yazd�r�n.
          �a� harfi yoksa tekrar bir String girmesini isteyin.
		 */

	
	
		Scanner scan = new Scanner(System.in);
		String s = "";
	
		do {
			
			System.out.println("bir string giriniz");
			s= scan.nextLine();
			
		}while(!(s.contains("a")));
		
		System.out.println("Girdi�iniz String'de 'a' harfi vard�r.");
		
	scan.close();
		
		
	}

}
