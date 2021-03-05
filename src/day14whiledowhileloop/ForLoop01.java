package day14whiledowhileloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
	
		/*
		 * For loop kullanarak asagida verilen sekli olusturunuz, satir sayisini kullanicidan aliniz.
		 
		                         *******
	                              *****
		                           ***
		                            *
		 *
		 */


		 Scanner scan = new Scanner(System.in);
	     System.out.println("Satir sayisini giriniz");
	     int s = scan.nextInt();
		
		
		
		for(int i = 0 ; i <s ; i++) {             // satýr
			
			for (int k=0 ; k<i ; k++) {           // space
			System.out.print(" ");	
				
			} for (int m = 1; m<2*(s-i); m++) {       // yýldýz
			
			System.out.print("*");
			
			}
		System.out.println();
		
		}
		
	
		scan.close();
			
	}

}
