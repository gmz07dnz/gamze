package javapractice;

import java.util.Scanner;

public class Day01Soru07 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan 3 kelime isyeyin ve cumle olarak yazd�r�n.
		 * Sonuna "." koyun
		 * 
		 *  �rnek : 
		 *  �nputs : Ali, topu, tut
		 *  output: Ali topu tut.
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("C�mle olusturmak i�in 3 kelimeden 1.sini yaz�n�z");
	String word1 = scan.next();
	System.out.println("C�mle olusturmak i�in 3 kelimeden 2.sini yaz�n�z");
	String word2 = scan.next();
	System.out.println("C�mle olusturmak i�in 3 kelimeden 3.s�n� yaz�n�z");
	String word3 = scan.next();	
		
	System.out.println(word1+" "+word2+" "+word3+".");	
		
	
	scan.close();
	
	
	}

}
