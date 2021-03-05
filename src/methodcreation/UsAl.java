package methodcreation;

import java.util.Scanner;

public class UsAl {

	public static void main(String[] args) {
		
		/*
		 * Degerlerin kullanýcýdan alýndýgý üslü sayýyý yazdýran ve bu degerin de faktoriyelini alan programý yazýn
		 * 
		 * usli sayýnýn tabanýný giriniz
		 * uslu sayýnýn ussunu girin
		 * taban 2
		 * us 3
		 * 2*2*2
		 * 
		 */
 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ussunu alýnacak sayýnýn taban degerini giriniz");
		int taban = scan.nextInt();
		System.out.println("Ussunu alýnacak sayýnýn üst degerini giriniz");
		int ust = scan.nextInt();
		
		usluSayi(taban, ust);
		System.out.println(usluSayi(taban, ust));
		
		faktoriyel(usluSayi(taban, ust));
	}

	private static void faktoriyel(int sayi) {
		
		int faktoriyel =1;
		while(sayi>0) {
			
			faktoriyel =sayi*faktoriyel;
			sayi--;
		}
		
		System.out.println(faktoriyel);
		
	}

	public static int usluSayi(int taban, int ust) {
		int carpim=1;
		
		for(int i=1; i<=ust; i++) {
			carpim=carpim*taban;
		}
		return carpim;
	}
	
	
}
