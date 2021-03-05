package javapractice;

import java.util.Scanner;

public class Day03Soru06 {

	public static void main(String[] args) {
		
		
		/* Kullanicidan sayilar girmesini isteyin
		 * ve girdigi sayilari toplayip yazdirin
		 * ve yeni sayi isteyin
		 *
		 * girilen sayilarin toplami 100 'u gecerse
		 * ".... kere sayý girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
		 *
		 */

		
		
		
		Scanner scan = new Scanner(System.in);
		
	    int sum = 0;
	    int count = 0;
	    
		do {
		System.out.println(" Bir sayý giriniz");	
			
		int num = scan.nextInt();
		sum = sum+num;
		count++;
		
		 System.out.println ("Þimdiye kadar girilen sayýlarýn toplamý: "+ sum);	
		}while (sum<=100);
        
		
			System.out.println(count + " kere sayý girdin. Bu kadar sayý yeter");
		
		
		scan.close();
		
		
		
		
	}

}
