package methodcreation;

import java.util.Scanner;

public class FaktoriyelCozum {

	public static void main(String[] args) {
		
		/*
		 * Kullan�oc�dan ald�g�m�z bir say�n�n fakt�riyelini method cag�rarak
		 * bulal�m. 
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Faktoriyelini hesaplamak i�in bir say� giriniz");
		int sayi = scan.nextInt();
		
		faktoriyel(sayi);
		
		scan.close();
		
	}

	
	public static void faktoriyel(int num) {
		
		
		int faktoriyel =1;
		while(num>0) {
			
			faktoriyel =num*faktoriyel;
			num--;
		}
		
		System.out.println(faktoriyel);
		
	
		
	}
	
	
}
