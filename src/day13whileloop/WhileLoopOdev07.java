package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev07 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir rakam alýn ve bu rakam icin çarpým tablosunu ekrana
		 * yazdýrýn. Kullanýcýnýn hata yapmadýðýný farz edin. Ornegin kullanýcý 3
		 * girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		 * 
		 */
	
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("lütfen bir rakam giriniz");
	int rkm = scan.nextInt();
	
	int i = 1;
	
	while (i<=10) {
		System.out.println(i+ " x "+ rkm + "= " + (i*rkm));
	//i++;260o*--75;
	}
	
	scan.close();
	
	
	}

}

