package me;

public class MalinKdvsi {

	public static void main(String[] args) {
		
		/*
		 * Bir mal�n fiyat� 1500ytl dir.Bu mal,%18 i kadar KDVsi al�narak
		 * sat�lacakt�r.Bu mal�n KDV sini ve sat�laca�� fiyat� hesaplay�p ekrana
		 * yazd�r�n�z.
		 */

		
		double malFiyat = 1500;
		double kdv = malFiyat*18/100;
		double malSatis = malFiyat + kdv;
		System.out.println("Mal'�n KDV'si: "+ kdv +"\n"+ "Malin satis fiyati: "+malSatis );
		
	}

}
