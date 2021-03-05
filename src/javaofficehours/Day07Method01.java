package javaofficehours;

import java.util.Scanner;

public class Day07Method01 {

	public static void main(String[] args) {
		
		/*
		 * Saat ve dakika girildiðinde saniye return eden methodu yazýnýz.
		 * 
		 * 1 sa = 3600 sn
		 * 1 dk = 60 sn
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Saniyeye cevirmek için saat giriniz");
		int saat = scan.nextInt();
		System.out.println("Saniyeye cevirmek için dakika giriniz");
		int dakika = scan.nextInt();
		
		
		System.out.println(saat +" saat " +dakika+" dk " + saniyeDönüþtürücü(saat, dakika) +" saniyedir");
		
		scan.close();
		
	}

	public static int saniyeDönüþtürücü(int saat, int dakika) {
		int saniye= (saat*60*60)+ (dakika*60);
	return saniye;
}

}