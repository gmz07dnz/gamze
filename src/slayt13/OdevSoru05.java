package slayt13;

import java.util.Scanner;

public class OdevSoru05 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�ya bir String girmesini s�yleyin ve bu String�i yukar�dan a�a��ya do�ru yazd�ran
          Program yaz�n�z. 
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
