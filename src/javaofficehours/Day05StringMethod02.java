package javaofficehours;

import java.util.Scanner;

public class Day05StringMethod02 {

	public static void main(String[] args) {
		
		
		// girilen string degerin tersini yazdýran java kodu
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tersini yazdýrmak için bir kelime giriniz");
		String kelime = scan.nextLine();
	
       String kelimeTers = "";
      
      for(int i =kelime.length()-1; i>=0; i--) {
   	   
   	   kelimeTers=kelimeTers+kelime.charAt(i);
  	   }
	System.out.println(kelimeTers);
		
		// 2.yol
	
		StringBuilder sb1 = new StringBuilder(kelime);
		sb1.reverse();
		System.out.println(sb1);
	
		
		scan.close();
		
		
	}

}
