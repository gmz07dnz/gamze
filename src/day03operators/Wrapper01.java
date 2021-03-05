package day03operators;

import java.util.Scanner;

public class Wrapper01 {
	
	public static void main(String[] args) {
		
		// kullanýcýdan ad ve soyadýný alýp ekrana yazýnýz
		// String kullanýnýz.
		
Scanner scan = new Scanner(System.in);
		
System.out.println("Lütfen ad ve soyadýnýzý giriniz.");
		
String adSoyad = scan.nextLine(); //string'leri kullanýcýdan almak için ya next() veya nextLine()kullanýrýz.
		                        //next() tek kelimelik String'ler için kullanýlýr.Boþluðu gördüðü anda býrakýr.
		                 // nextLine() girilen tüm String'i almak için kullanýlýr.Genelde nextLine() kullanýlýr.

System.out.println(adSoyad);

		
	scan.close();	
		
		
		
		
		
	}
	
	
	
	

}
