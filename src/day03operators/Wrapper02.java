package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {

		//kullanýcýdan ilk ismini alýp ekrana yazdýrýn.
		// kullanýcýdan soy ismini alýp alýn ekrana ilk isminin altýna yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen ilk isminizi giriniz.");
		
		String isim = scan.nextLine(); 
		
		System.out.println("Lütfen soyisminizi giriniz.");
		String soyIsim = scan.nextLine();
		
		System.out.println(isim); //Ali
		System.out.println(soyIsim); // Can
		
	
scan.close();
	}

}
