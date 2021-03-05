package javaofficehours;

import java.util.Scanner;

public class Day05NestedSwitch {

	public static void main(String[] args) {
		
//		 kullan�c�dan �niversite ka��nc� s�n�f ve fak�ltesini alan�m.
//		1. s�n�f ise;
//				�niversite giri� y�l�
//		2. s�n�f ise;
//				mimarl�k 
//		syso(2. s�n�f mimarl�k ��rencisi)
//				m�hendislik:
//		syso(2. s�n�f m�hendislik  ��rencisi)
//		3. s�n�f ise;
//				mimarl�k 
//		syso(3. s�n�f mimarl�k ��rencisi)
//			m�hendislik:
//		syso(3. s�n�f m�hendislik  ��rencisi)
//		

		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("s�n�f�n�z� giriniz");
		int sinif = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("fak�lte ismini giriniz");
		String faculty = scan.nextLine().toLowerCase();
		
		
		switch(sinif) {
		case 1:
			System.out.println("�niversite giris yili");
		break;
		
		case 2:
			switch (faculty) {
			case "mimarlik" :
				System.out.println("2. sinif mimarlik ��rencisi ");
				break;
			case "m�hendislik":
				System.out.println("2. sinif m�hendislik ��rencisi ");
				break;
				default:
					System.out.println("L�tfen fak�ltenizi do�ru giriniz");
					break;
			}
			break;
		case 3:
			switch (faculty) {
			case "mimarlik" :
				System.out.println("3. sinif mimarlik ��rencisi ");
				break;
			case "m�hendislik":
				System.out.println("3. sinif m�hendislik ��rencisi ");
				break;
			}	
		break;
		default:
			System.out.println("L�tfen s�n�f�n�z� do�ru giriniz");
		
		}
		
		scan.close();
	}

}
