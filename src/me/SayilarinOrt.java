package me;

import java.util.Scanner;

public class SayilarinOrt {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan (negatif bir sayý girinceye kadar) pozitif sayýlar alarak bu
		 * sayýlarýn ortalamasýný ekrana yazdýran bir program yazýnýz.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int i ;
		int average = 0;
		int counter=0;
		
		do {
			System.out.println("Ortalamasýný hesaplamak için sayý giriniz.\nNegatif bir sayý girdiðinizde iþlem sona erecektir." );
		    i = scan.nextInt();
		    if(i>=0) {
		    counter++;
		    average = (average+i)/counter;}
		     
		}while (i>=0);
		
		System.out.println(counter + " adet sayi girdiniz.");
		System.out.println("Girilen sayýlarýn ortalamasý: "+ average);
		
		scan.close();
		
		
		

	}

}
