package day06ifstatement;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
  
		/*
		 if it rains I will go to Mall else I will go to picnic
		 */

       Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen pozitif bir tamsayi girin");
		int num = scan.nextInt();
	
		
		// if else sadece bir tane condition i�erir, ikili if ise iki tane condition i�erir.
		// java her condition'� kontrol etmek zorundad�r. iki condition'� kontrol etmek daha
		// uzun zaman gerektirir. Bu da Java'y� yava�lat�r.
	if(num >= 0) {
		System.out.println("Negatif De�il");
	}
	else {
		System.out.println("Negatif");
		
	}
	System.out.println("============");
	
	if(num >= 0) {
		System.out.println("Negatif De�il");
	}
	
	if(num < 0) {
		System.out.println("Negatif");
	}
	
	scan.close();
	
	
	}

}
