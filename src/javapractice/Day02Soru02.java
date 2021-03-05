package javapractice;

import java.util.Scanner;

public class Day02Soru02 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun Musteri karti varsa 10 urunden fazla
		 * alirsa %20, yoksa %15 indirim yapin Musteri karti yoksa 10 urunden fazla
		 * alirsa %15, yoksa %10 indirim yapin
		 */
		
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Aldýgýnýz ürünün adedini giriniz");
	int adet = scan.nextInt();
	System.out.println("Aldýgýnýz ürünün liste fiyatýný giriniz");
	double fiyat = scan.nextDouble();
	
	System.out.println("Müþteri kartýnýz var mý ? \n var \n yok \nseceneklerinden birini giriniz");
	String kart = scan.next().toLowerCase();
	
	if (kart.equals("var")) {
		if(adet>10) {
			System.out.println(adet*fiyat*80/100);
			}else {
				System.out.println(adet*fiyat*85/100);
			
		}
	}else if(kart.equals("yok")) {
		if (adet>10) {
			System.out.println(adet*fiyat*85/100);
		}else {
			System.out.println(adet*fiyat*90/100);
		}
	}else {
		System.out.println("Lütfen doðru secenek giriniz");
	}
	
	scan.close();
	}

}
