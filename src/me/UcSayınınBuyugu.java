package me;

import java.util.Scanner;

public class UcSayýnýnBuyugu {

	public static void main(String[] args) {
		
	//	Ekrandan okunan 3 sayýsal verinin en büyüðünü bularak ekrana yazdýran bilgisayar programýný Java programlama dilinde yazýnýz.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("3 sayýdan en buyugunu bulmak için 1.sayýyý giriniz ");
	    double num1 = scan.nextDouble();	
	    System.out.println("3 sayýdan en buyugunu bulmak için 2.sayýyý giriniz ");
	    double num2 = scan.nextDouble();	
	    System.out.println("3 sayýdan en buyugunu bulmak için 3.sayýyý giriniz ");
	    double num3 = scan.nextDouble();	
	
	    if (num1>=num2 && num1>num3) {
	    	System.out.println("Girilen sayilarin en büyüðü "+ num1 +"'dir.");
	    } else if (num2>=num3 && num2>num1) {
	    	System.out.println("Girilen sayilarin en büyüðü "+ num2 +"'dir.");
	    } else if (num3 >=num1 && num3>num2) {
	    	System.out.println("Girilen sayilarin en büyüðü "+ num3 +"'dir.");
	    }else {
	    	System.out.println("degerlerinizi kontrol ediniz");
	    }
	    
	    
	   scan.close(); 
	    
	    
	}

}
