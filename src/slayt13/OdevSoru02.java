package slayt13;

import java.util.Scanner;

public class OdevSoru02 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan iki say� al�n bu say�lar e�it ise ekrana �E�it�, 
		 * birinci say� b�y�k ise ekrana �Birinci say� b�y�k�, 
		 * ikinci say� b�y�k ise ekrana �Ikinci say� b�y�k� yazd�r�n�z.
		 */

	
		Scanner scan = new Scanner(System.in);
		System.out.println("1.say�y� giriniz");
		int i1 = scan.nextInt();
		System.out.println("2.say�y� giriniz");
		int i2 = scan.nextInt();
	
	if (i1==i2) {
		System.out.println("E�it");
	}else if (i1>i2) {
		System.out.println("Birinci say� b�y�k");
	}else if(i2>i1) {
		System.out.println("Ikinci say� b�y�k");
	}else {
		System.out.println("l�tfen say� degerlerini dogru bir sekilde giriniz");
	}
	
   scan.close();		
	
	}

}
