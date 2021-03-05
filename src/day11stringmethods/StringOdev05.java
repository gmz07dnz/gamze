package day11stringmethods;

import java.util.Scanner;

public class StringOdev05 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan yaþadýðý ülkenin ismini alýn 
		 * bu ülkenin ismi Amerika ise ekrana USA, Ingiltere ise ekrana UK, Almanya ise ekrana DE yazdýrýn.
		 * Diðer ülkeler için ise NA yazdýrýn.
		 */

//	Scanner scan = new Scanner(System.in);
//	System.out.println("Yasadiginiz ülkeyi giriniz");
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
    	System.out.println("Yasadiginiz ülkeyi giriniz");
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
