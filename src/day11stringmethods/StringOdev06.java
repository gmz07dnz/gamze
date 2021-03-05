package day11stringmethods;

import java.util.Scanner;

public class StringOdev06 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdýrýn. 
		 */

	Scanner scan= new Scanner(System.in);
	System.out.println("Yasadiginiz ülkeyi giriniz");
    String ulke = scan.nextLine().toUpperCase();
	
	System.out.println(ulke.charAt(0) +"" + ulke.charAt(1));
	
	
    // 2.yol
	String ulke1 = scan.nextLine();
	
	ulke1 = ulke1.substring(0,2).toUpperCase();
	System.out.println(ulke1);
	
	scan.close();
	
	}

}
