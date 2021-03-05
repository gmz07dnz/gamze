package javapractice;

import java.util.Scanner;

public class Day03Soru01 {

	public static void main(String[] args) {
		
		
		/*
		 * SORU 1) Kullanicidan 3 harften uzun bir kelime ve 10’dan kucuk bir sayi alin,
		 * Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin 
		 * ORNEK: 
		 * INPUT : Kelime: Mustafa Sayi:3 
		 * OUTPUT : fafafa
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3 harften uzun bir kelime giriniz");
		String word = scan.next();
		
		
		
		if (word.length()>3) {
			System.out.println("10'dan küçük bir pozitif sayý giriniz");
			int num= scan.nextInt();
		for(int i =1; i<=num; i++) {
			for(int k = word.length()-2; k<word.length();k++) {
				System.out.print(word.charAt(k));
			}
		}
		}else {
			System.out.println("3 harften uzun bir kelime giriniz");
		}
	scan.close();
	
	}

}
