package javaofficehours;

import java.util.Scanner;

public class Day10Anagram {

	public static void main(String[] args) {
		
		/*
		 * Anagram, bir kelimenin harflerinden baþka bir kelime oluþturmaya denir.
		 * Kullanýcýdan alýnacak iki kelimenin Anagram durumunu belirleyen Java kodunu
		 * yazýnýz. isAnagram("listen", "Silent") ==> true
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen anagram olabilecek 1. kelimeyi yazýnýz");
		String word1 = scan.nextLine().toLowerCase().replace(" ", "");
		System.out.println("Lütfen anagram olabilecek 2. kelimeyi yazýnýz");
		String word2 = scan.nextLine().toLowerCase().replace(" ", "");
		
		isAnagram(word1, word2);
		  
		scan.close();
		
	}

	private static void isAnagram(String word1, String word2) {
		int counter = 0;

		if (word1.length() == word2.length()) {
			for (int i = 0; i < word1.length(); i++) {
				if (word2.contains(word1.substring(i, i + 1))) {
					counter++;
				}
			}
			if (counter == word1.length()) {
				System.out.println("Kelimeler anagramdýr");
			} else {
				System.out.println("Kelimeler anagram degildir.");
			}
		} else {
			System.out.println("Kelimeler anagram degildir.");
		}

	}

}
