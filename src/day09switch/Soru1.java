package day09switch;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar i�in kutsal g�n� yazd�r�n. 
		 * �Cumartesi� ise ekrana �Yahudiler i�in kutsal g�n� yazd�r�n.
		 * �Pazar� ise ekrana �H�ristiyanlar i�in kutsal g�n� yazd�r�n. Di�er g�nler
		 * icin �Kutsal g�n de�il� yazd�r�n.
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("L�tfen bir g�n ismi giriniz");
	String g�n = scan.next().toLowerCase();

	// switch

switch(g�n) {
      case "cuma":
    	  System.out.println("M�sl�manlar i�in kutsal g�n");
     break;
     case "cumartesi":
    	  System.out.println("Hristiyanlar i�in kutsal g�n");
     break;
     case "pazar":
    	 System.out.println("Yahudiler i�in kutsal g�n");
     break;
     default:
    	 System.out.println("Kutsal g�n de�il");
}
		
	// ternary ile

String result = (g�n.equals("cuma")) ? "M�sl�manlar i�in kutsal g�n" : (g�n.equals("cumartesi")) ? "Hristiyanlar i�in kutsal g�n" : (g�n.equals("pazar")) ? "Yahudiler i�in kutsal g�n" : "Kutsal g�n de�il";  
		
System.out.println(result);		
		
	// if ile


if (g�n.equals("cuma")) {
	System.out.println("M�sl�manlar i�in kutsal g�n");
}else if (g�n.equals("cumartesi")) {
	System.out.println("Hristiyanlar i�in kutsal g�n");
}else if (g�n.equals("pazar")){
	System.out.println("Yahudiler i�in kutsal g�n");
}else {
	System.out.println("Kutsal g�n de�il");
}

   scan.close();
	
	
	}
}