package me;

import java.util.Scanner;

public class IfElseBoy {

	public static void main(String[] args) {

		/*
		 * Klavyeden bir boy uzunluðu isteyiniz. 
		 * 175’e eþit veya küçükse ekrana ‘KISA BOYLUSUNUZ.’
		 * 175’den büyükse ekrana “UZUN BOYLUSUNUZ".
		 *  mesajýný yazdýracak þekilde programý yazýnýz.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyunuzu cm cinsinden giriniz");
	    int boy = scan.nextInt();
	    
	    if (boy <=0) {
	    	System.out.println("Lütfen dogru bir deger giriniz"); }
	    
	    else if(boy<=175) {
	    	System.out.println("Kisa Boylusunuz");
	    }else {
	    	System.out.println("Uzun Boylusunuz");
	    }
	
	    scan.close();
	}

}
