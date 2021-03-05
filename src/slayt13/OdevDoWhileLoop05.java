package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop05 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýya bir String girmesini söyleyin ve bu String’in ilk harfi ile son harfi ayný ise
           ekrana “Simetrik” yazdýrýn. Ayný deðilse tekrar bir String girmesini isteyin.
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
