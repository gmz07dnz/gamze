package day13whileloop;

import java.util.Scanner;

public class ForLoop04TersUcgen {

	public static void main(String[] args) {
		
		
		/*
		 * For loop kullanarak asagida verilen sekli olusturunuz, satir sayisini kullanicidan aliniz.
		 
		                         * * * * *
	                              * * * *
		                           * * *
		 *                           *
		 *
		 */

	
	Scanner scan = new Scanner (System.in);
	System.out.println("satýr sayýsý giriniz");
int num = scan.nextInt();
	
	
	for (int i = 1 ; i<=num ; i++) {           // satýr
		
		for (int s= 1 ; s<i ; s++) {           //space
			System.out.print(" ");}
		
		for (int y=num ; y>=i ; y--) {           // yýldýz
		System.out.print("* ");
		
	}
		System.out.println();
	}
	

	
	scan.close();
	
	
	
	}
	

}
