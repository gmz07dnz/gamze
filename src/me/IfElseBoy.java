package me;

import java.util.Scanner;

public class IfElseBoy {

	public static void main(String[] args) {

		/*
		 * Klavyeden bir boy uzunlu�u isteyiniz. 
		 * 175�e e�it veya k���kse ekrana �KISA BOYLUSUNUZ.�
		 * 175�den b�y�kse ekrana �UZUN BOYLUSUNUZ".
		 *  mesaj�n� yazd�racak �ekilde program� yaz�n�z.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyunuzu cm cinsinden giriniz");
	    int boy = scan.nextInt();
	    
	    if (boy <=0) {
	    	System.out.println("L�tfen dogru bir deger giriniz"); }
	    
	    else if(boy<=175) {
	    	System.out.println("Kisa Boylusunuz");
	    }else {
	    	System.out.println("Uzun Boylusunuz");
	    }
	
	    scan.close();
	}

}
