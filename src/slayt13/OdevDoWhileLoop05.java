package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop05 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�ya bir String girmesini s�yleyin ve bu String�in ilk harfi ile son harfi ayn� ise
           ekrana �Simetrik� yazd�r�n. Ayn� de�ilse tekrar bir String girmesini isteyin.
		 */

	
		Scanner scan = new Scanner(System.in);
		String s = "";
		
		do {
			System.out.println("bir string giriniz");
			 s = scan.nextLine();
			
		}while((s.charAt(0)) != (s.charAt(s.length()-1)));
          System.out.println("Simetrik");	
	
	
	scan.close();
	
	}

}
