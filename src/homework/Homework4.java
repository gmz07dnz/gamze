package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
// Kenar uzunluklar� kullan�c�dan al�nan bir ��genin �evresini hesaplayan bir  Program yaz�n�z. (byte kullan�n�z) 
// Not 1: ��genin Cevresi: a + b + c	
		
		
  Scanner scan = new Scanner(System.in);
  
  System.out.println("L�tfen ��genin kenar uzunluklar�n� tam say� giriniz.");	
		
  byte kenaruzunlugu1 = scan.nextByte();
  byte kenaruzunlugu2 = scan.nextByte();
  byte kenaruzunlugu3 = scan.nextByte();
  
  System.out.println("�evre = " + (kenaruzunlugu1 + kenaruzunlugu2 + kenaruzunlugu3 ));

  scan.close();
  
 
		
		
		
		
		
		
	}

}
