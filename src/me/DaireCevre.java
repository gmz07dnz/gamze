package me;

import java.util.Scanner;

public class DaireCevre {

	public static void main(String[] args) {

	//	Yar��ap De�erini Klavyeden okuyarak bir dairenin alan�n� ve �evresini hesaplayan program� yaz�n�z.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dairenin yaricapini giriniz");
		double yaricap = scan.nextDouble();
		
		double daireCevre = 2*3.14*yaricap;
		System.out.println("Dairenin Cevresi: "+ daireCevre);
		
		
		scan.close();
	}

}
