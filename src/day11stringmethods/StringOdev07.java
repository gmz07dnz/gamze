package day11stringmethods;

import java.util.Scanner;

public class StringOdev07 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan ya�ad��� �lkenin ismini al�n 
		 * bu �lkenin bastan ikinci harfi ile sondan ikinci harfini b�y�k harf olarak ekrana yazd�r�n.
		 */

	
		Scanner scan= new Scanner(System.in);
		System.out.println("Yasadiginiz �lkeyi giriniz");
	    
		String ulke = scan.nextLine().toUpperCase();
		System.out.println("Ba�tan ikinci harfi: "+ ulke.charAt(1)+"\n" + "Sondan ikinci harfi: "+ ulke.charAt(ulke.length()-2) );
		
		
		
		// 2.yol
		  String ulke1 = scan.nextLine();
		  
		System.out.println("Ba�tan ikinci harfi: "+ ulke1.substring(1,2).toUpperCase()+"\n"+ "Sondan ikinci harfi: "+ ulke1.substring(ulke1.length()-2,ulke1.length()-1).toUpperCase() );  
		
	
	scan.close();
	
	
	
	
	
	
	}

}
