package me;

import java.util.Scanner;

public class KucukKontrolBuyukYaz {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan al�nan bir karakterin k���k harf oldu�unun kontrol�n�
		 * yaparak, bu harfin b�y�k harf kar��l���n� ekrana yazd�ran program� Java
		 * dilinde yaz�n�z.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		String harf = scan.next().substring(0, 1);
		
		
//		try {
//			int harf1 = Integer.parseInt(harf);
//			System.out.println("L�tfen harf giriniz");
//		} catch (Exception e) {
//			if (harf.equals(harf.toLowerCase())) {
//				System.out.println("Girilen karakter kucuk harftir."+"\n"+"Bu karakterin buyuk harf kars�l�g�: "+ harf.toUpperCase() + "'dir." );
//				}else if(harf.equals(harf.toUpperCase())) {
//					System.out.println("Girilen karakter k�c�k harf degildir.");
//				}
//		} 
		
		
	if(harf.charAt(0)>='a'&&harf.charAt(0)<='z') {
		System.out.println("Girilen karakter kucuk harftir."+"\n"+"Bu karakterin buyuk harf kars�l�g�: "+ harf.toUpperCase() + "'dir.");
	}else if (harf.charAt(0)>='A'&&harf.charAt(0)<='Z'){
		System.out.println("Girilen karakter kucuk harf de�ildir");
	}
	else{
		System.out.println("L�tfen harf giriniz");
	}

		
		
	 scan.close();
		
		
	}

}
