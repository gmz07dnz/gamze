package javaofficehours;

import java.util.Scanner;

public class Day10PolindromeMu {

	public static void main(String[] args) {
		
		/*
		 * Girilen kelimenin polindrom olup olmadýgýný kontrol ediniz
		 * 
		 * madam
		 * 1234321
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Polindreome olup olmadýgýný kontrol etmek için bir String giriniz.");
		String polindromeMu = scan.nextLine().toLowerCase().replace(" ", "");
//		System.out.println("Girilen kelime: " + polindromeMu);
//		
//		String ters="";
//		for (int i = polindromeMu.length()-1; i>=0; i--) {
//		ters = ters +polindromeMu.charAt(i);
//		}
//		System.out.println("Girilen kelimenin tersi : " +ters);
//		
//		if(polindromeMu.equals(ters)) {
//			System.out.println("Girilen String polindrome'dur " );
//		}else {
//			System.out.println("Girilen String polindrome degildir " );
//		}
//		
		
		
		StringBuilder sb = new StringBuilder(polindromeMu);
		System.out.println("Girilen kelime: " + sb);
		
		sb.reverse();
		
		System.out.println("Girilen kelimenin tersi : " +sb);
		
		if(sb.toString().equals(polindromeMu)) {
			System.out.println("Girilen String polindrome'dur " );
		}else {
			System.out.println("Girilen String polindrome degildir " );
		}
	
		scan.close();
		
	}

}
