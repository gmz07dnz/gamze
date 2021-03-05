package me;

import java.util.Scanner;

public class YanlisCevapDöngüsü {

	public static void main(String[] args) {

		/*
		 * Bir öðrenciye bir soru sorulsun ve öðrenciden cevap alýnsýn. Öðrencinin
		 * verdiði cevap doðru deðilse, bir defa daha sorunun sorulduðu durumun akýþ
		 * þemasýný çiziniz ve Java programýný yazýnýz.
		 */

		
		
		Scanner scan = new Scanner(System.in);
		
		int result;
		do {
			System.out.println("3+5 = ?");
			 result = scan.nextInt();
			if (result==8) {
				System.out.println("Tebrikler doðru cevap verdiniz.");
				break;
			}else {
				System.out.println("Yanlýþ cevap verdiniz");
			}
			
			
		}while(result!=8);
		
		
	scan.close();	
		
		
		
		
		
		
		
		
		
		
	}

}
