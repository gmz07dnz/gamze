package day03operators;

import java.util.Scanner;

public class Wrapper01 {
	
	public static void main(String[] args) {
		
		// kullan�c�dan ad ve soyad�n� al�p ekrana yaz�n�z
		// String kullan�n�z.
		
Scanner scan = new Scanner(System.in);
		
System.out.println("L�tfen ad ve soyad�n�z� giriniz.");
		
String adSoyad = scan.nextLine(); //string'leri kullan�c�dan almak i�in ya next() veya nextLine()kullan�r�z.
		                        //next() tek kelimelik String'ler i�in kullan�l�r.Bo�lu�u g�rd��� anda b�rak�r.
		                 // nextLine() girilen t�m String'i almak i�in kullan�l�r.Genelde nextLine() kullan�l�r.

System.out.println(adSoyad);

		
	scan.close();	
		
		
		
		
		
	}
	
	
	
	

}
