package slayt12;

import java.util.Scanner;

public class OdevForVeWhileLoop02 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve 
		 * ba�lang�� de�erinden ba�lay�p biti� de�erinde biten 3 ve 5 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini yaz�n�z");
		int bit = scan.nextInt();	
	
	// for loop
	
	if (bas<=bit) {
	for (int i = bas; i<= bit; i++ ) {
		if( i%3 == 0 && i%5 == 0 ) {
			System.out.println(i);
		}
	}
	}else {
	for (int i = bas ; i>=bit; i--) {
		if (i%5 == 0 && i%3 == 0) {
			System.out.println(i);
		}
		
	}
	
	}
	
	
	// while loop 
	
		int i = bas;
	if (bas<=bit) {
		
	while (i<=bit) {
		if (i%3 == 0 && i%5 ==0) {
			System.out.println(i);
		}
		i++;
	}
	}else {
		
		while(i>=bit) {
			if(i%5 == 0 && i%3 == 0) {
				System.out.println(i);
			}
			i--;} 
	}
	
	scan.close();
	
	}

}
