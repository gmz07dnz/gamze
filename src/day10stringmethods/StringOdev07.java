package day10stringmethods;

import java.util.Scanner;

public class StringOdev07 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter a letter, 
		 * if it is uppercase check it is before “F” or not in alphabetical order. 
		 * If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be “Big after F.” 
		 * If it is lowercase check it is before “h” or not in alphabetical order. 
		 * If it is before “h” in alphabetical order output will be “Small before h”, 
		 * otherwise “Small after h”
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("lütfen bir harf giriniz");
	char h = scan.next().charAt(0);
	
	if ((h>='A' && h<='Z') || (h>='a' && h<= 'z') ) {
	
	if (h>='A' && h<='Z') {
		if ( h<'F') {
			System.out.println("F'den önce büyük harf");
		}else {
			System.out.println("F'den sonra büyük harf");
		}
	}
	if (h>='a' && h<= 'z') {
		
		if ( h<'h') {
			System.out.println("h harfinden önce küçük harf");
		}else {
			System.out.println("h harfinden sonra büyük harf");
		}
	}
	} else { 
		System.out.println("Lütfen bir harf giriniz");
	}
	
	
	scan.close();
	
	}

}
