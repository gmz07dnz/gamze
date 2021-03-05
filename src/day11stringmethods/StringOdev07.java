package day11stringmethods;

import java.util.Scanner;

public class StringOdev07 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan yaþadýðý ülkenin ismini alýn 
		 * bu ülkenin bastan ikinci harfi ile sondan ikinci harfini büyük harf olarak ekrana yazdýrýn.
		 */

	
		Scanner scan= new Scanner(System.in);
		System.out.println("Yasadiginiz ülkeyi giriniz");
	    
		String ulke = scan.nextLine().toUpperCase();
		System.out.println("Baþtan ikinci harfi: "+ ulke.charAt(1)+"\n" + "Sondan ikinci harfi: "+ ulke.charAt(ulke.length()-2) );
		
		
		
		// 2.yol
		  String ulke1 = scan.nextLine();
		  
		System.out.println("Baþtan ikinci harfi: "+ ulke1.substring(1,2).toUpperCase()+"\n"+ "Sondan ikinci harfi: "+ ulke1.substring(ulke1.length()-2,ulke1.length()-1).toUpperCase() );  
		
	
	scan.close();
	
	
	
	
	
	
	}

}
