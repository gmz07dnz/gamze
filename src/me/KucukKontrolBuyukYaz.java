package me;

import java.util.Scanner;

public class KucukKontrolBuyukYaz {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan alýnan bir karakterin küçük harf olduðunun kontrolünü
		 * yaparak, bu harfin büyük harf karþýlýðýný ekrana yazdýran programý Java
		 * dilinde yazýnýz.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		String harf = scan.next().substring(0, 1);
		
		
//		try {
//			int harf1 = Integer.parseInt(harf);
//			System.out.println("Lütfen harf giriniz");
//		} catch (Exception e) {
//			if (harf.equals(harf.toLowerCase())) {
//				System.out.println("Girilen karakter kucuk harftir."+"\n"+"Bu karakterin buyuk harf karsýlýgý: "+ harf.toUpperCase() + "'dir." );
//				}else if(harf.equals(harf.toUpperCase())) {
//					System.out.println("Girilen karakter kücük harf degildir.");
//				}
//		} 
		
		
	if(harf.charAt(0)>='a'&&harf.charAt(0)<='z') {
		System.out.println("Girilen karakter kucuk harftir."+"\n"+"Bu karakterin buyuk harf karsýlýgý: "+ harf.toUpperCase() + "'dir.");
	}else if (harf.charAt(0)>='A'&&harf.charAt(0)<='Z'){
		System.out.println("Girilen karakter kucuk harf deðildir");
	}
	else{
		System.out.println("Lütfen harf giriniz");
	}

		
		
	 scan.close();
		
		
	}

}
