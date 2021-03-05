package javaofficehours;

import java.util.Arrays;
import java.util.Scanner;

public class Day10AnagramArrayIle {

	public static void main(String[] args) {
		
		/*
		 * Anagram, bir kelimenin harflerinden baþka bir kelime oluþturmaya denir.
		 * Kullanýcýdan alýnacak iki kelimenin Anagram durumunu belirleyen Java kodunu
		 * yazýnýz. isAnagram("listen", "Silent") ==> return --> true
		 *                                        ==> return --> false
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen anagram olabilecek 1. kelimeyi yazýnýz");
		String word1 = scan.nextLine().toLowerCase().replace(" ", "");
		System.out.println("Lütfen anagram olabilecek 2. kelimeyi yazýnýz");
		String word2 = scan.nextLine().toLowerCase().replace(" ", "");
		
		System.out.println(isAnagram(word1, word2));
		  
		scan.close();

	}

	public static boolean isAnagram(String word1, String word2) {
	
		if(word1.length() != word2.length()) {
			return false;
		}
		char arr1[] = word1.toCharArray();
		char arr2[] = word2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
//		if(!Arrays.equals(arr1, arr2)) {
//			return false;
//		}
//		return true;
		
		
		for(int i = 0; i<arr1.length; i++) {
			if (arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
}

	
}
