package me;

import java.util.Scanner;

public class YanlisCevapD�ng�s� {

	public static void main(String[] args) {

		/*
		 * Bir ��renciye bir soru sorulsun ve ��renciden cevap al�ns�n. ��rencinin
		 * verdi�i cevap do�ru de�ilse, bir defa daha sorunun soruldu�u durumun ak��
		 * �emas�n� �iziniz ve Java program�n� yaz�n�z.
		 */

		
		
		Scanner scan = new Scanner(System.in);
		
		int result;
		do {
			System.out.println("3+5 = ?");
			 result = scan.nextInt();
			if (result==8) {
				System.out.println("Tebrikler do�ru cevap verdiniz.");
				break;
			}else {
				System.out.println("Yanl�� cevap verdiniz");
			}
			
			
		}while(result!=8);
		
		
	scan.close();	
		
		
		
		
		
		
		
		
		
		
	}

}
