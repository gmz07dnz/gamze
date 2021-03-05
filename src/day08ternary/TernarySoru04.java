package day08ternary;

import java.util.Scanner;

public class TernarySoru04 {

	public static void main(String[] args) {
		
	/*
	Kullanýcýdan bir harf alýn eðer harf büyük harf ise ekrana “Büyük harf” yazdýrýn.
    Diðer durumlarda ekrana “Büyük harf degil” yazdýrýn.	 
    */
	
	
	// If ile çözelim
		
/*	Scanner scan = new Scanner(System.in);
	System.out.println("bir harf giriniz");
	char ch = scan.next().charAt(0);
	
	if(ch<='Z' && ch>='A') {
		System.out.println("Büyük Harf");
	}else 
		System.out.println("Büyük harf degil");
*/
	
	
   // Ternary ile çözelim
	Scanner scan = new Scanner(System.in);
	System.out.println("bir harf giriniz");
	char ch = scan.next().charAt(0);	
	
	String result = ch<='Z' && ch>='A' ? "Büyük Harf" : "Büyük harf degil";
	
	System.out.println(result);
	
   scan.close();
	
	}

}
