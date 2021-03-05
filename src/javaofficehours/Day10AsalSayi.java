package javaofficehours;

import java.util.Scanner;

public class Day10AsalSayi {

	public static void main(String[] args) {
		
		
		// asal say�y� bulabilen bir java kodu yaz�n�z.
		// 11 tam b�len say�lar 1 ve 11 ==>
        // method'la cag�ralim
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Asal olup olmad�g�n� kontrol etmek i�in bir sayi giriniz");
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
