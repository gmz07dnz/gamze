package me;

import java.util.Scanner;

public class UcSay�n�nBuyugu {

	public static void main(String[] args) {
		
	//	Ekrandan okunan 3 say�sal verinin en b�y���n� bularak ekrana yazd�ran bilgisayar program�n� Java programlama dilinde yaz�n�z.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("3 say�dan en buyugunu bulmak i�in 1.say�y� giriniz ");
	    double num1 = scan.nextDouble();	
	    System.out.println("3 say�dan en buyugunu bulmak i�in 2.say�y� giriniz ");
	    double num2 = scan.nextDouble();	
	    System.out.println("3 say�dan en buyugunu bulmak i�in 3.say�y� giriniz ");
	    double num3 = scan.nextDouble();	
	
	    if (num1>=num2 && num1>num3) {
	    	System.out.println("Girilen sayilarin en b�y��� "+ num1 +"'dir.");
	    } else if (num2>=num3 && num2>num1) {
	    	System.out.println("Girilen sayilarin en b�y��� "+ num2 +"'dir.");
	    } else if (num3 >=num1 && num3>num2) {
	    	System.out.println("Girilen sayilarin en b�y��� "+ num3 +"'dir.");
	    }else {
	    	System.out.println("degerlerinizi kontrol ediniz");
	    }
	    
	    
	   scan.close(); 
	    
	    
	}

}
