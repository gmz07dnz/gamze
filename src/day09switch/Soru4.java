package day09switch;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan A, B, C, D harflerinden birini alýn. 
		 * Eðer harf C ise ekrana “Doðru cevap” yazdýrýn. 
		 * A, B, D den biri ise ekrana “Yanlýþ cevap” yazdýrýn.
		 * Bu harflerin dýþýndaki harfler için “Geçersiz cevap þýkký” yazdýrýn.
		 */

   Scanner scan = new Scanner(System.in);
   System.out.println("A, B, C, D harflerinden birini giriniz.");
		
   char h = scan.next().toUpperCase().charAt(0);
   
   // Switch ile
   
   switch (h) {
   
   case ('A'):
   case ('B'):
   case ('D'):
	   System.out.println("Yanlýþ cevap");
   break;
   case ('C'):
	   System.out.println("Doðru cevap");
   break;
   default:
	   System.out.println("Geçersiz cevap þýkký");	   
     }
		
		
   // Ýf ile 
   
   if (h=='A' || h== 'B' || h == 'D') {
	   System.out.println("Yanlýþ cevap");
   }else if (h == 'C') {
	   System.out.println("Doðru cevap");
   }else {
	   System.out.println("Geçersiz cevap þýkký");
   }
		
	
   // Ternary ile 
   
  String result = h=='A' || h== 'B' || h == 'D' ? "Yanlýþ cevap" : h == 'C' ? "Doðru cevap" : "Geçersiz cevap þýkký";
   
   System.out.println(result);
   
   
   scan.close();
	}

}
