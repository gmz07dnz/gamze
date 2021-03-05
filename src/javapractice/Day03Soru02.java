package javapractice;

import java.util.Scanner;

public class Day03Soru02 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan bir cumle ve bir harf alin, Cumlede harfin kac kere
		 * kullanildigini bulup, yazdirin 
		 * 
		 * ORNEK:
		 *  
		 * INPUT : Cumle: Java ogrenmek cok guzel.Harf :e
		 * 
		 * OUTPUT : Girdiginiz cumlede ‘e’ harfi 3 kere kullanilmis.
		 * 
		 */
		
		
	// 1- Kullanicidan bir cumle ve bir harf alin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir cümle giriniz");
		String cumle = scan.nextLine();
		
		System.out.println("Bir harf giriniz");
		String harf = scan.next().substring(0, 1);
		
	
		// 2- Cumlede harfin kac kere kullanildigini bulup, yazdirin 
		
		int count = 0;
		
		for ( int i = 0 ; i<cumle.length(); i++) {
			if(cumle.substring(i,i+1).equalsIgnoreCase(harf)) {
				count++; 	
			}
		}
		
		System.out.println("girdiginiz cümlede '" +harf+ "' harfi " +count+ " kere kullanýlmýs");
		
		
	scan.close();	

	}

}
