package javapractice;

import java.util.Scanner;

public class Day03Soru05 {

	public static void main(String[] args) {
		

		/*
		 * Bir sayýnýn mükemmel olup olmadýðýný bulan bir program yazýnýz. 
		 * Mükemmel sayý : bir sayýnýn kendisi hariç bölenlerinin toplamý, kendisine eþitse o sayý
		 * mükemmeldir. ORNEK: INPUT : 6 OUTPUT : 1,2,3 1+2+3 = 6 = 6 (Mükemmel)
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("mükemmel sayý olup olmadýgýný kontrol etmek için bir sayý giriniz ");
		int num = scan.nextInt();
		
		int bolenlerintoplamý = 0;
		
		for (int i= 1 ; i<num ; i++) {
			if (num%i == 0) {
				bolenlerintoplamý = bolenlerintoplamý+i;
			}
		}
		
		if (bolenlerintoplamý == num) {
			System.out.println(num + " sayýsý mükemmel sayýdýr.");
		}else {
			System.out.println(num + " sayýsý mükemmel sayý deðildir.");
		}
		
		
	scan.close();	
	}

}
