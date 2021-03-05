package day09switch;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan A, B, C, D harflerinden birini al�n. 
		 * E�er harf C ise ekrana �Do�ru cevap� yazd�r�n. 
		 * A, B, D den biri ise ekrana �Yanl�� cevap� yazd�r�n.
		 * Bu harflerin d���ndaki harfler i�in �Ge�ersiz cevap ��kk�� yazd�r�n.
		 */

   Scanner scan = new Scanner(System.in);
   System.out.println("A, B, C, D harflerinden birini giriniz.");
		
   char h = scan.next().toUpperCase().charAt(0);
   
   // Switch ile
   
   switch (h) {
   
   case ('A'):
   case ('B'):
   case ('D'):
	   System.out.println("Yanl�� cevap");
   break;
   case ('C'):
	   System.out.println("Do�ru cevap");
   break;
   default:
	   System.out.println("Ge�ersiz cevap ��kk�");	   
     }
		
		
   // �f ile 
   
   if (h=='A' || h== 'B' || h == 'D') {
	   System.out.println("Yanl�� cevap");
   }else if (h == 'C') {
	   System.out.println("Do�ru cevap");
   }else {
	   System.out.println("Ge�ersiz cevap ��kk�");
   }
		
	
   // Ternary ile 
   
  String result = h=='A' || h== 'B' || h == 'D' ? "Yanl�� cevap" : h == 'C' ? "Do�ru cevap" : "Ge�ersiz cevap ��kk�";
   
   System.out.println(result);
   
   
   scan.close();
	}

}
