package slayt13;

import java.util.Scanner;

public class OdevDoWhileLoop02 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
         biten 4 ve 6 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini yaz�n�z");
		int bit = scan.nextInt();
		
		int i = bas;
		if(bas<=bit) {
		
		do {
			if(i%4 == 0 && i%6 == 0) {
			System.out.println(i);
			}
		i++;
		} while(i<=bit);
		}else {
			do {if(i%4 == 0 && i%6 == 0) {
				System.out.println(i);	
		}
		i--;
		} while (i>=bit);
		}
		
	scan.close();	
		
		}

}
