package day12forloop;

import java.util.Scanner;

public class ForLoopOdev01 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n . 
		 * Ba�lang�� de�erinden ba�lay�p biti� de�erinde biten t�m tamsay�lar� ekrana yazd�r�n.
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Baslangic degerini giriniz");
	int bas = scan.nextInt();
	System.out.println("Bitis degerini yaz�n�z");
	int bit = scan.nextInt();
	
	if (bas<=bit) {
	for (int i = bas ; i<=bit; i++) {
		System.out.println(i);
	}
	}else {
		for (int i = bas ; i>=bit; i-- ) {
			System.out.println(i);
		}
	}
	
	scan.close();
	
	}

}
