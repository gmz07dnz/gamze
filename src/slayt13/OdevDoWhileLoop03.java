package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop03 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya say� girmesini s�yleyin. Kullan�c� s�f�r girdi�inde, ekrana o ana kadar girmi� oldu�u
           t�m say�lar�n toplam�n� yazd�r�n�z.
           Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazd�r�n

		 */

	
		Scanner scan = new Scanner(System.in);
		
		int top = 0;
		int i = 1;
		
		do {
			System.out.println("bir say� giriniz");
			i = scan.nextInt();
			top+=i;
			
		}while(i !=0 );
	      System.out.println("Girmi� oldugunuz say�laru�n toplam�: "+ top);
	
	
	      
	      scan.close();
	}

}
