package methodcreation;

import java.util.Scanner;

public class FaktoriyelCozum {

	public static void main(String[] args) {
		
		/*
		 * Kullanýocýdan aldýgýmýz bir sayýnýn faktöriyelini method cagýrarak
		 * bulalým. 
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Faktoriyelini hesaplamak için bir sayý giriniz");
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
