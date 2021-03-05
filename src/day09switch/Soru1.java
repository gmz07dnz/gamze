package day09switch;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn. 
		 * “Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn.
		 * “Pazar” ise ekrana “Hýristiyanlar için kutsal gün” yazdýrýn. Diðer günler
		 * icin “Kutsal gün deðil” yazdýrýn.
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen bir gün ismi giriniz");
	String gün = scan.next().toLowerCase();

	// switch

switch(gün) {
      case "cuma":
    	  System.out.println("Müslümanlar için kutsal gün");
     break;
     case "cumartesi":
    	  System.out.println("Hristiyanlar için kutsal gün");
     break;
     case "pazar":
    	 System.out.println("Yahudiler için kutsal gün");
     break;
     default:
    	 System.out.println("Kutsal gün deðil");
}
		
	// ternary ile

String result = (gün.equals("cuma")) ? "Müslümanlar için kutsal gün" : (gün.equals("cumartesi")) ? "Hristiyanlar için kutsal gün" : (gün.equals("pazar")) ? "Yahudiler için kutsal gün" : "Kutsal gün deðil";  
		
System.out.println(result);		
		
	// if ile


if (gün.equals("cuma")) {
	System.out.println("Müslümanlar için kutsal gün");
}else if (gün.equals("cumartesi")) {
	System.out.println("Hristiyanlar için kutsal gün");
}else if (gün.equals("pazar")){
	System.out.println("Yahudiler için kutsal gün");
}else {
	System.out.println("Kutsal gün deðil");
}

   scan.close();
	
	
	}
}