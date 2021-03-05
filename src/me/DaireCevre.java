package me;

import java.util.Scanner;

public class DaireCevre {

	public static void main(String[] args) {

	//	Yarýçap Deðerini Klavyeden okuyarak bir dairenin alanýný ve çevresini hesaplayan programý yazýnýz.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dairenin yaricapini giriniz");
		double yaricap = scan.nextDouble();
		
		double daireCevre = 2*3.14*yaricap;
		System.out.println("Dairenin Cevresi: "+ daireCevre);
		
		
		scan.close();
	}

}
