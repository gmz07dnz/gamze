package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {

		//kullan�c�dan ilk ismini al�p ekrana yazd�r�n.
		// kullan�c�dan soy ismini al�p al�n ekrana ilk isminin alt�na yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen ilk isminizi giriniz.");
		
		String isim = scan.nextLine(); 
		
		System.out.println("L�tfen soyisminizi giriniz.");
		String soyIsim = scan.nextLine();
		
		System.out.println(isim); //Ali
		System.out.println(soyIsim); // Can
		
	
scan.close();
	}

}
