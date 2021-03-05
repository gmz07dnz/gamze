package day12forloop;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
        /*
         * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya
		 * sonrasýndan baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift
		 * tamsayýlarý ekrana yazdýrýn.
         */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("baslangic degerini giriniz");
	int bas = scan.nextInt();
	
	System.out.println("bitis degerini yazýnýz");
	int bit = scan.nextInt();
	
	
	
	if(bas>bit) {
		System.out.println("Baslangic degeri bitis degerinden küçük olmalýdýr.");
	}else {
		for(int i = bas; i<= bit ; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
	}
	
	scan.close();
	
	}

}
