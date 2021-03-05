package javaofficehours;

import java.util.Scanner;

public class Day10AsalSayi {

	public static void main(String[] args) {
		
		
		// asal sayýyý bulabilen bir java kodu yazýnýz.
		// 11 tam bölen sayýlar 1 ve 11 ==>
        // method'la cagýralim
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Asal olup olmadýgýný kontrol etmek için bir sayi giriniz");
		int sayi = scan.nextInt();
		
		asalSayiMi(sayi);
	
	scan.close();
	
	}

	private static void asalSayiMi(int sayi) {
		int counter=0;
		for(int i = 1; i<=sayi; i++) {
			if(sayi%i ==0) {
				counter++;
			}
			}
		if(counter==2) {
			System.out.println(sayi+ " sayisi asal sayidir.");
		}else {
			System.out.println(sayi+ " sayisi asal sayi degildir.");
		}
		
		
	}

	
	
	
}
