package day15variabletypesandmethodcreations;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan bir string alýn. Bu String'in içinde kac tane harf, kac tane rakam ,
		 *  kac tane harf dýsý ve kac tane rakam dýsý karakter oldugunu gösteren prog yazýnýz.
		 */
		
	Scanner scan = new Scanner (System.in);
	System.out.println("bir string giriniz");
		String s = scan.nextLine().toLowerCase();
		
	int	harfCounter = 0;
	int rakamCounter = 0;
	int digerCounter = 0;
	
	
	int i=0;
	do {
		if (s.charAt(i)>='a' && s.charAt(i)<='z') {
			harfCounter++;
		}else if (s.charAt(i)>='1' && s.charAt(i)<='9')	{
			rakamCounter++;
		}else {
			digerCounter++;
		}
		i++;
	}while(i <s.length());
	System.out.println("Harflerin sayýsý: " +harfCounter);	
	System.out.println("Rakamlarýn sayýsý: " +rakamCounter );
	System.out.println("Rakam ve harf dýsýndakýlerin sayýsý: " +digerCounter);
	
	scan.close();
		
		
		
		
		
	}

}
