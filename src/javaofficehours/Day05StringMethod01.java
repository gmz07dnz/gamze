package javaofficehours;

import java.util.Scanner;

public class Day05StringMethod01 {


	public static void main(String[] args) {
		
		/*
		 * kullanýcýdan alýnacak cumlenýn içinde aranan string i bulan java kodunu
		 * yazýnýz. true<-> false
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir cümle giriniz");
		String cümle = scan.nextLine();
		System.out.println("Lütfen aranacak kelimeyi giriniz");
		String kelime = scan.nextLine();
		
	System.out.println(cümle.contains(kelime));
	
	scan.close();
		
		
		
		
	
	}

}
