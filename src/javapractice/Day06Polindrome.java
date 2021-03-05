package javapractice;

import java.util.Scanner;

public class Day06Polindrome {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan bir String alin, palindrome olup olmadigini StringBuilder ile
		 * control eden ve sonucu yazdiran bir method olusturun
		 * 
		 * 
		 * ORNEK: 
		 * INPUT : HANNAH OUTPUT : Girdiginiz cumle/kelime bir palindrome
		 * 
		 */

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Polindrome olup olmadýgýný kontrol etmek için bir String giriniz");
		String word = scan.nextLine().toLowerCase();
		
		polindromeMu(word );
		scan.close();
	}

	public static void polindromeMu(String word) {
		
		StringBuilder sb = new StringBuilder(word);

		
		if (sb.toString().equals(sb.reverse().toString())) {
			System.out.println("Girdiginiz "+ word+ " kelimesi polindrome'dur");
		}else {
			System.out.println("Girdiginiz "+ word+ " kelimesi polindrome deðildir.");
		}
		
		
		
	}
	
	
	
}
