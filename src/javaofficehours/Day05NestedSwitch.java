package javaofficehours;

import java.util.Scanner;

public class Day05NestedSwitch {

	public static void main(String[] args) {
		
//		 kullanýcýdan üniversite kaçýncý sýnýf ve fakültesini alaným.
//		1. sýnýf ise;
//				üniversite giriþ yýlý
//		2. sýnýf ise;
//				mimarlýk 
//		syso(2. sýnýf mimarlýk öðrencisi)
//				mühendislik:
//		syso(2. sýnýf mühendislik  öðrencisi)
//		3. sýnýf ise;
//				mimarlýk 
//		syso(3. sýnýf mimarlýk öðrencisi)
//			mühendislik:
//		syso(3. sýnýf mühendislik  öðrencisi)
//		

		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("sýnýfýnýzý giriniz");
		int sinif = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("fakülte ismini giriniz");
		String faculty = scan.nextLine().toLowerCase();
		
		
		switch(sinif) {
		case 1:
			System.out.println("üniversite giris yili");
		break;
		
		case 2:
			switch (faculty) {
			case "mimarlik" :
				System.out.println("2. sinif mimarlik öðrencisi ");
				break;
			case "mühendislik":
				System.out.println("2. sinif mühendislik öðrencisi ");
				break;
				default:
					System.out.println("Lütfen fakültenizi doðru giriniz");
					break;
			}
			break;
		case 3:
			switch (faculty) {
			case "mimarlik" :
				System.out.println("3. sinif mimarlik öðrencisi ");
				break;
			case "mühendislik":
				System.out.println("3. sinif mühendislik öðrencisi ");
				break;
			}	
		break;
		default:
			System.out.println("Lütfen sýnýfýnýzý doðru giriniz");
		
		}
		
		scan.close();
	}

}
