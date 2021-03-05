package day09switch;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan bir harf alýn eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn. 
		 * “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn. 
		 * Bu harflerin dýþýnda bir character için “Geçersiz character”
		 * yazdýrýn.
		 */
      Scanner scan = new Scanner(System.in);
      System.out.println("Lütfen bir harf giriniz");
	 char h = scan.next().toLowerCase().charAt(0);
	  
	
	// switch ile

		switch (h) {

		case ('a'):
		case ('e'):
		case ('i'):
		case ('o'):
		case ('u'):
			System.out.println("Sesli harf");
			break;
		case ('b'):
		case ('c'):
		case ('d'):
		case ('f'):
			System.out.println("Sessiz harf");
			break;
		default:
			System.out.println("Geçerli bir harf giriniz");
		}
	  
	//ÝF ile
		
   if(h == 'a' || h== 'e' || h == 'i' || h == 'o' || h == 'u') {
	   System.out.println("Sesli harf");
   } else if (h== 'b'|| h== 'c' || h== 'd' || h == 'f' ) {
	   System.out.println("Sessiz harf");
   } else {
	   System.out.println("Geçerli bir harf giriniz");
   }
	  
	  
	  
   // ternary ile
   
   
String result =  (h == 'a' || h== 'e' || h == 'i' || h == 'o' || h == 'u') ?  "Sesli harf" :  (h== 'b'|| h== 'c' || h== 'd' || h == 'f' ) ? "Sessiz harf" : "Geçerli bir harf giriniz";  
	  
	  System.out.println(result);
	  
	  
	  
	scan.close();  
	  
		
	}

}
