package day11stringmethods;

import java.util.Scanner;

public class StringOdev06 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin ilk iki harfini b�y�k harf olarak ekrana yazd�r�n. 
		 */

	Scanner scan= new Scanner(System.in);
	System.out.println("Yasadiginiz �lkeyi giriniz");
    String ulke = scan.nextLine().toUpperCase();
	
	System.out.println(ulke.charAt(0) +"" + ulke.charAt(1));
	
	
    // 2.yol
	String ulke1 = scan.nextLine();
	
	ulke1 = ulke1.substring(0,2).toUpperCase();
	System.out.println(ulke1);
	
	scan.close();
	
	}

}
