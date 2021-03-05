package homework;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
	
	//	Kullanýcýdan ad ve soyadýný alýp ekrana yazdýran bir program yazýnýz.  (String kullanýnýz) 

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Lütfen ad ve soyadýnýzý giriniz");
		
		String adSoyad = scan.nextLine();
		
		System.out.println(adSoyad);
		
	// Kullanýcýdan ad, soyad ve adresini alýp ekrana yazdýran bir program yazýnýz.  
	// Ad ve soyad ilk satýrda, adres ikinci satýrda olsun. (String kullanýnýz)  
		
	System.out.println("Lütfen adresinizi giriniz");	
		
	String address = scan.nextLine();
	
	System.out.println(address);
		scan.close();
		
		
	}

}
