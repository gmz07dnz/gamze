package methodcreation;

import java.util.Scanner;

public class UsAlCozum {

	public static void main(String[] args) {
		
		/*
		 * Degerlerin kullanýcýdan alýndýgý üslü sayýyý return eden ve bu degerin de faktoriyelini alýp sonucu ekrana yazdýran programý yazýn
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ussunu alýnacak sayýnýn taban degerini giriniz");
		int taban = scan.nextInt();
		System.out.println("Ussunu alýnacak sayýnýn üst degerini giriniz");
		int ust = scan.nextInt();
		
		usluSayi(taban, ust); // 5,3
		System.out.println(usluSayi(taban, ust)); // 125
		
		faktoriyel(usluSayi(taban, ust));
		
		scan.close();
	}
	
	public static int usluSayi(int taban, int ust) {
		
		int carpim = 1;
		
		for (int i = 1 ; i<=ust ; i++) {
			
			carpim = carpim*taban;
			
		}
		return carpim;
		
		
		
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
