package homework;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
	
	//	Kullan�c�dan ad ve soyad�n� al�p ekrana yazd�ran bir program yaz�n�z.  (String kullan�n�z) 

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" L�tfen ad ve soyad�n�z� giriniz");
		
		String adSoyad = scan.nextLine();
		
		System.out.println(adSoyad);
		
	// Kullan�c�dan ad, soyad ve adresini al�p ekrana yazd�ran bir program yaz�n�z.  
	// Ad ve soyad ilk sat�rda, adres ikinci sat�rda olsun. (String kullan�n�z)  
		
	System.out.println("L�tfen adresinizi giriniz");	
		
	String address = scan.nextLine();
	
	System.out.println(address);
		scan.close();
		
		
	}

}
