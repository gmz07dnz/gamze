package me;

import java.util.Scanner;

public class AsalMi {

	public static void main(String[] args) {


		// Kullan�c�dan al�nan bir say�n�n asal olup olmad�g�n� kontrol eden say�y� bulunuz

		Scanner scan = new Scanner(System.in);
		System.out.println("Asal olup olmad�g�n� belirlemek i�in bir say� giriniz");
		int asalMi = scan.nextInt();
		int counter = 0;
		
		for(int i = 1; i<=asalMi;i++){
			if(asalMi%i == 0) {
				counter++;
			}
		}
		
		if ( counter >2) {
			System.out.println("Girilen "+asalMi+ " sayisi asal degildir. ");
		}else {
			System.out.println("Girilen "+asalMi+ " sayisi asal say�d�r. ");
		}
		
		
		scan.close();
		
	}

}
