package methodcreation;

import java.util.Scanner;

public class UsAl {

	public static void main(String[] args) {
		
		/*
		 * Degerlerin kullan�c�dan al�nd�g� �sl� say�y� yazd�ran ve bu degerin de faktoriyelini alan program� yaz�n
		 * 
		 * usli say�n�n taban�n� giriniz
		 * uslu say�n�n ussunu girin
		 * taban 2
		 * us 3
		 * 2*2*2
		 * 
		 */
 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ussunu al�nacak say�n�n taban degerini giriniz");
		int taban = scan.nextInt();
		System.out.println("Ussunu al�nacak say�n�n �st degerini giriniz");
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
