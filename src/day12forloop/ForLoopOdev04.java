package day12forloop;

import java.util.Scanner;

public class ForLoopOdev04 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n. 
		 * Ba�lang�� de�erinden ba�lay�p biti� de�erinde biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.

		 */

		
	Scanner scan = new Scanner(System.in);
	System.out.println("baslang�c degeri i�in tamsay� giriniz");
		int bas = scan.nextInt();
		System.out.println("bitis degeri i�in tam say� giriniz ");
		int bit = scan.nextInt();
		int top = 0;
		
		if (bas<=bit) {
			for(int i = bas ; i <= bit; i++) {
				top+=i;
			}System.out.println(bas + " ile " + bit + " degerleri aras�ndak� tam say�lar�n toplam�: " + top);
		}else {
			for (int i = bas; i >=bit; i--) {
				top+=i;
			}System.out.println(bas + " ile " + bit + " degerleri aras�ndak� tam say�lar�n toplam�: " + top);
			
		}
			
		
	scan.close();	
		
		
		
		
		
		
		
		
	}

}
