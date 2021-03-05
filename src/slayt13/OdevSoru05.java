package slayt13;

import java.util.Scanner;

public class OdevSoru05 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýya bir String girmesini söyleyin ve bu String’i yukarýdan aþaðýya doðru yazdýran
          Program yazýnýz. 
          Ornegin; CAN ==> C
                           A
                           N
         */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("bir String giriniz");
		String s = scan.nextLine().toLowerCase(); 
		int u =s.length();
		
	for (int i =0; i<u; i++) {
		System.out.println(s.charAt(i));
	}
	
	scan.close();
	
	}

}
