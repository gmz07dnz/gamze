package day11stringmethods;

import java.util.Scanner;

public class StringSoru03 {

	public static void main(String[] args) {

		/*
		 * 1)Kullanicidan bir String alin 2)Tum rakamlari * a cevirin 3)Bas ve sondaki
		 * tum space'leri silin 4)Aralardaki tum space'leri ! isaretine cevirin 5)a ve z
		 * harflerini buyuk harf, diger tum harfleri kucuk harf yapin 6)En bas'a "(" ve
		 * en sona ")" ekleyin
		 */

		
		
		// 1)Kullanicidan bir String alin	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir String girin");
	String s1= scan.nextLine();
	
	
	// 2)Tum rakamlari * a cevirin
	s1 = s1.replaceAll("\\d", "*");
	
	//3)Bas ve sondaki tum space'leri silin
	
	s1 = s1.trim();
	
	// 4)Aralardaki tum space'leri ! isaretine cevirin
	
    s1 = s1.replaceAll("\\s", "!");
    
    
	//  5) a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin	
		
	s1 = s1.toLowerCase();		
		
	s1 = s1.replace('a', 'A');
	
	s1 = s1.replace('z', 'Z');
	
	// 6)En bas'a "(" ve en sona ")" ekleyin
	
	s1 = "(".concat(s1).concat(")");

	System.out.println(s1);
	
	scan.close();
	
	
	}

}
