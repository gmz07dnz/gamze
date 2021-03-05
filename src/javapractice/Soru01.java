package javapractice;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {

		/*
		 * Final notu, vize notu ve proje notu girilen ogrencinin yilsonu notunu hesaplayin. 
		 * (Vize %30, Proje %20, Final %50) ve yilsonu notu 50 veya buyukse gectin, yoksa kaldin yazdirin
		 * 
		 * Ornek : Inputs : sinavlar : 40 , 60, 52 Output : Yilsonu notunuz : 50 ,
		 * GECTINIZ
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Final Notunuzu giriniz");
		double finalNot = scan.nextInt();
		System.out.println("Vize Notunuzu giriniz");
		double vizeNot = scan.nextInt();
		System.out.println("Proje Notunuzu giriniz");
		double projeNot = scan.nextInt();
		
		double yilSonuNot = (finalNot*50/100)+(vizeNot*30/100)+(projeNot*20/100);
		
		if(yilSonuNot>50) {
			System.out.println("Yil sonu notunuz :" + yilSonuNot + " GECTINIZ" );
		}else {
			System.out.println("Yil sonu notunuz :" + yilSonuNot + " KALDINIZ");
		}
		
		
		
		scan.close();
		
		
		
	}

}
