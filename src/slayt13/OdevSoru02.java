package slayt13;

import java.util.Scanner;

public class OdevSoru02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”, 
		 * birinci sayý büyük ise ekrana “Birinci sayý büyük”, 
		 * ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz.
		 */

	
		Scanner scan = new Scanner(System.in);
		System.out.println("1.sayýyý giriniz");
		int i1 = scan.nextInt();
		System.out.println("2.sayýyý giriniz");
		int i2 = scan.nextInt();
	
	if (i1==i2) {
		System.out.println("Eþit");
	}else if (i1>i2) {
		System.out.println("Birinci sayý büyük");
	}else if(i2>i1) {
		System.out.println("Ikinci sayý büyük");
	}else {
		System.out.println("lütfen sayý degerlerini dogru bir sekilde giriniz");
	}
	
   scan.close();		
	
	}

}
