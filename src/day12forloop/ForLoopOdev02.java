package day12forloop;

import java.util.Scanner;

public class ForLoopOdev02 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n. 
		 * Ba�lang�� de�erinden veya sonras�nda ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift tamsay�lar� ekrana yazd�r�n.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int bas = scan.nextInt();
		System.out.println("Bitis degerini yaz�n�z");
		int bit = scan.nextInt();
		

		if (bas<=bit) {
		for (int i = bas ; i<=bit; i++) {
			if(i%2==0) {
			System.out.println(i);}
		}
		}else{
			for (int i =bit ; i<=bas ; i++ ) {
				if(i%2 == 0) {
				System.out.println(i);}
			}
		} 
	
	
	scan.close();
	
	
	}

}
