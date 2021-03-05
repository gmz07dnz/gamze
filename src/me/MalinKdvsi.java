package me;

public class MalinKdvsi {

	public static void main(String[] args) {
		
		/*
		 * Bir malýn fiyatý 1500ytl dir.Bu mal,%18 i kadar KDVsi alýnarak
		 * satýlacaktýr.Bu malýn KDV sini ve satýlacaðý fiyatý hesaplayýp ekrana
		 * yazdýrýnýz.
		 */

		
		double malFiyat = 1500;
		double kdv = malFiyat*18/100;
		double malSatis = malFiyat + kdv;
		System.out.println("Mal'ýn KDV'si: "+ kdv +"\n"+ "Malin satis fiyati: "+malSatis );
		
	}

}
