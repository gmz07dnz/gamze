package methodcreation;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan aldýgýmýz bir sayýnýn faktöriyelini method cagýrarak
		 * bulalým. sonra da bu sayýyý 5 ile carpalým.
		 */

	      //  3!= 3*2*1
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
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
