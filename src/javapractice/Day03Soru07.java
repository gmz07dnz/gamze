package javapractice;

import java.util.Scanner;

public class Day03Soru07 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan 10'dan k���k bir say� al�n ve carpim tablosu olusturun.
		 * 
		 * input : number : 4
		 * output: 1 2 3 4
		 *         2 4 6 8
		 *         3 6 9 12 
		 *         4 8 12 16
		 *         
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("�arp�m tablosu olusturmak i�in bir say� giriniz");
		int num = scan.nextInt();
		
		
		for(int i = 1; i<=num;i++) {
			
			for (int k = 1; k<=num; k++) {
			
				System.out.print(i*k+" " );
				
			}
		System.out.println();
		}
		
	scan.close();	
	}

}
