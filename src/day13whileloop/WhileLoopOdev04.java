package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev04 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden
		 * ba�lay�p biti� de�erinde biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("baslang�c degeri i�in tamsay� giriniz");
		int bas = scan.nextInt();
		System.out.println("bitis degeri icin tamsay� giriniz");
		int bit = scan.nextInt();
		
		int top = 0;
		int i = bas;
		 if (bas<= bit) {
			 while(i<=bit) {
				 top+=i;
				 i++;
			 }System.out.println("Girilen degerler aras�ndaki tamsay�lar�n toplam�: "+ top);
		 }else {
			 while(i>=bit) {
				 top+=i;
				 i--;
			 }System.out.println("Girilen degerler aras�ndaki tamsay�lar�n toplam�: "+ top);
		 }
	
	scan.close();
	
	
	
	}

}
