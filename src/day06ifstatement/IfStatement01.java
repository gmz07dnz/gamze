package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {

 /*
  if it rains I will cancel picnic 
 */
		
// javada pozitif seyler true gözükür , negatifler false gözükür.
		

		Scanner scan = new Scanner(System.in);	
		System.out.println("Lütfen iki sayi giriniz ");	
		double a= scan.nextDouble(); // 12
		double b = scan.nextDouble(); // 25	
		
	
		
  if(a>b) { 
	  System.out.println("ilk sayi büyük");
	  
  }
		
	if(a<b) {
		System.out.println("ikinci sayi büyük");
	}
		
	if(a==b) {
		System.out.println("iki sayi birbirine eþit");
	}
		
		
	scan.close();	
		
		

	}

}
