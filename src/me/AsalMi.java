package me;

import java.util.Scanner;

public class AsalMi {

	public static void main(String[] args) {


		// Kullanýcýdan alýnan bir sayýnýn asal olup olmadýgýný kontrol eden sayýyý bulunuz

		Scanner scan = new Scanner(System.in);
		System.out.println("Asal olup olmadýgýný belirlemek için bir sayý giriniz");
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
			System.out.println("Girilen "+asalMi+ " sayisi asal sayýdýr. ");
		}
		
		
		scan.close();
		
	}

}
