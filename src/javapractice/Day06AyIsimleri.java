package javapractice;

import java.util.Scanner;

public class Day06AyIsimleri {

	public static void main(String[] args) {
		
		
		/*
		 * Kullanicidan ay olarak 1 ile 12 arasindaki bir sayiyi alan, sayiyi ay
		 * isimleri olarak yazdiran bir method olusturun 
		 * INPUT : 11 OUTPUT: Kasim 
		 * INPUT: 5 OUTPUT: Mayis INPUT : 15 OUTPUT: Lutfen 1 ile 12 arasinda bir numara
		 * girin
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("Ay isimlerini bulmak i�in 1 ile 12 arasinda bir numara giriniz");
		int ayNo = scan.nextInt();
		
		ayIsimleri(ayNo);
		
		scan.close();
	}

	public static void ayIsimleri(int ayNo) {
	
		switch (ayNo) {
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("�ubat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("May�s");
			break;
		case 6:
			System.out.println("Haziran");
			break;
		case 7:
			System.out.println("Temmuz");
			break;
		case 8:
			System.out.println("Agustos");
			break;
		case 9:
			System.out.println("Eyl�l");
			break;
		case 10:
			System.out.println("Ekim");
			break;
		case 11:
			System.out.println("Kas�m");
			break;
		case 12:
			System.out.println("Aralik");
			break;
		default:
		System.out.println("L�tfen 1 ile 12 arasinda bir numara giriniz");	
		
		}
		
		
	}
}
