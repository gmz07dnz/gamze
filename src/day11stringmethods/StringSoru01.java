package day11stringmethods;

import java.util.Scanner;

public class StringSoru01 {

	public static void main(String[] args) {

		/*
		 * 1)Kullanicidan password'unu aliniz 
		 * 
		 * 2)Password 
		 * a)Ilk character'i buyuk harf olacak
		 * b)son character'i sayi olacak 
		 * c)en az 6 character uzunlugunda olacak sartlarini sagliyorsa ekrana "Password basariyla olusturuldu" yaziniz
		 * 
		 * 3)Password yukaridaki sartlardan herhangi birini saglamiyorsa
		 * "Tekrar deneyiniz" yazdirin
		 */

		
    // 1)Kullanicidan password'unu aliniz 
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("password giriniz");
		
	String psw = scan.nextLine();
	
		
		
   if ((psw.charAt(0)>='A' && psw.charAt(0)<='Z') && (psw.charAt(psw.length()-1)>='0' && psw.charAt(psw.length()-1)<='9') &&
		   psw.length()>=6) {
	   System.out.println("Password basarýyla olusturuldu");
   }else {
	   System.out.println("Tekrar deneyiniz");
   }
		
   
   scan.close();
   
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
