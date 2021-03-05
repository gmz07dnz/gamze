package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev03 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya
		 * sonrasýndan baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift
		 * tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("baslangýc degeri için tamsayý giriniz");
		int bas = scan.nextInt();
		System.out.println("bitis degeri icin tamsayý giriniz");
		int bit = scan.nextInt();
	
	
	int i = bas;
	if (bas<=bit) {
		while(i<=bit) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		}else {
			while(i>=bit) {
				if(i%2==0) {
					System.out.println(i);
				}
				i--;
			}
		}
	
	scan.close();
	
	
	
	}

}
