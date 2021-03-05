package javaofficehours;

import java.util.Scanner;

public class Day12KarakterBulma {

	public static void main(String[] args) {
		
		/* Kullanýcýdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduðunu, 
	     * deðilse sessiz harf olduðunu ekrana yazdýrsýn. 
	     * Girdiði deðer harf deðilse yada 1 karakterden fazla ise hata mesajý gostersin. 
	     * (Test girilen harfi buyuk yada kucukluðune duyarlýdýr.)
	      Sesli harfler: a,e,i,o,u
	*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz.");
		String harf = scan.next();
		
		// 1.yol
//		
//		if(harf.length()>1) {
//			System.out.println("Tek karakter giriniz");
//		}else 
//		if(harf.charAt(0)>='a'&& harf.charAt(0)<='z') {
//			if(harf.charAt(0)=='a' || harf.charAt(0)=='e' || harf.charAt(0)=='ý' || harf.charAt(0)=='u'||harf.charAt(0)=='o' ) {
//				System.out.println("küçük sesli harftir.");
//			}else {
//				System.out.println("küçük sessiz harftir.");
//			}
//		}else if(harf.charAt(0)>='A'&& harf.charAt(0)<='Z') {
//			if(harf.charAt(0)=='A' || harf.charAt(0)=='E' || harf.charAt(0)=='I' || harf.charAt(0)=='U'||harf.charAt(0)=='O' ) {
//				System.out.println("Büyük sesli harftir.");
//			}else {
//				System.out.println("büyük sessiz harftir.");
//			}
//		} else {
//			System.out.println("Hatalý giriþ yaptýnýz");
//		}
		
		
		// 2.yol
		
		
		boolean sesli = harf.toLowerCase().equals("a") ||harf.toLowerCase().equals("e") ||harf.toLowerCase().equals("u") ||
				harf.toLowerCase().equals("i") ||harf.toLowerCase().equals("o");
		
		boolean sessizkücük = harf.charAt(0)>='a'&& harf.charAt(0)<='z';
		boolean sessizbüyük = harf.charAt(0)>='A'&& harf.charAt(0)<='Z';
		
		
		if (harf.length()>1) {
			System.out.println("Tek karakter giriniz");
		}
		else if(!(sessizkücük||sessizbüyük)) {
			System.out.println("hatalý giriþ yaptýnýz");
		}else if (sesli) {
			System.out.println("Sesli harf girdiniz");
		}else {
			System.out.println("Sessiz harf girdiniz");
		}
		
		
		scan.close();
	}

}
