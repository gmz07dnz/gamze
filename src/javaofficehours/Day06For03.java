package javaofficehours;

import java.util.Scanner;

public class Day06For03 {

	public static void main(String[] args) {
		
		
		/*
		 * Kullanýcýdan alýnacak Stringin her karakterini satýr satýr yazdýran kodu yazalým
		 * 
		 *  kemal
		 *  k
		 *  e
		 *  m
		 *  a
		 *  l
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String giriniz");
        String str = scan.nextLine().toLowerCase();
        
        System.out.println(str);
        for (int i = 0; i<str.length(); i++) {
        	System.out.println(str.charAt(i));
        }
        
        
        scan.close();
	}

}
