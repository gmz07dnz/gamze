package methodcreation;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan ald�g�m�z bir say�n�n fakt�riyelini method cag�rarak
		 * bulal�m. sonra da bu say�y� 5 ile carpal�m.
		 */

	      //  3!= 3*2*1
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� giriniz");
		int sayi = scan.nextInt();
		
		
		System.out.println("Sonuc: "+ faktoriyel(sayi));
		
	int yeni =	faktoriyel(sayi)*5;
	System.out.println("Yeni sonuc: "+yeni);
		
		}

	private static int faktoriyel(int sayi) {
		
		int carpim = 1;
		
		while(sayi>0) {
			carpim = carpim*sayi;
			sayi--;
		}
		return carpim;
		
	}

	
	
	
	
	
	
}
