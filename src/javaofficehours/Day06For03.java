package javaofficehours;

import java.util.Scanner;

public class Day06For03 {

	public static void main(String[] args) {
		
		
		/*
		 * Kullan�c�dan al�nacak Stringin her karakterini sat�r sat�r yazd�ran kodu yazal�m
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
