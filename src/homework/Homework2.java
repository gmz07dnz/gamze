package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

// Boyutlar� kullan�c�dan al�nan bir dikd�rtgenler prizmas�n�n hacmini hesaplayan bir program yaz�n�z. 
// Not: Dikd�rtgenler Prizmas�n�n Hacmi:  En x Boy x Y�kseklik 
		
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("L�tfen dikd�rtgenler prizmas�n�n enini giriniz.");
	double en = scan.nextDouble();
	System.out.println(en);	
	
	System.out.println("L�tfen dikd�rtgenler prizmas�n�n boyunu giriniz.");
	double boy = scan.nextDouble();
	System.out.println(boy);
	
    System.out.println("L�tfen dikd�rtgenler prizmas�n�n y�ksekli�ini giriniz");
	double y�kseklik = scan.nextDouble();
	System.out.println(y�kseklik);
	
	 
	System.out.println("Alan = " + en*boy*y�kseklik);
	
	scan.close();
	
	
	
	
	
	
		
	}

}
