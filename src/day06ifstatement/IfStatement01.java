package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {

 /*
  if it rains I will cancel picnic 
 */
		
// javada pozitif seyler true g�z�k�r , negatifler false g�z�k�r.
		

		Scanner scan = new Scanner(System.in);	
		System.out.println("L�tfen iki sayi giriniz ");	
		double a= scan.nextDouble(); // 12
		double b = scan.nextDouble(); // 25	
		
	
		
  if(a>b) { 
	  System.out.println("ilk sayi b�y�k");
	  
  }
		
	if(a<b) {
		System.out.println("ikinci sayi b�y�k");
	}
		
	if(a==b) {
		System.out.println("iki sayi birbirine e�it");
	}
		
		
	scan.close();	
		
		

	}

}
