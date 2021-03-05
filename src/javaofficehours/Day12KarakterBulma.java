package javaofficehours;

import java.util.Scanner;

public class Day12KarakterBulma {

	public static void main(String[] args) {
		
		/* Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldu�unu, 
	     * de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. 
	     * Girdi�i de�er harf de�ilse yada 1 karakterden fazla ise hata mesaj� gostersin. 
	     * (Test girilen harfi buyuk yada kucuklu�une duyarl�d�r.)
	      Sesli harfler: a,e,i,o,u
	*/

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir harf giriniz.");
		String harf = scan.next();
		
		// 1.yol
//		
//		if(harf.length()>1) {
//			System.out.println("Tek karakter giriniz");
//		}else 
//		if(harf.charAt(0)>='a'&& harf.charAt(0)<='z') {
//			if(harf.charAt(0)=='a' || harf.charAt(0)=='e' || harf.charAt(0)=='�' || harf.charAt(0)=='u'||harf.charAt(0)=='o' ) {
//				System.out.println("k���k sesli harftir.");
//			}else {
//				System.out.println("k���k sessiz harftir.");
//			}
//		}else if(harf.charAt(0)>='A'&& harf.charAt(0)<='Z') {
//			if(harf.charAt(0)=='A' || harf.charAt(0)=='E' || harf.charAt(0)=='I' || harf.charAt(0)=='U'||harf.charAt(0)=='O' ) {
//				System.out.println("B�y�k sesli harftir.");
//			}else {
//				System.out.println("b�y�k sessiz harftir.");
//			}
//		} else {
//			System.out.println("Hatal� giri� yapt�n�z");
//		}
		
		
		// 2.yol
		
		
		boolean sesli = harf.toLowerCase().equals("a") ||harf.toLowerCase().equals("e") ||harf.toLowerCase().equals("u") ||
				harf.toLowerCase().equals("i") ||harf.toLowerCase().equals("o");
		
		boolean sessizk�c�k = harf.charAt(0)>='a'&& harf.charAt(0)<='z';
		boolean sessizb�y�k = harf.charAt(0)>='A'&& harf.charAt(0)<='Z';
		
		
		if (harf.length()>1) {
			System.out.println("Tek karakter giriniz");
		}
		else if(!(sessizk�c�k||sessizb�y�k)) {
			System.out.println("hatal� giri� yapt�n�z");
		}else if (sesli) {
			System.out.println("Sesli harf girdiniz");
		}else {
			System.out.println("Sessiz harf girdiniz");
		}
		
		
		scan.close();
	}

}
