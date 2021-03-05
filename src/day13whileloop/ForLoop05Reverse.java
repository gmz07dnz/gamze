package day13whileloop;

import java.util.Scanner;

public class ForLoop05Reverse {

	public static void main(String[] args) {
		
		// kullanýcýdan bir string alýnýz ve o string'in tersini (reverse string) ekrana yazdýrýnýz.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir String giriniz");
		String s = scan.nextLine();
		
		for (int i = s.length()-1; i>=0 ; i--) {
			
			System.out.print(s.charAt(i));
		}
		
		
	scan.close();	
		

	}

}
