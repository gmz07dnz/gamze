package day11stringmethods;

import java.util.Scanner;

public class StringOdev05 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan ya�ad��� �lkenin ismini al�n 
		 * bu �lkenin ismi Amerika ise ekrana USA, Ingiltere ise ekrana UK, Almanya ise ekrana DE yazd�r�n.
		 * Di�er �lkeler i�in ise NA yazd�r�n.
		 */

//	Scanner scan = new Scanner(System.in);
//	System.out.println("Yasadiginiz �lkeyi giriniz");
//    String ulke = scan.nextLine();
//    
//    
//    if (ulke.equalsIgnoreCase("america")) {
//    	System.out.println("USA");
//    }else if (ulke.equalsIgnoreCase("Ingiltere")) {
//    	System.out.println("UK");
//    }else if (ulke.equalsIgnoreCase("almanya")) {
//    	System.out.println("DE");
//    }else {
//    	System.out.println("NA");
//    }
		
	
		Scanner scan = new Scanner(System.in);
    	System.out.println("Yasadiginiz �lkeyi giriniz");
        String ulke = scan.nextLine().toLowerCase();
		
		
    switch (ulke) {
    
    case("america"):
        System.out.println("USA");
    break;
    	
    case("ingiltere"):
    	System.out.println("UK");	
    break;
    	
    case("almanya"):
    	System.out.println("DE");	
    break;
    default:
    	System.out.println("NA");	
    }
    
    
    scan.close();
    
	}

}
