package day08ternary;

import java.util.Scanner;

public class TernarySoru04 {

	public static void main(String[] args) {
		
	/*
	Kullan�c�dan bir harf al�n e�er harf b�y�k harf ise ekrana �B�y�k harf� yazd�r�n.
    Di�er durumlarda ekrana �B�y�k harf degil� yazd�r�n.	 
    */
	
	
	// If ile ��zelim
		
/*	Scanner scan = new Scanner(System.in);
	System.out.println("bir harf giriniz");
	char ch = scan.next().charAt(0);
	
	if(ch<='Z' && ch>='A') {
		System.out.println("B�y�k Harf");
	}else 
		System.out.println("B�y�k harf degil");
*/
	
	
   // Ternary ile ��zelim
	Scanner scan = new Scanner(System.in);
	System.out.println("bir harf giriniz");
	char ch = scan.next().charAt(0);	
	
	String result = ch<='Z' && ch>='A' ? "B�y�k Harf" : "B�y�k harf degil";
	
	System.out.println(result);
	
   scan.close();
	
	}

}
