package javaofficehours;

import java.util.Scanner;

public class Day05StringMethod01 {


	public static void main(String[] args) {
		
		/*
		 * kullan�c�dan al�nacak cumlen�n i�inde aranan string i bulan java kodunu
		 * yaz�n�z. true<-> false
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir c�mle giriniz");
		String c�mle = scan.nextLine();
		System.out.println("L�tfen aranacak kelimeyi giriniz");
		String kelime = scan.nextLine();
		
	System.out.println(c�mle.contains(kelime));
	
	scan.close();
		
		
		
		
	
	}

}
