package day12forloop;

import java.util.Scanner;

public class ForLoopOdev05 {

	public static void main(String[] args) {
		
		
		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n 
		 * Ba�lang�� de�erinden ba�lay�p biti� de�erinde biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("baslang�c degerini tam say� olarak giriniz");
	int bas = scan.nextInt();
	System.out.println("bitis degerini tam say� olarak giriniz");
	int bit = scan.nextInt();
	int carpim = 1;
	
	if (bas <=bit) {
   for(int i = bas; i<=bit ; i++) {
	   carpim*=i;
   }System.out.println(bas + " ile " + bit + " degerleri aras�ndak� tam say�lar�n carp�m�: " + carpim);
	
	}else {
		for (int i = bas ; i>=bit ; i--) {
			carpim*=i;
		}System.out.println(bas + " ile " + bit + " degerleri aras�ndak� tam say�lar�n carp�m�: " + carpim);
		
	}
	
scan.close();	
	}

}
