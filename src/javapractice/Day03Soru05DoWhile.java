package javapractice;

import java.util.Scanner;

public class Day03Soru05DoWhile {

	public static void main(String[] args) {
		
		/*
		 * Bir sayýnýn mükemmel olup olmadýðýný bulan bir program yazýnýz. Mükemmel sayý
		 * : bir sayýnýn kendisi hariç bölenlerinin toplamý, kendisine eþitse o sayý
		 * mükemmeldir. ORNEK: INPUT : 6 OUTPUT : 1,2,3 1+2+3 = 6 = 6 (Mükemmel)
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int num = scan.nextInt();
		int bolenlerinToplamý = 0;
		
		int i = 1;
		
		do {
			if (num%i==0) {
			bolenlerinToplamý=bolenlerinToplamý+i;
			}
			i++;
		}while(i<num);
		
	if (bolenlerinToplamý == num ) {
		System.out.println(num + " mükemmel sayýdýr");
	}else {
		System.out.println(" mükemmel sayý degildir");
	}

	scan.close();
	
	}

}
