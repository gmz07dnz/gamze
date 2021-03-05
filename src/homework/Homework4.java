package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
// Kenar uzunluklarý kullanýcýdan alýnan bir üçgenin çevresini hesaplayan bir  Program yazýnýz. (byte kullanýnýz) 
// Not 1: Üçgenin Cevresi: a + b + c	
		
		
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Lütfen üçgenin kenar uzunluklarýný tam sayý giriniz.");	
		
  byte kenaruzunlugu1 = scan.nextByte();
  byte kenaruzunlugu2 = scan.nextByte();
  byte kenaruzunlugu3 = scan.nextByte();
  
  System.out.println("Çevre = " + (kenaruzunlugu1 + kenaruzunlugu2 + kenaruzunlugu3 ));

  scan.close();
  
 
		
		
		
		
		
		
	}

}
