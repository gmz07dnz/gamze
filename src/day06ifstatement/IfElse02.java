package day06ifstatement;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir karakter aliniz.
		 bu karakter harf ise console'a  
		 */

Scanner scan = new Scanner(System.in);	
		
	System.out.println("Lütfen bir karakter giriniz");	
	char ch = scan.next().charAt(0);
	
	if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
		System.out.println("Harf");
	}
		
	else {
		System.out.println("Harf Degil");
	}
		
		scan.close();
		
	}

}
