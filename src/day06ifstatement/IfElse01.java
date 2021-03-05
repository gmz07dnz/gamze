package day06ifstatement;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
  
		/*
		 if it rains I will go to Mall else I will go to picnic
		 */

       Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen pozitif bir tamsayi girin");
		int num = scan.nextInt();
	
		
		// if else sadece bir tane condition içerir, ikili if ise iki tane condition içerir.
		// java her condition'ý kontrol etmek zorundadýr. iki condition'ý kontrol etmek daha
		// uzun zaman gerektirir. Bu da Java'yý yavaþlatýr.
	if(num >= 0) {
		System.out.println("Negatif Deðil");
	}
	else {
		System.out.println("Negatif");
		
	}
	System.out.println("============");
	
	if(num >= 0) {
		System.out.println("Negatif Deðil");
	}
	
	if(num < 0) {
		System.out.println("Negatif");
	}
	
	scan.close();
	
	
	}

}
